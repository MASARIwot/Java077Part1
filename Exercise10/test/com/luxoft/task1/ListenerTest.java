package com.luxoft.task1;

import org.junit.Test;

import static org.junit.Assert.*;

import com.luxoft.Bank;
import com.luxoft.Client;
import com.luxoft.ClientRegistrationListener;
import com.luxoft.Gender;

public class ListenerTest {
	@Test
	public void testListener() {
		TestListener listener = new TestListener();
		Bank bank = new Bank();
		bank.addListener(listener);
		bank.addClient(new Client("John", Gender.MALE));
		
		assertTrue(listener.isListenerCalled);
	}
	
	private static class TestListener implements ClientRegistrationListener {
		public boolean isListenerCalled = false;
		
		public void onClientAdded(Client client) {
			isListenerCalled = true;
		}
	}
}
