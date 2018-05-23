package models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank implements Iterable<Customer> {

	private static List<Customer> customers;

	public Bank() {
		customers = new ArrayList<Customer>();
	}

	public static void addCustomer(String firstName, String lastName) {
		customers.add(new Customer(firstName, lastName));
	}

	public static int getNumOfCustomers() {
		// TODO Auto-generated method stub
		return customers.size();
	}

	public static Customer getCustomer(int i) {
		// TODO Auto-generated method stub
		if (i <= 0 && i > customers.size())
			return null;
		return customers.get(i);
	}

	@Override
	public Iterator<Customer> iterator() {
		Iterator<Customer> it = new Iterator<Customer>() {

			private int currentIndex = 0;

			@Override
			public boolean hasNext() {
				return (currentIndex < customers.size()) && (customers.get(currentIndex) != null);
			}

			@Override
			public Customer next() {
				return customers.get(currentIndex++);
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
		return it;
	}

}
