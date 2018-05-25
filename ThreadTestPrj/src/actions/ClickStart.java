package actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import controllers.StartController;

public class ClickStart implements ActionListener {

	/**
	 * Start button event handler
	 * Gets and transfers the necessary view elements to the StartController
	 */
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button = (JButton)e.getSource();
		JPanel panel=(JPanel)button.getParent();
		JTextArea areaThreads=(JTextArea) panel.getComponent(0);
		JTextArea areaMonitor=(JTextArea) panel.getComponent(1);
		
		StartController startContr=new StartController();
		startContr.setAreas(areaThreads, areaMonitor);
		startContr.setButton(button);
		
		Thread threadController=new Thread(startContr);
		threadController.start();
	}

}
