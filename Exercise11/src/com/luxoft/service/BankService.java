package com.luxoft.service;

import com.luxoft.bank.Bank;
import com.luxoft.client.Client;
import com.luxoft.client.Gender;

public class BankService  {

	public Client addClient(final Bank bank, final String name,
			final Gender gender) {
		Client client = new Client(name, gender);
		bank.getClients().add(client);
		return client;
	}

	public Bank createNewBank() {
		Bank bank = new Bank();
		return bank;
	}
	
	public Client findClientByName(final Bank bank, final String name) {
		for (int i = 0; i < bank.getClients().size(); i++) {
			if (bank.getClients().get(i).getName().compareToIgnoreCase(name) == 0)
				return bank.getClients().get(i);
		}
		
		return null;
	}
}
