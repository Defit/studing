package com.mybank.domain;

public class Customer {
	private String firstName;
	private String lastName;
	private Account[] account;
	private int numAccts;

	public Customer(String f, String l) {
		numAccts = 0;
		account = new Account[10];
		firstName = f;
		lastName = l;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Account getAccount() {
		return account[0];
	}

	public Account getAccount(int indexAcct) {
		return account[indexAcct];
	}

	public void setAccount(Account acct) {
		account[0] = acct;
	}

	public void setAccount(Account acct, int indexAcct) {
		account[indexAcct] = acct;
	}

	public void addAccount(Account newAcc) {
		// TODO Auto-generated method stub
		account[numAccts] = newAcc;
		numAccts++;
	}

	public int getNumOfAccounts() {
		// TODO Auto-generated method stub
		return numAccts;
	}
}
