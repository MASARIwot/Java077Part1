package com.luxoft.account;

public abstract class AbstractAccount implements Account {
	protected double balance;
	protected AccountState state;

	public AbstractAccount(final double amount) {
		this.balance = amount;
		state = AccountState.OPEN;
	}

	@Override
	public double getBalance() {
		return balance;
	}	
	
	@Override
	public void setState(final AccountState state) {
		this.state = state;
	}
	
	@Override
	public boolean isOpen() {
		return state == AccountState.OPEN;
	}
}
