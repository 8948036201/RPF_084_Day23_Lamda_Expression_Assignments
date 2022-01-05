package com.bridgelabz.user_registration_problem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordRuleTwo {

	public boolean passwordRule(String inputStr) {
		String resultPattern = "^(?=.*[A-Z])[A-Za-z]{8}$";
		Pattern regex = Pattern.compile(resultPattern);
		Matcher passwordMatcher = regex.matcher(inputStr);
		if (passwordMatcher.matches()) {
			System.out.println(inputStr + "\nValid Password and passed second rule.");
		} else {
			System.out.println(inputStr + "\nis invalid password.Kindly input minimum 8 character.");
		}
		return false;
	}

	public static void main(String[] args) {
		PasswordRuleTwo password = new PasswordRuleTwo();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the password : ");
		String inputStr = sc.nextLine();
		sc.close();
		password.passwordRule(inputStr);
	}
}
