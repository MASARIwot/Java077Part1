package com.luxoft.client;

import java.util.ArrayList;
import java.util.List;

import com.luxoft.account.Account;

public class Client {

	private String name;
	private Gender gender;

	private List<Account> accounts = new ArrayList<Account>();

	public Client(final String name, final Gender gender) {
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getSalutation() {
		if (gender != null) {
			return gender.getSalutation() + " " + name;
		} else {
			return name;
		}
	}

	public void addAccount(final Account account) {
		accounts.add(account);
	}

	@Override
	public String toString() {
		StringBuffer accs = new StringBuffer(getSalutation() + " accounts:\n");
		for (Account acc : accounts) {
			accs.append(acc);
			accs.append("\n");
		}
		return accs.toString();
	}

	public List<Account> getAccounts() {
		return accounts;
	}
}
