package com.bridgelabz.regex;

@FunctionalInterface
public interface PasswordI {

	public boolean isValidatePassword(String email, String pattern);
	
}