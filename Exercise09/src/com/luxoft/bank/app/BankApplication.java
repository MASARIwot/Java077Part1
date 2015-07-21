package com.luxoft.bank.app;

import java.util.ArrayList;

import com.luxoft.account.Account;
import com.luxoft.account.CheckingAccount;
import com.luxoft.account.SavingAccount;
import com.luxoft.bank.Bank;
import com.luxoft.client.Client;
import com.luxoft.client.Gender;
import com.luxoft.service.BankService;

public class BankApplication {

	public static void main(String... args){
		Bank bank = new Bank();
		ArrayList<Account> accountList  = null;
		BankService bankService = new BankService();
		Account bal =  new CheckingAccount(200, 100);
		Account bal2 =  new SavingAccount(100);
		accountList= bankService.addClient(bank, "Sasha", Gender.FEMALE).getAccountList();
		accountList.add(bal);
		accountList.add(bal);
		accountList.add(bal2);
		bankService.addClient(bank, "Sasha2", Gender.FEMALE).getAccountList().add(bal);
		bankService.addClient(bank, "Sasha3", Gender.FEMALE).getAccountList().add(bal);
		System.out.println(bank.getClient().toString());
	}
	
}
