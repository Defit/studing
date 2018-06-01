package model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

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

	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Savings account \nBalance : " + super.balance + 
				"\nInterest rate : " + interestRate;
	}
}
