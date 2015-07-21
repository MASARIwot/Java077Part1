package com.luxoft.task6;

public class TextModifier {
	public static void main(String[] args) {
		/**/

	}
	
	public static String processString(final String source) {
		//TODO: iterate source string and create array of chars
		String source2 = source.replaceAll("[0-9]","").replace("+","++").replace("-","--");
				//TODO: return new string
		return  source2;
	}
}
