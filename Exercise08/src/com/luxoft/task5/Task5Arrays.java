package com.luxoft.task5;

import java.util.Random;

public class Task5Arrays {
	public static int randInt(int min, int max) {

		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}

	public static void main(String[] args) {

		int array[] = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = randInt(1, 10);
		}
		int three = 0;
		int seven = 0;
		int niga = 0;
		for (int i = 0; i < array.length; i++) {

			if (array[i] == 3)
				three++;
			else if (array[i] == 7)
				seven++;
			else if (array[i] == 9)
				niga++;

		}

		// TODO: print the following
		System.out.println("Number of 3: " + three);
		System.out.println("Number of 7: " + seven);
		System.out.println("Number of 9: " + niga);
	}
}
