package com.bridgelabz.user_registration_problem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactNumber {
	
	public static void main(String[] args) {

		String resultPattern = "^[0-9]{2}\\s{1}[0-9]{10}$";
		Pattern regex = Pattern.compile(resultPattern);

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the contact number : ");
		String contactInputStr = scanner.nextLine();
		Matcher contactNumMatcher = regex.matcher(contactInputStr);
		scanner.close();
		if (contactNumMatcher.matches()) {
			System.out.println(contactInputStr + "\nis a valid contact number.");
		} else {
			System.out.println(contactInputStr + "\nis invalid contact number.Kindly input the right one.");
		}
	}
}
