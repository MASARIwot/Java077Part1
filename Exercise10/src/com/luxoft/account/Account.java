package com.luxoft.account;


public interface Account {

	void deposit(double amount);

	void withdraw(double amount);

	boolean isOpen();

	double getBalance();
	
	void setState(AccountState state);
}
