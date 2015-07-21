package com.luxoft.task1;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
	@Test		
	public void testMain() {
		String[] args = new String[3];
		args[0] = "2";
		args[1] = "+";				
		args[2] = "2";
		Calculator.main(args);
	}
	
	@Test
	public void testAdd() {
		double result = Calculator.evaluate(2, 5, '+');
		assertEquals(2 + 5, result, 0);
	}
	
	@Test
	public void testSub() {
		double result = Calculator.evaluate(12, 5, '-');
		assertEquals(12 - 5, result, 0);
	}
	
	@Test
	public void testMult() {
		double result = Calculator.evaluate(2, 5, '*');
		assertEquals(2 * 5, result, 0);
	}
	
	@Test
	public void testDiv() {
		double result = Calculator.evaluate(12, 3, '/');
		assertEquals(12 / 3, result, 0);
	}
}

