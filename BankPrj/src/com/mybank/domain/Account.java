package com.mybank.domain;

/**
 *
 * @author student
 */
public class Account {
	protected double balance;

	/** Creates a new instance of Account */
	protected Account(double initBalance) {
		balance = initBalance;
	}

	public double getBalance() {
		return balance;
	}

	public boolean deposit(double amt) {
		if (amt > 0) {
			balance = balance + amt;
			return true;
		}
		return false;
	}

	public boolean withdraw(double amt) {
		if (balance >= amt) {
			balance = balance - amt;
			return true;
		} else
			return false;
	}
}
