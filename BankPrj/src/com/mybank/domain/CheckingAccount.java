package com.mybank.domain;

public class CheckingAccount extends Account {

	private double overdraftAmount;

	public CheckingAccount(double initBalance, double overdraftAmount) {
		super(initBalance);
		this.overdraftAmount = overdraftAmount;
		// TODO Auto-generated constructor stub
	}

	public CheckingAccount(double initBalance) {
		this(initBalance, 0);
		// TODO Auto-generated constructor stub
	}

	// ~
	public boolean withdraw(double amt) {
		double overdraftNeeded;
		if (super.getBalance() < amt) {
			overdraftNeeded = amt - getBalance();
			if (overdraftAmount < overdraftNeeded) {
				return false;
			} else {
				super.withdraw(super.getBalance());
				overdraftAmount -= overdraftNeeded;
			}

		} else {
			super.withdraw(amt);
		}
		return true;
	}
}
