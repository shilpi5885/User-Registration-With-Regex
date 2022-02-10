package com.bridgelabz.regex;

import java.util.regex.Pattern;

public class UserRegistration {

	public void isValidateFirstName(String firstName) {
		if (!validateRegex(firstName, RegexConstants.FIRST_NAME_REGEX))
			System.out.println("Invalid First name");
		else 
			System.out.println("Valid First name");
	}

	public void isValidateLastName(String lastName) {
		if (!validateRegex(lastName, RegexConstants.LAST_NAME_REGEX))
			System.out.println("Invalid Last name");
		else
			System.out.println("Valid Last name");
	}

	public void isValidateEmail(String email) {
		if (!validateRegex(email, RegexConstants.EMAIL_ID_REGEX))
			System.out.println("Invalid Email Id");
		else
			System.out.println("Valid email");
	}

	public void isValidateMobileNumber(String mobileNumber) {
		if (!validateRegex(mobileNumber, RegexConstants.MOBILE_NUMBER_REGEX))
			System.out.println("Invalid Mobile Number");
		else
			System.out.println("Valid Mobile Number");
	}

	public void isValidatePassword(String password) {
		if (!validateRegex(password, RegexConstants.PASSWORD_REGEX))
			System.out.println("Invalid Password");
		else
			System.out.println("Valid Password");
	}

	private boolean validateRegex(String request, String pattern) {
		return Pattern.compile(pattern).matcher(request).matches() ? true : false;
	}
	
	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();
		String fName = ScannerUtil.getString("Enter first name");
		System.out.println(fName + ": "); 
		user.isValidateFirstName(fName);
		String lName = ScannerUtil.getString("Enter last Name");
		System.out.println(lName + " : ");
		user.isValidateLastName(lName);
		String mobile = ScannerUtil.getString("Enter mobile number");
		System.out.println(lName + " : ");
		user.isValidateMobileNumber(mobile);
		String email = ScannerUtil.getString("Enter email:");
		System.out.println(email + " : ");
		user.isValidateEmail(email);
		String password = ScannerUtil.getString("Enter password:");
		System.out.println(password + " : "); 
		user.isValidatePassword(password);
	}

}