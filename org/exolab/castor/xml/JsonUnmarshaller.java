package org.exolab.castor.xml;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.xml.sax.InputSource;

import com.google.gson.Gson;

public class JsonUnmarshaller extends Unmarshaller {

	public static Object unmarshal(Class c, Reader reader) 
			throws MarshalException {
		try {
			BufferedReader bufreader = new BufferedReader(reader);
			Gson gson = new Gson();
			String jsonStr = new String();
			int simbol;
			while ((simbol = bufreader.read()) != -1)
				jsonStr += (char)simbol;

			Object obj = gson.fromJson(jsonStr, c);
			return obj;
		} catch (IOException except) {
			throw new MarshalException(except);
		}
	}
}
