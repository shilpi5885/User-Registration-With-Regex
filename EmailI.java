package com.bridgelabz.regex;

@FunctionalInterface
public interface EmailI {

	public boolean isValidateEmail(String email, String pattern);
	
}