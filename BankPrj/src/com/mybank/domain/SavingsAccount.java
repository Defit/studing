package com.mybank.domain;

public class SavingsAccount extends Account {
	private double interestRate;

	public SavingsAccount(double initBalance, double interestRate) {
		super(initBalance);
		this.interestRate = interestRate;
		// TODO Auto-generated constructor stub
	}

	public void accumulateInterest() {
		balance += balance * (interestRate / 12);
	}
}
