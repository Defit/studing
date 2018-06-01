package model.AccountsFactory;

import model.Account;
import model.SavingsAccount;

public class SavingsAccountFactory implements AccountAbstractFactory {

	private SavingsAccountFactory() {
	}

	private static class SavingsAccountFactoryHolder {
		public static final SavingsAccountFactory instance = new SavingsAccountFactory();
	}

	public static SavingsAccountFactory getInstance() {
		return SavingsAccountFactoryHolder.instance;
	}

	@Override
	public Account createAccount(double initBalance, double interestRate) {
		// TODO Auto-generated method stub
		return new SavingsAccount(initBalance, interestRate);
	}

}
