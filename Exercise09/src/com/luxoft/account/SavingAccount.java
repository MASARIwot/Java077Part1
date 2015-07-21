package com.luxoft.account;

//TODO: define class body
public class SavingAccount extends AbstractAccount  {

	public SavingAccount(int x) {
		super(x);
		
	}
	@Override
	public void withdraw(double amount) {
		if (state == AccountState.OPEN) {
			if (x >= amount)
				this.x -= amount;
		}

	}

	

}
