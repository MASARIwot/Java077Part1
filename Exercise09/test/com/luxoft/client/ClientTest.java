package com.luxoft.client;

import org.junit.Test;
import static org.junit.Assert.*;

public class ClientTest {
	@Test
	public void testSalutation() {
		Client client = new Client("John", Gender.MALE);
		String expectedSalutation = "Mr. John";
		assertTrue(expectedSalutation.equals(client.getSalutation()));
		
		client = new Client("Mary", Gender.FEMALE);
		expectedSalutation = "Ms. Mary";
		assertTrue(expectedSalutation.equals(client.getSalutation()));
	}
}
