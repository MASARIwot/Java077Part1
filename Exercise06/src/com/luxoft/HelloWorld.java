package com.luxoft;

import com.luxoft.presentation.MessagePrinterMy;
import com.luxoft.presentation.PrinterMy;

public class HelloWorld {
	static int i = 8;
	static String str = "ddd";
	

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String g;
		g= str;
		g= "khr";
		int c;
		c = 6 + i;
//		g.
		byte d = (byte) -400;
		System.out.println(d);
		
		MessagePrinterMy messagePrinterMy = new PrinterMy();
		messagePrinterMy.sayHello();
		messagePrinterMy.sayHello(" Bumbastic I ");
	}
}
