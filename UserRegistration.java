package com.bridgelabz.regex;

import java.util.regex.Pattern;

public class UserRegistration {
	public boolean validateFirstName(String fName) throws UserRegistrationException{
		FirstNameI userFirstName = (firstName,pattern) -> {return Pattern.compile(pattern).matcher(firstName).matches() ? true : false;};
		boolean result = userFirstName.isValidateFirstName(fName, RegexConstants.FIRST_NAME_REGEX);
		return result;
	}
	
	public boolean validateLastName(String lName) throws UserRegistrationException{
		LastNameI userLastName = (lastName,pattern) -> {return Pattern.compile(pattern).matcher(lastName).matches() ? true : false;};
		boolean result = userLastName.isValidateLastName(lName, RegexConstants.LAST_NAME_REGEX);
		return result;
	}
	
	public boolean validateEmail(String email) throws UserRegistrationException{
		EmailI userEmail = (usrEmail,pattern) -> {return Pattern.compile(pattern).matcher(usrEmail).matches() ? true : false;};
		boolean result = userEmail.isValidateEmail(email, RegexConstants.EMAIL_ID_REGEX);
		return result;
	}
	
	public boolean validateMobileNumber(String mobileNumber) throws UserRegistrationException{
		MobileI userMobile = (mobile,pattern) -> {return Pattern.compile(pattern).matcher(mobile).matches() ? true : false;};
		boolean result = userMobile.isValidateMobile(mobileNumber, RegexConstants.MOBILE_NUMBER_REGEX);
		return result;
	}
	
	public boolean validatePassword(String password) throws UserRegistrationException{
		PasswordI userPassword = (psswrd,pattern) -> {return Pattern.compile(pattern).matcher(psswrd).matches() ? true : false;};
		boolean result = userPassword.isValidatePassword(password, RegexConstants.PASSWORD_REGEX);
		return result;
	}
}