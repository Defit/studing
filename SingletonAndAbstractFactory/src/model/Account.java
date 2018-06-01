package model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

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

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return new HashCodeBuilder(17, 37).append(balance).toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Account))
			return false;
		if (obj == this)
			return true;

		Account account2 = (Account) obj;

		return new EqualsBuilder().append(balance, account2.balance).isEquals();
	}
}
