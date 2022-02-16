package com.bridgelabz.regex;

import java.util.regex.Pattern;

public class UserRegistration {

	public boolean isValidateFirstName(String firstName) {
		if (!validateRegex(firstName, RegexConstants.FIRST_NAME_REGEX))
			return false;
		else
			return true;
	}

	public boolean isValidateLastName(String lastName) {
		if (!validateRegex(lastName, RegexConstants.LAST_NAME_REGEX))
			return false;
		else
			return true;
	}

	public boolean isValidateEmail(String email) {
		if (!validateRegex(email, RegexConstants.EMAIL_ID_REGEX))
			return false;
		else
			return true;
	}

	public boolean isValidateMobileNumber(String mobileNumber) {
		if (!validateRegex(mobileNumber, RegexConstants.MOBILE_NUMBER_REGEX))
			return false;
		else
			return true;
	}

	public boolean isValidatePassword(String password) {
		if (!validateRegex(password, RegexConstants.PASSWORD_REGEX))
			return false;
		else
			return true;
	}

	private boolean validateRegex(String request, String pattern) {
		return Pattern.compile(pattern).matcher(request).matches() ? true : false;
	}
}