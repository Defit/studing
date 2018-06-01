package main;

import model.Account;
import model.Customer;
import model.AccountsFactory.AccountAbstractFactory;
import model.AccountsFactory.CheckingAccountFactory;
import model.AccountsFactory.SavingsAccountFactory;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer=new Customer("Alexey", "Ivanov");
		
		AccountAbstractFactory factory;
		factory=CheckingAccountFactory.getInstance();
		
		for(int i=0;i<10;i++) {
			if(i==5) factory=SavingsAccountFactory.getInstance();
			customer.addAccount(factory.createAccount(i*50, i*5));
		}
		
		for(Account acct : customer) {
			System.out.println(acct);
			System.out.println("======================================");
		}
	}

}
