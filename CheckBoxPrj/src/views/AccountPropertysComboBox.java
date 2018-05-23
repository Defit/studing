package views;

import java.awt.BorderLayout;

import javax.swing.JComboBox;

import actions.ComboBoxCustomerListener;
import models.Customer;;

public class AccountPropertysComboBox extends JComboBox {
	public static String border = BorderLayout.CENTER;

	public AccountPropertysComboBox(Customer customer) {
		super();
		String[] names = { customer.getFirstName(), customer.getLastName() };
		this.addItem(names[0]);
		this.addItem(names[1]);
		this.addActionListener(new ComboBoxCustomerListener());
	}
}
