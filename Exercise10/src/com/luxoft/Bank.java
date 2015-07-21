package com.luxoft;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	private final List<Client> clients = new ArrayList<Client>();
	private List<ClientRegistrationListener> listeners = new ArrayList<ClientRegistrationListener>();

	public Client addClient(final Client client) {
		clients.add(client);

		// TODO: iterate a list of listeners and notify about new client
		return client;
	}

}
