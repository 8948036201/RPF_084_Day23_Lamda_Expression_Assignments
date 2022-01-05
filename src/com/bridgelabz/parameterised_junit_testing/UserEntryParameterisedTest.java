package com.bridgelabz.parameterised_junit_testing;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

@RunWith(Parameterized.class)
public class UserEntryParameterisedTest {
	private String firstName;
	private String lastName;
	private String contactNumber;
	private String emailID;

	private boolean expectedResultForFName;
	private boolean expectedResultForLName;
	private boolean expectedResultForNumber;
	private boolean expectedResultForEmail;

	private ValidateUserEntry userEntry;

	public UserEntryParameterisedTest(String firstName, String lastName, String contactNumber, String emailID,
			boolean expectedResultForFName, boolean expectedResultForLName, boolean expectedResultForNumber,
			boolean expectedResultForEmail) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.emailID = emailID;
		this.expectedResultForFName = expectedResultForFName;
		this.expectedResultForLName = expectedResultForLName;
		this.expectedResultForNumber = expectedResultForNumber;
		this.expectedResultForEmail = expectedResultForEmail;
	}

	@Before
	public void initialize() {
		userEntry = new ValidateUserEntry();
	}

	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] { { "", "", "", "", false, false, false, false },
				{ "Azhar", "ansar", "+91 988009988", "d@@gmail.com", false, false, false, false } });
	}

	@Test
	public void validateFirstName() {
		assertEquals(expectedResultForFName, userEntry.firstName(firstName));
	}

	@Test
	public void validateLastName() {
		assertEquals(expectedResultForLName, userEntry.lastName(lastName));
	}

	@Test
	public void validateContactNumber() {
		assertEquals(expectedResultForNumber, userEntry.contactNumber(contactNumber));
	}

	@Test
	public void validateEmailId() {
		assertEquals(expectedResultForEmail, userEntry.emailID(emailID));
	}
}