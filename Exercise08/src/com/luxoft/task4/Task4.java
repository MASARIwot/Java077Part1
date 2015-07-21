package com.luxoft.task4;

public class Task4 {

	public static void main(String[] args) {
		//TODO: get array length
		int n =0;
		if(args.length != 0) n = Integer.parseInt(args[0]);
		else n = 50;
		
		//TODO: create array
		int[] array = new int[n];
		
		//TODO: initialize array values
		for(int i = 0; i < array.length; i++) array[i] = i;
		
		//TODO: call avg method
		double result = avg(array);
		System.out.println(result);
		//TODO: print result
	}
	
	public static double avg(int[] array) {
		double sum = 0;
		for(int i = 0; i < array.length; i++){sum += array[i];}
		sum = sum/array.length;
		
		return sum;
	}
}
