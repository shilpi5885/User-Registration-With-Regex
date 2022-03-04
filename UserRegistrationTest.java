package com.bridgelabz.regex;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
	private UserRegistration user;

	@Before
	public void UserRegistrationObj() {
		user = new UserRegistration();
	}

	@Test
	public void testFirstName_thenAssertionSucceeds() {
		try {
			assertTrue(user.validateFirstName("Kalpesh"));
			System.out.println("Valid First Name");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testFirstName_thenAssertionFail() {
		try {
			assertFalse(user.validateFirstName("bunny"));
			System.out.println("Invalid First Name");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testLastName_thenAssertionSucceeds() {
		try {
			assertTrue(user.validateLastName("Mahajan"));
			System.out.println("Valid Last Name");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testLastName_thenAssertionFail() {
		try {
			assertFalse(user.validateLastName("devil"));
			System.out.println("Invalid Last Name");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testEmail_thenAssertionSucceeds() {
		try {
			assertTrue(user.validateEmail("abc@gmail.com"));
			System.out.println("Valid Email");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testEmail_thenAssertionFail() {
		try {
			assertFalse(user.validateEmail("abc@gmail@.com@"));
			System.out.println("Invalid Email");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testMobileNumber_thenAssertionSucceeds() throws UserRegistrationException {
		assertTrue(user.validateMobileNumber("9876543210"));
		System.out.println("Valid Mobile Number");

	}

	@Test
	public void testMobileNumber_thenAssertionFail() {
		try {
			assertTrue(user.validateMobileNumber("91 0876543210"));
			System.out.println("Valid Mobile Number");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testPassword_thenAssertionSucceeds() {
		try {
			assertTrue(user.validatePassword("Abcd@1234"));
			System.out.println("Valid Password");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testPassword_thenAssertionSucceeds1() {
		try {
			assertFalse(user.validatePassword("Abcdefg@"));
			System.out.println("Invalid Password");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testPassword_thenAssertionSucceeds2() {
		try {
			assertFalse(user.validatePassword("1221212234"));
			System.out.println("Invalid Password");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testPassword_thenAssertionSucceeds3() {
		try {
			assertTrue(user.validatePassword("Ab@1234@@"));
			System.out.println("Valid Password");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testPassword_thenAssertionFail() {
		try {
			assertFalse(user.validatePassword("bbb"));
			System.out.println("invalid Password");
		} 
		catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@After
	public void nullObj() {
		user = null;
	}
}