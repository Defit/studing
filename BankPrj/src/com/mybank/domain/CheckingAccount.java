package com.mybank.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

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

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return new HashCodeBuilder(17, 37).appendSuper(super.hashCode()).append(overdraftAmount).toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof CheckingAccount))
			return false;
		if (obj == this)
			return true;

		CheckingAccount account2 = (CheckingAccount) obj;

		return new EqualsBuilder().appendSuper(super.equals(obj)).append(overdraftAmount, account2.overdraftAmount)
				.isEquals();
	}
}
