package com.luxoft;
//TODO: define array consisting on 5 elements
public class Arrays {
	public static void main(String[] args) {
		try {
			int[] array = { 61, 2, 39, 4, 5 };
			System.out.println(array[2] + " size: " + array.length);
			@SuppressWarnings("unused")
			int a = array[6];
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("END :( of the program");
	}
}
