package com.bridgeLabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidationTest {
    @Test
    public void givenFirstName_whenProper_ShouldReturnTrue(){
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Rakesh");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_whenShort_ShouldReturnFalse(){
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Ra");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenFirstName_whenWithSpChars_ShouldReturnFalse(){
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("R@kesh");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenLastName_whenProper_ShouldReturnTrue(){
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("King");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_whenNotProper_ShouldReturnFalse(){
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("Ki");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_whenProper_ShouldReturnTrue(){
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateMobileNumber("91 9553754208");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_whenValid_ShouldReturnTrue(){
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress("abc@bridgelabz.com");
        Assertions.assertTrue(result);

    }

    @Test
    public void givenPassword_whenValid_ShouldReturnTrue(){
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("Rakesh@king120");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword_whenNotValid_ShouldReturnFalse(){
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("rakesh");
        Assertions.assertFalse(result);
    }
}
