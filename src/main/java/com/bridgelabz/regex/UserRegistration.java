package com.bridgelabz.regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    public String FirstNameAndLastName(String name) {
        String regex = "[A-Z][a-z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()) {
            return name;
        }
        String fail = "No match found";
        return fail;
    }
    public static void main(String[] args) {
        System.out.println("Welcome To Java Regex Program");
        Scanner scan = new Scanner(System.in);
        UserRegistration userRegistration = new UserRegistration();
        String name;
        System.out.println("Enter the first name With Starting First letter Should be in Capital:-");
        name = scan.next();
        String result = userRegistration.FirstNameAndLastName(name);
        System.out.println("First Name is :-"+result);

        String lastName;
        System.out.println("Enter the first name With Starting First letter Should be in Capital:-");
        lastName = scan.next();
        String lastname = userRegistration.FirstNameAndLastName(lastName);
        System.out.println("Last Name is:- "+lastName);
    }

}