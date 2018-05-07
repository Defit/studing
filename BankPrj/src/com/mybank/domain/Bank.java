package com.mybank.domain;

public class Bank {

	private Customer[] customers;
	private int numCustomers;

	public Bank() {
		customers = new Customer[10];
		numCustomers = 0;
	}

	public void addCustomer(String string, String string2) {
		// TODO Auto-generated method stub
		if (numCustomers >= 10)
			return;
		customers[numCustomers] = new Customer(string, string2);
		numCustomers++;
	}

	public int getNumOfCustomers() {
		// TODO Auto-generated method stub
		return numCustomers;
	}

	public Customer getCustomer(int i) {
		// TODO Auto-generated method stub
		if (i <= 0 && i > numCustomers)
			return null;
		return customers[i];
	}

}
