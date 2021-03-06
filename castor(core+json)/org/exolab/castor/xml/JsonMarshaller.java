package org.exolab.castor.xml;

import java.io.IOException;
import java.io.Writer;

import com.google.gson.Gson;

public class JsonMarshaller extends Marshaller {
	public static void marshal(Object object, Writer out) 
			throws MarshalException {
		if (object == null)
			throw new MarshalException("object must not be null");

		try {
			Gson gson=new Gson();
			String toFile = gson.toJson(object);
			out.write(toFile);
		} catch (IOException except) {
			throw new MarshalException(except);
		}
	}
}
