package models.serializable;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

public class Castor {

	private final static String filename = "data\\accounts.xml";

	public static boolean write(Object obj) {
		try {
			Writer writer = new FileWriter(filename);
			Marshaller.marshal(obj, writer);
			writer.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace(System.err);
			return false;
		}
		return true;
	}

	public static Object read(Class c) {
		Object obj = null;
		try {
			Reader reader = new FileReader(filename);
			obj = Unmarshaller.unmarshal(c, reader);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace(System.err);
		}
		return obj;
	}

}
