package com.luxoft.task7;

public class Task7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sameCod ="sd// gs g //ji/*ijip*/jefi \n" +
				"sdsfsd// gs g //ji/*ijip*/jefis \n" +
				"sd// gs g //ji/*ijip*/jefi \n";
		sameCod = sameCod.replaceAll("//","").replace("/*","").replace("*/","");
		System.out.println(sameCod);

	}

}
