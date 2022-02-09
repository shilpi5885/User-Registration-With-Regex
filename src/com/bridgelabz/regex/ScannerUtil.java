package com.bridgelabz.regex;

import java.util.Scanner;

public class ScannerUtil {
	
	private final static Scanner SCANNER = new Scanner(System.in);

	public static String getString(String message) {
		System.out.println(message);
		return SCANNER.next();
	}
}
