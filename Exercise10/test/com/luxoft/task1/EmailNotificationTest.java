package com.luxoft.task1;

import org.junit.Test;

import static org.junit.Assert.*;

import com.luxoft.Bank;
import com.luxoft.Client;
import com.luxoft.Email;
import com.luxoft.EmailNotificationListener;
import com.luxoft.EmailService;
import com.luxoft.Gender;

public class EmailNotificationTest {
	@Test
	public void testListener() {
		TestEmailService service = new TestEmailService();

		EmailNotificationListener listener = new EmailNotificationListener(service);
		Bank bank = new Bank();
		bank.addListener(listener);
		bank.addClient(new Client("John", Gender.MALE));
		
		assertTrue(service.isMailSent);
	}
	
	private static class TestEmailService extends EmailService {
		private boolean isMailSent;
		
		@Override
		public void sendMail(Email email) {
			isMailSent = true;
		}
		
	}
}
