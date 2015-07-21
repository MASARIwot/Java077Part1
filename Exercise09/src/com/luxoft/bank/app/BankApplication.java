package com.luxoft.bank.app;

import com.luxoft.bank.Bank;
import com.luxoft.client.Client;
import com.luxoft.client.Gender;
import com.luxoft.service.BankService;

public class BankApplication {

	public static void main(String... args){
		Bank bank = new Bank();
		BankService bankService = new BankService();
		bankService.addClient(bank, "Sasha", Gender.FEMALE);
	}
	
}
