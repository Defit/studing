package actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;

import javax.swing.JButton;
import javax.swing.JPanel;

import controllers.ClickController;
import model.DoubleArray;
import model.xml.Castor;

/**
 * Class listening to all button events
 */
public class ClickListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button=(JButton) e.getSource();
		JPanel panel =(JPanel) button.getParent();
		
		String namePanel = panel.getName();
		
		Castor castor=new Castor();
		DoubleArray array=(DoubleArray)castor.read(DoubleArray.class);
		
		String nameMethod= array.getMethod(namePanel);
		
		ClickController controller=new ClickController();
		
		try {
			
			Method method = ClickController.class.getMethod(nameMethod, JPanel.class);
			method.invoke(controller, panel);
			
		} catch (Exception exc) {
			// TODO Auto-generated catch block
			exc.printStackTrace();
		}
	}

}
