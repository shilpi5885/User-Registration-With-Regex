package com.bridgelabz.regex;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest extends TestCase {
	private UserRegistration user;

	@Before
	public void UserRegistrationObj() {
		user = new UserRegistration();
	}

	@Test
	public void testFirstName_thenAssertionSucceeds() {
		assertTrue(user.isValidateFirstName("Kalpesh"));
		System.out.println("Valid First Name");
	}

	@Test
	public void testFirstName_thenAssertionFail() {
		assertTrue(user.isValidateFirstName("bunny"));
		System.out.println("Valid First Name");
	}

	@Test
	public void testLastName_thenAssertionSucceeds() {
		assertTrue(user.isValidateLastName("Mahajan"));
		System.out.println("Valid Last Name");
	}

	@Test
	public void testLastName_thenAssertionFail() {
		assertTrue(user.isValidateLastName("devil"));
		System.out.println("Valid Last Name");
	}

	@Test
	public void testEmail_thenAssertionSucceeds() {
		assertTrue(user.isValidateEmail("abc@gmail.com"));
		System.out.println("Valid Email");
	}

	@Test
	public void testEmail_thenAssertionFail() {
		assertTrue(user.isValidateEmail("abc@gmail@.com@"));
		System.out.println("Valid Email");
	}

	@Test
	public void testMobileNumber_thenAssertionSucceeds() {
		assertTrue(user.isValidateMobileNumber("9876543210"));
		System.out.println("Valid Mobile Number");
	}

	@Test
	public void testMobileNumber_thenAssertionFail() {
		assertTrue(user.isValidateMobileNumber("91 0876543210"));
		System.out.println("Valid Mobile Number");
	}

	@Test
	public void testPassword_thenAssertionSucceeds() {
		assertTrue(user.isValidatePassword("Abcd@1234"));
		System.out.println("Valid Password");
	}

	@Test
	public void testPassword_thenAssertionSucceeds1() {
		assertTrue(user.isValidatePassword("Abcdefg@"));
		System.out.println("Valid Password");
	}

	@Test
	public void testPassword_thenAssertionSucceeds2() {
		assertTrue(user.isValidatePassword("1221212234"));
		System.out.println("Valid Password");
	}

	@Test
	public void testPassword_thenAssertionSucceeds3() {
		assertTrue(user.isValidatePassword("Ab@1234@@"));
		System.out.println("Valid Password");
	}

	@Test
	public void testPassword_thenAssertionFail() {
		assertTrue(user.isValidatePassword("bbb"));
		System.out.println("Valid Password");
	}

	@Test
	public void whenUserRegistrationExceptionThrown_thenAssertionSucceeds() {
		assertTrue(user.isValidatePassword("bbb"));
	}

	@After
	public void nullObj() {
		user = null;
	}
}
