package com.luxoft.account;

public class CheckingAccount extends AbstractAccount {

	private double overdraft = 0;

	public CheckingAccount(final double x, final double overdraft) {
		super(x);
		this.overdraft = overdraft;
	}

	@Override
	public void withdraw(double amount) {
		if (state == AccountState.OPEN) {
			if (x >= amount) {
				x -= amount;
			} else if (x < amount && amount <= overdraft) {
				x -= amount;
				this.overdraft -= amount;
			}
		}

	}

	public double getOverdraft() {
		return overdraft;
	}

}
