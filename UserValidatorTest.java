package com.junituserregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateFirstName("Anupama");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateLastName("Todki");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validatePhoneNumber("8904165452");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateEmail("anupama.todki@gmail.com");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenPassward_WhenProper_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validatePassward("Aryan@19v");
		Assert.assertEquals(true, result);
	}

}
