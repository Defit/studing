package model.xml;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

public class Castor {

	private final static String filename = "data\\ClickControllers.xml";

	/**
	 * 
	 * @param obj - writeable object to static "filename"
	 * @return true | false = success | failure
	 */
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
	
	/**
	 * 
	 * @param c - data type of the read object
	 * @return the resulting object read from the file
	 */
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
