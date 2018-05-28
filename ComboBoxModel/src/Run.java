import model.DoubleArray;
import model.xml.Castor;
import views.MainFrame;

/**
 * Class is starting app 
 */
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainFrame();
		
		/* uncomment for rewrite xml
		DoubleArray da=new DoubleArray(3);
		da.add("PanelOne", "clickButtonOne");
		da.add("PanelTwo", "clickButtonTwo");
		da.add("PanelThree", "clickButtonThree");
		Castor c=new Castor();
		c.write(da);
		*/
	}

}
