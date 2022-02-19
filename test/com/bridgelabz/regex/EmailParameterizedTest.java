package com.bridgelabz.regex;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class EmailParameterizedTest {
	private String input;
	private boolean result;
	private UserRegistration user;

	@Before
	public void initialize() {
		user = new UserRegistration();
	}

	public EmailParameterizedTest(String input, boolean result) {
		this.input = input;
		this.result = result;
	}

	@Test
	public void testUserEmail() {
		assertEquals(result,user.isValidateEmail(input));
	}

	@Parameters
	public static Collection emails() {
		return Arrays.asList(
			new Object[][] { { "abc@yahoo.com", true },
				{ "abc-100@yahoo.com", true }, { "abc.100@yahoo.com", true },
				{ "abc111@abc.com", true }, { "abc-100@abc.net", true }, 
				{ "abc.100@abc.com.au ", false } , { "abc@1.com, " , true }, 
				{ "abc@gmail.com.com" , false }, { "abc+100@gmail. com" , true },
				{ "abc" , false }, { "abc @. com.my" , false },
				{ "abc123@gmail.a" , false }, { "abc123@.com" , false }, 
				{ "abc123@.com.com " , false }, { ".abc@abc.com" , false }, 
				{ "abc ()*@ gmail.com " , false }, { "abc @%*.com" , false }, 
				{ "abc..2002@gmail.com" , false }, { "abc .@ gmail.com" , false }, 
				{ "abc@abc@gmail.com " , false }, { "abc@gmail.com.1a" , false }, 
				{ "abc@gmail.com.aa.au" , false }});
	}
}