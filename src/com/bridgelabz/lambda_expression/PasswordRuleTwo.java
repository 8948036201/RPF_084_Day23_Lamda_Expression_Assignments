package com.bridgelabz.lambda_expression;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface IPasswordTwo {
	public String validate(String regex, String field);
}

public class PasswordRuleTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please log in using 8 character password having one upper case.");
		System.out.print("Enter the password : ");
		String field = sc.next();
		IPasswordTwo isValidPassTwo = (pattern, passwordTwo) -> {

			return "The password you have entered is " + Pattern.compile(pattern).matcher(passwordTwo).matches() + ".";
		};

		System.out.println(isValidPassTwo.validate("^(?=.*[A-Z])[A-Za-z]{8}$", field));

	}
}
