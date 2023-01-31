package com.bridgelabz.regex;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
public class UserInputValidationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = Boolean.parseBoolean(userRegistration.FirstNameAndLastName("Sharad"));
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = Boolean.parseBoolean(userRegistration.FirstNameAndLastName("Sh"));
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = Boolean.parseBoolean(userRegistration.FirstNameAndLastName("Narute"));
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = Boolean.parseBoolean(userRegistration.FirstNameAndLastName("Na"));
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = Boolean.parseBoolean(userRegistration.email("sharad95@gmail.com"));
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenEmail_WhenNotValid_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = Boolean.parseBoolean(userRegistration.email("Sharad.2512@gmail.com"));
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenMobileNum_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = Boolean.parseBoolean(userRegistration.isMobileNumValid("9823901492"));
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenMobileNum_WhenNotProper_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = Boolean.parseBoolean(userRegistration.isMobileNumValid("908765-4321908"));
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = Boolean.parseBoolean(userRegistration.isPasswordValid("P@ssw0rd"));
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenPassword_WithoutCapitalLetter_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = Boolean.parseBoolean(userRegistration.isPasswordValid("hgsuyds5ndj@"));
        Assert.assertEquals(false, result);
    }
}