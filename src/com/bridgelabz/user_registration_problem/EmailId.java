package com.bridgelabz.user_registration_problem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailId {
	
	public static void main(String[] args) {

		String resultPattern = "^abc(.+)[A-Za-z0-9]{3}+(@+)bl+(.+)[co]*(.[A-Za-z]{2})$";
		Pattern regex = Pattern.compile(resultPattern);

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the email ID : ");
		String emailInputStr = sc.nextLine();
		Matcher emailIDMatcher = regex.matcher(emailInputStr);
		sc.close();
		if (emailIDMatcher.matches()) {
			System.out.println(emailInputStr + "\nis valid Email.");
		} else {
			System.out.println(emailInputStr + "\nis invalid Email address.Kindly input the right one.");
		}
	}
}
