package com.bridgelabz.junit_testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserEntryTest {

	@Test
	public void userTest() {
		ValidateUserEntry userEntry = new ValidateUserEntry();
		assertEquals("Azharudd", userEntry.firstName("Azharudd"));
		assertEquals("Ansari", userEntry.lastName("Ansari"));
		assertEquals("8948036201", userEntry.contactNumber("8948036201"));
		assertEquals("abc.abcd@bl.co.go", userEntry.contactNumber("abc.abcd@bl.co.go"));
	}
}
