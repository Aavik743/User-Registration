package com.bl.regex;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {
	String m = null;
	
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserRegistration validator = new UserRegistration();
		boolean result;
		try {
			result = validator.validateFirstName("Abhik");
		} catch (InvalidFirstNameException e) {
			e.printStackTrace();
			m = e.getMessage();
		}
		Assert.assertEquals("\n Invalid First Name \n", m);
	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserRegistration validator = new UserRegistration();
		boolean result;
		try {
			result = validator.validateLastName("Hore");
		} catch (InvalidLastNameException e) {
			e.printStackTrace();
			m = e.getMessage();
		}
		Assert.assertEquals("\n Invalid Last Name \n", m);
	}
	
	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		UserRegistration validator = new UserRegistration();
		boolean result;
		try {
			result = validator.validateEmail("avik107@gmail.com");
		} catch (InvalidEmailException e) {
			e.printStackTrace();
			m = e.getMessage();
		}
		Assert.assertEquals("\n Invalid Email \n", m);
	}
	
	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
		UserRegistration validator = new UserRegistration();
		boolean result;
		try {
			result = validator.validateMobileNumber("91 9954636196");
		} catch (InvalidMobileNumberException e) {
			e.printStackTrace();
			m = e.getMessage();
		}
		Assert.assertEquals("\n Invalid Mobile Number \n", m);
	}
	
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		UserRegistration validator = new UserRegistration();
		boolean result;
		try {
			result = validator.validatePassword("Avik@1079");
		} catch (InvalidPasswordException e) {
			e.printStackTrace();
			m = e.getMessage();
		}
		Assert.assertEquals("\n Invalid Password \n", m);
	}	
}
