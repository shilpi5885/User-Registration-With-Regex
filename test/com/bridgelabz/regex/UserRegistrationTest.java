package com.bridgelabz.regex;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Test;

public class UserRegistrationTest extends TestCase {
	private UserRegistration user = new UserRegistration();;

	@Test
	public void testFirstName_thenAssertionSucceeds() {
		assertTrue(user.isValidateFirstName("Shilpi"));
		System.out.println("Valid First Name");
	}

	@Test
	public void testFirstName_thenAssertionFail() {
		assertFalse(user.isValidateFirstName("bunny"));
		System.out.println("Invalid First Name");
	}

	@Test
	public void testLastName_thenAssertionSucceeds() {
		assertTrue(user.isValidateLastName("Lamba"));
		System.out.println("Valid Last Name");
	}

	@Test
	public void testLastName_thenAssertionFail() {
		assertFalse(user.isValidateLastName("devil"));
		System.out.println("Invalid Last Name");
	}

	@Test
	public void testEmail_thenAssertionSucceeds() {
		assertTrue(user.isValidateEmail("abc@gmail.com"));
		System.out.println("Valid Email");
	}

	@Test
	public void testEmail_thenAssertionFail() {
		assertFalse(user.isValidateEmail("abc@gmail@.com@"));
		System.out.println("Invalid Email");
	}

	@Test
	public void testMobileNumber_thenAssertionFails() {
		assertFalse(user.isValidateMobileNumber("7738511504"));
		System.out.println("Invalid Mobile Number");
	}

	@Test
	public void testMobileNumber_thenAssertionSucceeds() {
		assertTrue(user.isValidateMobileNumber("91 7738511504"));
		System.out.println("Valid Mobile Number");
	}

	@Test
	public void testPassword_thenAssertionSucceeds() {
		assertTrue(user.isValidatePassword("Abcd@1234"));
		System.out.println("Valid Password");
	}

	@Test
	public void testPassword_thenAssertionFails() {
		assertFalse(user.isValidatePassword("Abcdefg@"));
		System.out.println("Invalid Password");
	}

	@Test
	public void testPassword_thenAssertionFails1() {
		assertFalse(user.isValidatePassword("1221212234"));
		System.out.println("Invalid Password");
	}

	@Test
	public void testPassword_thenAssertionSucceeds1() {
		assertTrue(user.isValidatePassword("Ab@1234@@"));
		System.out.println("Valid Password");
	}

	@Test
	public void testPassword_thenAssertionFail() {
		assertFalse(user.isValidatePassword("bbb"));
		System.out.println("Invalid Password");
	}

	@After
	public void nullObj() {
		user = null;
	}
}
