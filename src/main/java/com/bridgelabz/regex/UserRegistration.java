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
        String fail = "No match found , please Enter Correct Name";
        return fail;
    }
    public String email(String email){
        String regex = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            return email;
        }
        String fail = "No match found, Please Enter correct validations for Email...";
        return fail;
    }
    public String isMobileNumValid(String mobileNumber){
        String mobileNumberRegex = "^[1-9]{2}[/-][0-9]{10}$";
        Pattern pattern = Pattern.compile(mobileNumberRegex);
        Matcher matcher = pattern.matcher(mobileNumber);
        if(matcher.matches()){
            return mobileNumber;
        }
        String fail = "No match found, Please Enter correct mobile number ...";
        return fail;
    }
    public String isPasswordValid(String password){
        String regex = "^[0-9]{2}[/-]{1}[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if(matcher.matches()){
            return password;
        }
        String fail = "No match found, Please Enter correct  Password...";
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
        System.out.println("Your First Name is :-"+result);

        String lastName;
        System.out.println("Enter the Last name With Starting First letter Should be in Capital:-");
        lastName = scan.next();
        String lastname = userRegistration.FirstNameAndLastName(lastName);
        System.out.println("Your Last Name is:- "+lastName);

        String emailId;
        System.out.println("Enter your email Id");
        emailId = scan.next();
        String email = userRegistration.email(emailId);
        System.out.println("Your Email Id is :- "+email);

        String mobileNumber;
        System.out.println("Enter Mobile Number (eg. 91 9876543210)");
        mobileNumber = scan.next();
        String mobileNum = userRegistration.isMobileNumValid(mobileNumber);
        System.out.println("Your mobile Number is :- "+mobileNum);

        String password;
        System.out.println("Enter your password");
        password = scan.next();
        String pass = userRegistration.isPasswordValid(password);
        System.out.println("Your Password :- "+pass);
    }

}