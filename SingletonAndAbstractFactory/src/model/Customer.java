package model;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Customer implements Iterable<Account> {
	private String firstName;
	private String lastName;
	private List<Account> account;

	public Customer(String f, String l) {
		account = new ArrayList<Account>();
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
		return account.get(0);
	}

	public Account getAccount(int indexAcct) {
		return account.get(indexAcct);
	}

	public void setAccount(Account acct) {
		account.set(0, acct);
	}

	/**
	 * Replaces the element at the specified position in this list 
	 * with the specified element (optional operation).
	 * @param acct - Account to be stored at the specified position
	 * @param indexAcct - index of the Account to replace
	 */
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
