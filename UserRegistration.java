package com.bl.regex;

import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) throws Exception {
		
		validateFirstName("Abhik");
		validateLastName("Hore");
		validateEmail("avik107@gmail.com");
		validateMobileNumber("91 9954636196");
		validatePassword("Avik@107");
		
	}
	
	public static boolean validateFirstName(String firstName) throws InvalidFirstNameException {
		boolean isFirstName = Pattern.matches("[A-Z]+[a-z]{3,}", firstName);
		if (isFirstName =! false) {
			throw new InvalidFirstNameException("\n Invalid First Name \n");
		}
		else
		return isFirstName;
	}	
		
		public static boolean validateLastName(String lastName) throws InvalidLastNameException {
			boolean isLastName = Pattern.matches("[A-Z]+[a-z]{3,}", lastName);
			if (isLastName =! false) {
				throw new InvalidLastNameException("\n Invalid Last Name \n");
			}
			else
			return isLastName;

		}
		
		public static boolean validateEmail(String email) throws InvalidEmailException {
			boolean isEmail = Pattern.matches("^(?!.*@.*@)[a-z+_-]+(.[a-z0-9])*@[a-z0-9]+(.[a-z])*.[a-z]{2,}$", email);
			if (isEmail =! false) {
				throw new InvalidEmailException("\n Invalid Email \n");
			}
			else
			return isEmail;
		}
		

		public static boolean validateMobileNumber(String number) throws InvalidMobileNumberException {
			boolean isNumber = Pattern.matches("^[0-9]{2}\s[0-9]{10}$", number);
			if (isNumber =! false) {
				throw new InvalidMobileNumberException("\n Invalid Mobile Number \n");
			}
			else
			return isNumber;
		}
		
		public static boolean validatePassword(String password) throws InvalidPasswordException {
			boolean isPassword = Pattern.matches("(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_-])[a-zA-Z0-9].{8,}$", password);
			if (isPassword =! false) {
				throw new InvalidPasswordException("\n Invalid Password \n");
			}
			else
			return isPassword;
		}
		
}	



