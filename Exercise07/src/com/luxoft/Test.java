package com.luxoft;

public class Test 
{        
        /**********************************************************************
         * Main function.
         */
	public static void main(String[] args) 
        {
		int v1 = 3;
		byte v2 = (byte) v1;
		System.out.println(v2);
		v1 = 257;
		byte v3 = (byte) v1;
		System.out.println(v3);
		int v4 = 's';
		System.out.println(v4);
		
		byte v5 = 115;
		if (v5 == 's')
                {
			System.out.println("Equals");
		}
		
		//TODO: What exactly will be printed?
		System.out.println(4);
		
		//TODO: What exactly will be printed?
		double d = 5;
		System.out.println(d + 1);
		
//		boolean b = ()v4;
		
		String v6 = "short";		
		float v7 = 3.67f;		
		float v9 = 3; //TODO: Why there is no compilation error?		
//		int v8 = v7;
		
		int[] array = new int[27];		
	}
}
