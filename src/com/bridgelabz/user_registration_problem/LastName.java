package com.bridgelabz.user_registration_problem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastName {

	public static void main(String[] args) {

		String resultPattern = "^[A-Z]{1}[a-z]{3,9}$";
		Pattern regex = Pattern.compile(resultPattern);

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first name : ");
		String lNameInputStr = scanner.nextLine();
		Matcher lastNameMatcher = regex.matcher(lNameInputStr);
		scanner.close();
		if (lastNameMatcher.matches()) {
			System.out.println(lNameInputStr + "\nis valid Last Name.");
		} else {
			System.out.println(lNameInputStr + "\nis invalid Last Name.Kindly input the right one.");
		}
	}
}
