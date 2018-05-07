package com.mybank.batch;

import com.mybank.domain.Bank;
import com.mybank.domain.SavingsAccount;

public class AccumulateSavingsBatch {
	private Bank bank;

	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
	public void doBatch() {
		for(int i=1;i<bank.getNumOfCustomers();i++) {
			for(int j=0;j<bank.getCustomer(i).getNumOfAccounts();j++) {
				if(bank.getCustomer(i).getAccount(j) instanceof SavingsAccount) {
					((SavingsAccount)bank.getCustomer(i).getAccount(j)).accumulateInterest();
				}
			}
		}
	}
}
