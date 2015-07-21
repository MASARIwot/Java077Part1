package com.luxoft.bank;
import java.util.ArrayList;

import com.luxoft.client.Client;

public class Bank {
	
	private final ArrayList<Client> client = new ArrayList<Client>();

	public ArrayList<Client> getClient() {
		return client;
	}
	
	@Override
	public String toString() {
		return "Bank [client=" + client + "]";
	}


}
