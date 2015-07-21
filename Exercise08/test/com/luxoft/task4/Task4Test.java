package com.luxoft.task4;

import org.junit.Test;
import static org.junit.Assert.*;

public class Task4Test {
	@Test
	public void testMain() {
		String[] args = {"5"};
		Task4.main(args);
	}
	
	@Test
	public void testAvg() {
		int[] array = {1, 2, 3, 4, 5, 6, 7};
		
		double result = Task4.avg(array);
		
		assertEquals(4, result, 0);
	}
}
