package com.luxoft.account;

import org.junit.Test;


import static org.junit.Assert.*;

public class CheckingAccountTest  {

	@Test	
	public void testDeposit() {
		Account account = new CheckingAccount(100, 0);
		assertEquals(100.0, account.getBalance(), 0);

		account.deposit(11);
		assertEquals(111.0, account.getBalance(), 0);
		
		account.setState(AccountState.CLOSED);
		account.deposit(10);
		assertEquals(111.0, account.getBalance(), 0);
	}
	
	@Test
	public void testWithdraw() {
		Account account = new CheckingAccount(100, 10);
		
		assertEquals(100.0, account.getBalance(), 0);
		assertEquals(10.0, ((CheckingAccount)account).getOverdraft(), 0);

		account.withdraw(10);
		assertEquals(90.0, account.getBalance(), 0);
		
		account.withdraw(90);
		assertEquals(0.0, account.getBalance(), 0);
		
		account.withdraw(5);
		assertEquals(-5.0, account.getBalance(), 0);
		
		account.withdraw(50);
		assertEquals(-5.0, account.getBalance(), 0);
		
	}

}
