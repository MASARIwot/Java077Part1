package com.luxoft;

import java.util.Scanner;

public  class StringTest {

	public StringTest() {

	}

	public static void recPrint(String[] str, int start) {

		if (start < str.length) {
			System.out.println(str[start]);
			recPrint(str, ++start);
		}

	}

	public static void main(String[] args) {
		String fio;
		fio = new Scanner(System.in).nextLine();

		String[] fio2 = fio.split(" ");

		for (int i = 0; i < fio2.length; i++) {
			System.out.println(fio2[i]);
		}
		System.out.println("length: " + fio2.length);
		recPrint(fio2, 0);

	}

}
