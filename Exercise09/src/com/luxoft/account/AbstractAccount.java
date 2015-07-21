package com.luxoft.account;

//  lsjfngjlsn
public abstract class AbstractAccount implements Account {

	protected double x;
	protected AccountState state = AccountState.OPEN;

	public AbstractAccount(double x) {
		this.x = x;
	}

	@Override
	public void deposit(double amount) {
		if (state == AccountState.OPEN)
			this.x += amount;

	}

	@Override
	public abstract void withdraw(double amount); 

	@Override
	public double getBalance() {
		return this.x;
	}

	@Override
	public void setState(AccountState state) {
		this.state = state;

	}

	@Override
	public boolean isOpen() {
		return state == AccountState.OPEN;
	}

}
