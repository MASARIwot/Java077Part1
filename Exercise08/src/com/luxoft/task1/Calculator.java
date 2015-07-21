package com.luxoft.task1;

import java.util.Scanner;


public class Calculator {
//	Integer dd = new Integer(10000);
	public static void main(String[] args) {
		String[] fio2;
		//TODO: analyze number of arguments
		if((args.length == 0)){
		fio2 = new Scanner(System.in).nextLine().split(" ");
//		char[] fio2 = new Scanner(System.in).nextLine().replaceAll(" ", "").toCharArray();
		}else fio2 = args;
		
		if(!(fio2.length < 3)){
		//TODO: get arguments
			try{
				double operand1 = Double.parseDouble(String.valueOf(fio2[0]));
				double operand2 = Double.parseDouble(String.valueOf(fio2[2]));
				char operation =  fio2[1].charAt(0);
				//TODO: call evaluate method
				double result = evaluate(operand1, operand2, operation);
				
				//TODO: print result at console like:
				System.out.println("Result: " + result);
			}catch(NumberFormatException e){
				e.printStackTrace();
				}
		
		}else System.out.println("arg problem");
	}

	public static double evaluate(double num1, double num2, char operation) {
		double result = 0;
		switch (operation) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case '^':
			result = (int) Math.pow(num1, num2);
			break;
		default:
			System.out.print("invailid");
		}
		return result;
	}
}
