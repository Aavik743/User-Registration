package com.bl.regex;

import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		
		validateFirstName("Abhik");
		validateLastName("Hore");
		validateEmail("avik107@gmail.com");
		validateMobileNumber("91 9954636196");
		validatePassword("Avik@107");
		
	}
	
	public static boolean validateFirstName(String firstName) {
		boolean isFirstName = Pattern.matches("[A-Z]+[a-z]{3,}", firstName);
		return isFirstName;
	}	
		
		public static boolean validateLastName(String lastName) {
			boolean isLastName = Pattern.matches("[A-Z]+[a-z]{3,}", lastName);
			return isLastName;

		}
		
		public static boolean validateEmail(String email) {
			boolean isEmail = Pattern.matches("[a-zA-Z0-9_.-]+@[a-zA-Z0-9.-]+.[a-z]+.[a-z]+", email);
			return isEmail;
		}
		

		public static boolean validateMobileNumber(String number) {
			boolean isNumber = Pattern.matches("^[0-9]{2}\s[0-9]{10}$", number);
			return isNumber;
		}
		
		public static boolean validatePassword(String password) {
			boolean isPassword = Pattern.matches("(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_-])[a-zA-Z0-9].{8,}$", password);
			return isPassword;
		}
		
}	



