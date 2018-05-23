package actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

import controllers.ComboBoxCustomerController;

public class ComboBoxCustomerListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JComboBox box = (JComboBox)e.getSource();
		int index = box.getSelectedIndex();
		
		switch(index) {
		case 0:
			ComboBoxCustomerController.clickName();
			break;
		case 1: 
			ComboBoxCustomerController.clickFamily();
			break;
		}
	}

}
