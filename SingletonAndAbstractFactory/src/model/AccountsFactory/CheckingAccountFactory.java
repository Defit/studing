package model.AccountsFactory;

import model.Account;
import model.CheckingAccount;

public class CheckingAccountFactory implements AccountAbstractFactory {

	private CheckingAccountFactory() {
	}

	private static class CheckingAccountFactoryHolder {
		public static final CheckingAccountFactory instance = new CheckingAccountFactory();
	}

	public static CheckingAccountFactory getInstance() {
		return CheckingAccountFactoryHolder.instance;
	}
	
	@Override
	public Account createAccount(double initBalance, double overdraftAmount) {
		// TODO Auto-generated method stub
		return new CheckingAccount(initBalance,overdraftAmount);
	}

}
