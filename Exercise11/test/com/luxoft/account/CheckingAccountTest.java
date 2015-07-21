package com.luxoft.account;

import static org.junit.Assert.*;
import org.junit.Test;
import com.luxoft.account.Account;
import com.luxoft.account.AccountState;
import com.luxoft.account.CheckingAccount;
import com.luxoft.exception.AccountIsClosedException;
import com.luxoft.exception.BankException;
import com.luxoft.exception.NotEnoughFundsException;

public class CheckingAccountTest {

	@Test
	public void testDeposit() {

		Account account = new CheckingAccount(100, 50);
		assertEquals(100.0, account.getBalance(), 0);
		
		try {
			account.deposit(11);
			assertEquals(111.0, account.getBalance(), 0);
		} catch (AccountIsClosedException e1) {
			assertTrue(false);
		}
		
		
		try {
			account.deposit(-10);
			assertTrue(false);
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		} catch (AccountIsClosedException e) {
			assertTrue(false);
		}
		
		account.setState(AccountState.CLOSED);
		
		try {
			account.deposit(10);
			assertTrue(false);
		} catch (AccountIsClosedException e) {
			assertTrue(true);
		}
		
		try {
			new CheckingAccount(-10, 5);
			assertTrue(false);
		} catch(IllegalArgumentException e) {
			assertTrue(true);
		}
		
		try {
			new CheckingAccount(10, -5);
			assertTrue(false);
		} catch(IllegalArgumentException e) {
			assertTrue(true);
		}
	}

	@Test
	public void testWithdraw() {
		Account account = new CheckingAccount(100, 10);

		assertEquals(100.0, account.getBalance(), 0);
		try {
			account.withdraw(10);
			assertEquals(90.0, account.getBalance(), 0);
		} catch (BankException e1) {
			assertTrue(false);
		}

		try {
			account.withdraw(90);
			assertEquals(0.0, account.getBalance(), 0);
		} catch (BankException e) {
			assertTrue(false);
		}
		
		try {
			account.withdraw(190);
			assertTrue(false);
		} catch (NotEnoughFundsException e) {
			assertTrue(true);
		} catch (BankException e) {
			assertTrue(false);
		}

	}

}
