package com.luxoft.account;


public class CheckingAccount extends AbstractAccount {

	private double overdraft;

	public CheckingAccount(final double amount, final double overdraft) {
		super(amount);
		this.overdraft = overdraft;
	}

	@Override
	public void withdraw(final double amount) {
		if (amount < 0) {
			System.out.println("Amount cannot be less than zero.");
			return;
		}
		
		if (state == AccountState.CLOSED) {
			System.out.println("Account is closed.");
			return;
		}
		
		double overdraftNeeded = amount - this.balance;
		if (overdraft < overdraftNeeded) {
			System.out.println("Overdraft needed is bigger than allowed.");
			return;
		}
		
		// Yes, there is enough balance to cover the amount
		// Proceed as usual
		this.balance = this.balance - amount;
	}

	@Override
	public void deposit(final double amount) {
		if (state == AccountState.CLOSED) {
			System.out.println("Account is closed.");
			return;
		}
		
		if (amount > 0) {
			this.balance += amount;
		}
	}

	public double getOverdraft() {
		return overdraft;
	}
}
