import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
//import org.apache.xml.serializer.x
import java.util.List;

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

import com.google.gson.Gson;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    try {
	        CD sessions = new CD("Sessions for Robert J", "Eric Clapton");
	        sessions.addTrack("Little Queen of Spades");
	        sessions.addTrack("Terraplane Blues");
	   
	        FileWriter writer = new FileWriter("data\\cds.xml");
	        Marshaller.marshal(sessions, writer);
	        writer.close();
	      } catch (Exception e) {
	        System.err.println(e.getMessage());
	        e.printStackTrace(System.err);
	      }
	    
	    try {
	        FileReader reader = new FileReader("data\\cds.xml");
	        CD cd = (CD)Unmarshaller.unmarshal(CD.class, reader);
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
