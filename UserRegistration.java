package com.bl.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first name: ");
		String firstName = sc.next();
		boolean isFirstName = Pattern.matches("[A-Z]+[a-z]{3,}", firstName);
		
		if(isFirstName) {
			System.out.println("Valid first name");
		}	
		else {
			System.out.println("Invalid first name");
		}

	}

}

