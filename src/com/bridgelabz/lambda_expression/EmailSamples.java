package com.bridgelabz.lambda_expression;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface IEmailIDSample {
	public String validate(String regex, String input);
}

public class EmailSamples {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Email ID :");
		String input = sc.next();
		IEmailIDSample isValidEmailSample = (pattern, emailID) -> {

			return "The given Email is " + Pattern.compile(pattern).matcher(emailID).matches();
		};

		System.out.println(isValidEmailSample.validate("^abc(.+)[A-Za-z0-9]{3}+(@+)bl+(.+)[co]*(.[A-Za-z]{2})$", input));
	}
}
