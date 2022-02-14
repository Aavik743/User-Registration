package com.bl.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		firstName();
		lastName();
	}
	
	public static void firstName() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first name: ");
		String firstName = sc.next();
		boolean isFirstName = Pattern.matches("[A-Z]+[a-z]{3,}", firstName);
		
		if(isFirstName) {
			System.out.println("Valid first name");
			;
		}	
		else {
			System.out.println("Invalid first name");
		}
	}	
		
		public static void lastName() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("\nEnter last name: ");
			String lastName = sc.next();
			boolean isLastName = Pattern.matches("[A-Z]+[a-z]{3,}", lastName);
			
			if(isLastName) {
				System.out.println("Valid last name");
			}	
			else {
				System.out.println("Invalid last name");
			}

	}

}	



