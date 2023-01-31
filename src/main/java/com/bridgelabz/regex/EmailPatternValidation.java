package com.bridgelabz.regex;
import java.util.regex.Pattern;
public class EmailPatternValidation {
    public boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+-]+(?:\\.[a-zA-Z0-9_+-]+)*@" +
                "([a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}" +
                "(?:(\\.([A-Za-z]{2})))?$";
        Pattern pattern = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pattern.matcher(email).matches();
    }
}