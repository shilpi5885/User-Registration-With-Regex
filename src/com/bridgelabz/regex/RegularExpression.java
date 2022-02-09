package com.bridgelabz.regex;

public class RegularExpression {
	
	public static final String pinCodeRegex = "[1-9]{1}[0-9]{2,5}";
	public static final String nameRegex = "[A-Z]{1}[a-z]{2,}";
	public static final String emailRegex = "^abc[a-z0-9+._-]+@bl.co.[a-z]{2}$";
	public static final String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}$";
}