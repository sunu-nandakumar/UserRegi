package userReg;

import java.util.Scanner;
import java.util.regex.*;

public class UserReg {
	/*
	 * Uc1: validating FirstName and if pattern matches method returns true
	 * otherwise it returns false.
	 */
	public static boolean isFirstName(String firstname) {
		String regex = "^[A-Z]{1}[a-z]{2,}";
		Pattern patt = Pattern.compile(regex);
		if (firstname == null) {
			return false;
		}
		Matcher match = patt.matcher(firstname);
		return match.matches();
	}

	/*
	 * Uc2: validating LastName and if pattern matches method returns true otherwise
	 * it return false.
	 */
	public static boolean isLastName(String lastname) {
		String regex = "^[A-Z]{1}[a-z]{2,}";
		Pattern patt2 = Pattern.compile(regex);
		if (lastname == null) {
			return false;
		}
		Matcher match2 = patt2.matcher(lastname);
		return match2.matches();
	}

	/*
	 * Uc3: validating Email
	 */
	public static String validateEmail(String email) {
		if (Pattern.matches("^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?",
				email)) {
			return "valid";
		} else {
			return "invalid";
		}
	}

	/*
	 * Uc4: validating phone number
	 */
	public static boolean isMobileFormatValid(String mobile) {
		String regex = "^((\\+)?(\\d{2}[\\s]))?(\\d{10}){1}?$";
		Pattern patt = Pattern.compile(regex);
		if (mobile == null) {
			return false;
		}
		Matcher match = patt.matcher(mobile);
		return match.matches();
	}
	/*
	 * Uc5: Validating password
	 * Rule 1: should have atleast 8 characters
	 * Uc6: Rule 2: should have atleast one uppercase letter
	 */
	public static boolean isPasswordValid(String password) {
		String regex = "^[a-zA-Z]{8,}";
		Pattern patt = Pattern.compile(regex);
		if (password == null) {
			return false;
		}
		Matcher match = patt.matcher(password);
		return match.matches();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter firstname:");
		String firstname = input.nextLine();
		System.out.println("Enter lastname:");
		String lastname = input.nextLine();
		System.out.println("Enter the email");
		String email = input.nextLine();
		System.out.println("Enter mobile number");
		String phoneNo = input.nextLine();
		System.out.println("Enter password");
		String password = input.nextLine();
		if (isFirstName(firstname) == true) {
			System.out.println("Firstname is Correct");
		} else {
			System.out.println("Firstname is Incorrect");
		}
		if (isLastName(lastname) == true) {
			System.out.println("Lastname is Correct");
		} else {
			System.out.println("Lastname is Incorrect");
		}
		System.out.println("Email: " + validateEmail(email));
		if (isMobileFormatValid(phoneNo) == true) {
			System.out.println("Phone Number is correct");
		} else {
			System.out.println("Phone Number is Incorrect");
		}
		if (isPasswordValid(password) == true) {
			System.out.println("Password is Valid");
		} else {
			System.out.println("Password is Invalid");
		}

	}

}
