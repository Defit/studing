package model.AccountsFactory;

import model.Account;

public interface AccountAbstractFactory {
	public Account createAccount(double initBalance, double param);
}
