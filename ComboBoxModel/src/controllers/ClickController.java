package controllers;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JPanel;

/**
 * Class of controller that handles button presses
 */
public class ClickController {
	
	public ClickController() {}
	
	/**
	 * Processing the event of pressing the first button
	 * @param panel - Jpanel on which the button is located
	 */
	public void clickButtonOne(JPanel panel) {
		System.out.println("clickButtonOne");
		JComboBox combobox= (JComboBox) panel.getComponent(1);
		if(combobox.getBackground() == Color.GREEN)
			combobox.setBackground(Color.LIGHT_GRAY);
		else combobox.setBackground(Color.GREEN);
	}
	
	/**
	 * Processing the event of pressing the second button
	 * @param panel - Jpanel on which the button is located
	 */
	public void clickButtonTwo(JPanel panel) {
		System.out.println("clickButtonTwo");
		JComboBox combobox= (JComboBox) panel.getComponent(1);
		if(combobox.getForeground() == Color.BLACK)
			combobox.setForeground(Color.YELLOW);
		else combobox.setForeground(Color.BLACK);
	}
	
	/**
	 * Processing the event of pressing the third button
	 * @param panel - Jpanel on which the button is located
	 */
	public void clickButtonThree(JPanel panel) {
		System.out.println("clickButtonThree");
		JComboBox combobox= (JComboBox) panel.getComponent(1);
		if(combobox.isVisible() == true)
			combobox.setVisible(false);
		else combobox.setVisible(true);
	}
	
}
