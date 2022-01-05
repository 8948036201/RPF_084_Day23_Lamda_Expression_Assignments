package com.bridgelabz.user_registration_problem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordRuleFour {

	public boolean passwordRule(String inputStr) {
		String resultPattern = "^(?=.*[A-Z])(?=.*[0-9])[@$!%*#?&][A-Za-z0-9@$!%*#?&]{8,}$";
		Pattern regex = Pattern.compile(resultPattern);
		Matcher passwordMatcher = regex.matcher(inputStr);
		if (passwordMatcher.matches()) {
			System.out.println(inputStr + "\nValid Password and passed fourth rule.");
		} else {
			System.out.println(inputStr + "\nis invalid password.Kindly input minimum 8 character.");
		}
		return false;
	}

	public static void main(String[] args) {
		PasswordRuleFour pssword = new PasswordRuleFour();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the password : ");
		String inputStr = sc.nextLine();
		sc.close();
		pssword.passwordRule(inputStr);
	}
}
