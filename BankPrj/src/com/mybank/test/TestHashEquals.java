package com.mybank.test;

import com.mybank.domain.*;

public class TestHashEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount account1=new CheckingAccount(100, 2);
		CheckingAccount account2=new CheckingAccount(100, 2);
		
		System.out.println(account1.equals(account2));
		System.out.println(account1.hashCode());
		System.out.println(account2.hashCode());
		
		System.out.println();
		
		account1.deposit(10);
		System.out.println(account1.equals(account2));
		System.out.println(account1.hashCode());
		System.out.println(account2.hashCode());
	}

}
