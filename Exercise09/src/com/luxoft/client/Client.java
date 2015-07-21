package com.luxoft.client;

import java.util.ArrayList;

import com.luxoft.account.Account;

public class Client {
	private String name;
	private Gender male;
	private ArrayList<Account> accounts = new ArrayList<Account>();

	public Client(String name, Gender male) {
		this.name = name;
		this.male = male;
	}
	
	@Override
	public String toString() {
		return "Client [name=" + name + ", male=" + male + ", Number of accounts="
				+ accounts.size() + "]";
	}

	public Account getAccount(final int id) {
		return  accounts.get(id);
	}
	public ArrayList<Account> getAccountList() {
		return  accounts;
	}

	public void addAccount(final Account account) {
		accounts.add(account);
	}

	public String getClientSalutation() {
		return male.toString() + " " + name;
	}

	public Object getSalutation() {
		return male.toString() + " " + name;
	}

	public String getName() {
		return this.name;
	}

}
