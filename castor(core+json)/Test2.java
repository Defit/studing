import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;

import org.exolab.castor.xml.JsonMarshaller;
import org.exolab.castor.xml.JsonUnmarshaller;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    try {
	        CD sessions = new CD("Sessions for Robert J", "Eric Clapton");
	        sessions.addTrack("Little Queen of Spades");
	        sessions.addTrack("Terraplane Blues");
	   
	        Writer writer = new FileWriter("data\\cds.json");
	        JsonMarshaller.marshal(sessions, writer);
	        writer.close();
	      } catch (Exception e) {
	        System.err.println(e.getMessage());
	        e.printStackTrace(System.err);
	      }
	    
	    try {
	    	Reader reader = new FileReader("data\\cds.json");
	        CD cd = (CD)JsonUnmarshaller.unmarshal(CD.class, reader);
	        System.out.println("CD title: " + cd.getName());
	        System.out.println("CD artist: " + cd.getArtist());
	        List tracks = cd.getTracks();
	        if (tracks == null) {
	          System.out.println("No tracks.");
	        } else {
	          for (Iterator i = tracks.iterator(); i.hasNext(); ) {
	            System.out.println("Track: " + i.next());
	          }
	        }
	      } catch (Exception e) {
	        System.err.println(e.getMessage());
	        e.printStackTrace(System.err);
	      }
	}

}
