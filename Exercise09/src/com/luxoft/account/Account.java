package com.luxoft.account;

public interface Account {

	void deposit(double amount);

	void withdraw(double amount);

	double getBalance();

	void setState(AccountState closed);
	
	boolean isOpen();
	
	


	// TODO: add another methods like getBalance();
}
