package com.luxoft.client;

public class Client {
	private String name;
	private Gender male;

	public Client(String name, Gender male) {
		this.name = name;
		this.male = male;
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
