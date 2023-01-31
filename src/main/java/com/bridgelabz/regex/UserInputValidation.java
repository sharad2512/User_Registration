package com.bridgelabz.regex;
public class UserInputValidation {
    @FunctionalInterface
    public interface Validate {
        boolean validate(String input);
    }
    public static Validate validateFirstName() {
        return firstName -> firstName.matches("^[A-Z]{1}[a-z]{2,}$");
    }
    public static Validate validateLastName() {
        return lastName -> lastName.matches("^[A-Z]{1}[a-z]{2,}$");
    }
    public static Validate validateEmail() {
        return email -> email.matches("^[a-zA-Z-9]+([._+-]?[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2})?$");
    }
    public static Validate validateMobileNumber() {
        return mobileNumber -> mobileNumber.matches("^[0-9]{2}[\\s][0-9]{10}$");
    }
    public static Validate validatePassword() {
        return password -> password.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9]*" +
                "[\\@\\#\\^\\!\\$\\%\\&\\?][a-zA-Z0-9]*$");
    }
}
