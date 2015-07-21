package com.luxoft.bank;

import java.util.ArrayList;
import java.util.List;

import com.luxoft.client.Client;

public class Bank {

	private final List<Client> clients = new ArrayList<Client>();

	public List<Client> getClients() {
		return clients;
	}

	@Override
	public String toString() {

		StringBuffer clientsString = new StringBuffer("The bank has: \n");
		for (Client client : clients) {
			clientsString.append(client);
			clientsString.append("\n");
		}
		return clientsString.toString();
	}
}
