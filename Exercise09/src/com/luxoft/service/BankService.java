package com.luxoft.service;

import com.luxoft.bank.Bank;
import com.luxoft.client.Client;
import com.luxoft.client.Gender;

public class BankService {

	public Bank createNewBank() {
		return new Bank();
	}

	public Client addClient(final Bank bank, String name, Gender male) {
		Client client = new Client(name, male);
		bank.getClient().add(client);
		return client;
	}

}
