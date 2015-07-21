package com.luxoft.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.luxoft.bank.Bank;
import com.luxoft.client.Gender;
import com.luxoft.exception.ClientExistsException;

public class BankServiceTest {

	@Test
	public void test() {
		BankService service = new BankService();
		Bank bank = service.createNewBank();
		
		try {
			service.addClient(bank, "John", Gender.MALE);
			assertTrue(true);
		} catch (ClientExistsException e) {
			assertTrue(false);
		}
		
		try {
			service.addClient(bank, "John", Gender.MALE);
			assertTrue(false);
		} catch (ClientExistsException e) {
			assertTrue(true);
		}
	}

}
