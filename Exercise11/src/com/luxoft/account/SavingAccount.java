package com.luxoft.account;


public class SavingAccount extends AbstractAccount {

	public SavingAccount(double amount) {
		super(amount);
	}

	@Override
	public void deposit(final double amount) {
		if (state == AccountState.CLOSED) {
			System.out.println("Account is closed.");
			return;
		}
		
		if (amount < 0) {
			return;
		}
		
		this.balance += amount;
	}

	@Override
	public void withdraw(final double amount)  {
		if (state == AccountState.CLOSED) {
			System.out.println("Account is closed.");
			return;
		}
		
		if (amount < 0) {
			return;
		}
		
		if (this.balance - amount >= 0) {
			this.balance -= amount;
		}
	}
}
