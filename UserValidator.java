package com.junituserregistration;

import java.util.regex.Pattern;

public class UserValidator {

	private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	private static final String PHONE_NUMBER_PATTERN = "^[0-9]{10}$";
	private static final String EMAIL_PATTERN = "^[a-z]{3,}.*[a-z]*@[a-z]*[a-z]{2}.[a-z]{2}.*[a-z]*$";
	private static final String PASSWARD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$";

			
	public boolean validateFirstName(String fname) {
		Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
		return pattern.matcher(fname).matches();
	}

	public boolean validateLastName(String lname) {
		Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
		return pattern.matcher(lname).matches();
	} 
	
	public boolean validatePhoneNumber(String phoneNumber) {
		Pattern pattern = Pattern.compile(PHONE_NUMBER_PATTERN);
		return pattern.matcher(phoneNumber).matches();
	}
	
	public boolean validateEmail(String email) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		return pattern.matcher(email).matches();
	}
	
	public boolean validatePassward(String passward) {
		Pattern pattern = Pattern.compile(PASSWARD_PATTERN);
		return pattern.matcher(passward).matches();
	}
}
