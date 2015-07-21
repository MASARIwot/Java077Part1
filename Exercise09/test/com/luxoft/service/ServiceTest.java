package com.luxoft.service;

import org.junit.Test;

import static org.junit.Assert.*;

import com.luxoft.bank.Bank;
import com.luxoft.client.Client;
import com.luxoft.client.Gender;

public class ServiceTest {
	@Test
	public void testAddClient() {
		BankService service = new BankService();
		Bank bank = service.createNewBank();
		Client client = service.addClient(bank, "John", Gender.MALE);
		
		assertTrue(client.getName().equals("John"));
		assertTrue(client.getSalutation().equals("Mr. John"));
	}
}
