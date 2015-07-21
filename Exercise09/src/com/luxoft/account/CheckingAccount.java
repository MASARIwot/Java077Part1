package com.luxoft.account;

public class CheckingAccount extends AbstractAccount implements Account {

	private double overdraft;
	// TODO: define constructor public CheckingAccount(final double amount,
	// final double overdraft) {

	public CheckingAccount(int i, int j) {
		// TODO Auto-generated constructor stub
	}

	public double getOverdraft() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isOpen() {
		// TODO Auto-generated method stub
		return false;
	}

}
