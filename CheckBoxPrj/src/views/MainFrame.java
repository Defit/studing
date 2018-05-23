package views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import models.Customer;
import sun.invoke.empty.Empty;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = -75488799438742413L;
	private static String name = "Checking account to ComboBox";
	private AccountPropertysComboBox comboBox;
	private JPanel panel;
	public static TextAreaCustomer customerTA;

	public MainFrame(Customer customer) {
		super(name);
		customerTA=new TextAreaCustomer("None");
		comboBox = new AccountPropertysComboBox(customer);
		this.setPreferredSize(new Dimension(200, 80));
		this.setLayout(new BorderLayout());
		
		panel=new JPanel(new GridLayout(1, 2));
		panel.add(comboBox);
		panel.add(customerTA);
		this.add(panel);
		this.pack();
		this.setVisible(true);
	}
}
