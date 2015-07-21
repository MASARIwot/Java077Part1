package com.luxoft.cli;

import com.luxoft.account.Account;
import com.luxoft.account.CheckingAccount;
import com.luxoft.account.SavingAccount;
import com.luxoft.bank.Bank;
import com.luxoft.client.Client;
import com.luxoft.client.Gender;
import com.luxoft.service.BankService;

public class BankApplication {
	
	private static BankService bankService;

	public static void main(final String[] args) {
		bankService = new BankService();
		
		Bank bank = bankService.createNewBank();
		Client client1 = bankService.addClient(bank, "John", Gender.MALE);
		Account account1 = new SavingAccount(100);
		Account account2 = new CheckingAccount(100, 0);
		client1.addAccount(account1);
		client1.addAccount(account2);

		Client client2 = bankService.addClient(bank, "Miranda", Gender.FEMALE);
		Account account3 = new SavingAccount(50);
		Account account4 = new CheckingAccount(75, 20);
		client2.addAccount(account3);
		client2.addAccount(account4);

		account1.deposit(100);

		account4.withdraw(90);

		account4.withdraw(10);
	}
}
