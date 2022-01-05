package com.bridgelabz.lambda_expression;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface IContactNumber {
	public String validate(String regex, String inputStr);
}

public class ContactNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a valid contact number E.g. 91 9919819801");
		System.out.println("Enter the contact number : ");
		String input = sc.next();
		IContactNumber isValidContactNumber = (pattern, contactNumber) -> {

			return "The input provided is " + Pattern.compile(pattern).matcher(contactNumber).matches();
		};

		System.out.println(isValidContactNumber.validate("^[0-9]{2}\\s{1}[0-9]{10}$", input));
	}
}
