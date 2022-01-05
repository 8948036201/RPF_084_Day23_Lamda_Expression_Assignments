package com.bridgelabz.lambda_expression;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface IEmail {
	public String validate(String regex, String inputStr);
}

public class Email {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a valid email - E.g. abc.xyz@bl.co.in , where abc , bl and co is mandatory.");
		System.out.println("Enter your Email ID :");
		String input = sc.next();
		IEmail isValidateEmail = (pattern, email) -> {

			return "The input provided is " + Pattern.compile(pattern).matcher(email).matches();
		};

		System.out.println(isValidateEmail.validate("^abc(.+)[A-Za-z0-9]{3}+(@+)bl+(.+)[co]*(.[A-Za-z]{2})$", input));
	}
}
