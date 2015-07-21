package com.luxoft.client;

public enum Gender {
	MALE("Mr."), FEMALE("Ms.");

	private String sex;

	Gender(String sex) {
		this.sex = sex;
	}

	public String toString() {
//		String s = name();
//		s += sex;
		return sex;
	}
	
//	public static void main(String... args) {
//		System.out.println(Gender.FEMALE.toString());
//	}

}
