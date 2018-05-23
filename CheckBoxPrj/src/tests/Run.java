package tests;

import models.Customer;
import models.serializable.Castor;
import views.MainFrame;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer;
		customer = (Customer) Castor.read(Customer.class);
		MainFrame frame = new MainFrame(customer);
	}

}
