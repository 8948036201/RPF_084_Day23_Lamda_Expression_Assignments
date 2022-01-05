package com.bridgelabz.lambda_expression;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface IPasswordFour {
	public String validate(String regex, String field);
}

public class PasswordRuleFour {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Please log in using 8 character password having one upper case and one numeric number and has exactly 1 Special Character.");
		System.out.print("Enter the password : ");
		String field = sc.next();
		IPasswordFour isValidPassFour = (pattern, passwordFour) -> {

			return "The password you have entered is " + Pattern.compile(pattern).matcher(passwordFour).matches() + ".";
		};

		System.out.println(
				isValidPassFour.validate("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*#?&]{8,}$", field));

	}
}
