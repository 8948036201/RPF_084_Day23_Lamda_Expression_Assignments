package com.bridgelabz.user_registration_problem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordRuleOne {
	
	public boolean passwordRule(String inputStr) {
		String resultPattern = "^[A-Za-z]{8}$";
		Pattern regex = Pattern.compile(resultPattern);
		Matcher passwordMatcher = regex.matcher(inputStr);
		if (passwordMatcher.matches()) {
			System.out.println(inputStr + "\nValid Password and passed rule one.");
		} else {
			System.out.println(inputStr + "\nis Invalid password.Kindly input minimum 8 character.");
		}
		return false;
	}
	
	public static void main(String[] args) {
		PasswordRuleOne passwordRuleOne = new PasswordRuleOne();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Password : ");
		String inputStr = sc.nextLine();
		sc.close();
		passwordRuleOne.passwordRule(inputStr);
	}
}
