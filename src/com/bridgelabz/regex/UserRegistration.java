package com.bridgelabz.regex;

import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		String fName = ScannerUtil.getString("Enter valid first name");
		System.out.println(fName + ":" + isMatch(RegularExpression.nameRegex, fName));
		String pinCode = ScannerUtil.getString("Enter Pincode:");
		System.out.println(pinCode + " :" + isMatch(RegularExpression.pinCodeRegex, pinCode));
		String email = ScannerUtil.getString("Enter email:");
		System.out.println(email + " :" + isMatch(RegularExpression.emailRegex, email));
		String password = ScannerUtil.getString("Enter password:");
		System.out.println(password + " :" + isMatch(RegularExpression.passwordRegex, password));
	}

	private static boolean isMatch(String regex, String userInput) {
		boolean isValid = Pattern.matches(regex, userInput);
		if (isValid)
			System.out.println("The given input is valid");
		else
			System.out.println("The given input is invalid");
		return isValid;
	}

}