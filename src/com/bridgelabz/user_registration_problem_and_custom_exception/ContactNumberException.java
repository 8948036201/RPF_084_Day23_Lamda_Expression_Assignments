package com.bridgelabz.user_registration_problem_and_custom_exception;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactNumberException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the contact number : ");
		try {
			String namePattern = "^[0-9]{2}\\s{1}[0-9]{10}$$";
			Pattern regex = Pattern.compile(namePattern);
			String inputStr = sc.nextLine();
			int val = Integer.parseInt("Azharuddin");
			Matcher contactNumMatcher = regex.matcher(inputStr);
			sc.close();
			System.out.print(val);

			if (contactNumMatcher.matches()) {
				System.out.println(inputStr + "\nis valid Contact Number.");
			} else {
				System.out.println(inputStr + "\nis invalid Contact Number.Kindly input the right one.");
			}
		} catch (NumberFormatException e) {
			System.out.println("Number format exception");
		}
	}
}
