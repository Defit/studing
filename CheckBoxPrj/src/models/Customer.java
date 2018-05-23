package models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Iterator;

public class Customer implements Iterable<Account> {
	@Getter
	@Setter
	private String firstName;
	@Getter
	@Setter
	private String lastName;
	private List<Account> account;

	public Customer() {
		account = new ArrayList<Account>();
	}

	public Customer(String f, String l) {
		account = new ArrayList<Account>();
		firstName = f;
		lastName = l;
	}

	public Account getAccount() {
		return account.get(0);
	}

	public Account getAccount(int indexAcct) {
		return account.get(indexAcct);
	}

	public void setAccount(Account acct) {
		account.set(0, acct);
	}

	public void setAccount(Account acct, int indexAcct) {
		account.set(indexAcct, acct);
	}

	public void addAccount(Account newAcc) {
		// TODO Auto-generated method stub
		account.add(newAcc);
	}

	public int getNumOfAccounts() {
		// TODO Auto-generated method stub
		return account.size();
	}

	@Override
	public Iterator<Account> iterator() {
		Iterator<Account> it = new Iterator<Account>() {

			private int currentIndex = 0;

			@Override
			public boolean hasNext() {
				return (currentIndex < account.size()) && (account.get(currentIndex) != null);
			}

			@Override
			public Account next() {
				return account.get(currentIndex++);
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
		return it;
	}
}
