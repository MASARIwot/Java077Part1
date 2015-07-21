package com.luxoft.task6;

import org.junit.Test;
import static org.junit.Assert.*;

public class TextModifierTest {
	@Test		
	public void testMain() {
		String[] args = {"a-3b+c+"};
		TextModifier.main(args);
	}
	
	@Test
	public void testProcessString() {
		String source = "a-3bC+-+345f";
		String expectedResult = "a--bC++--++f";
		String result = TextModifier.processString(source);
		
		assertTrue(expectedResult.equals(result));
	}
	
}
