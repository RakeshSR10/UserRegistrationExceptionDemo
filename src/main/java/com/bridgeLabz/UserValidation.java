package com.bridgeLabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
    static Scanner scanner = new Scanner(System.in);
    private static void User_FirstName() {
        //UC1 User need to enter valid First Name
        String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
        System.out.println("Enter First Name:");
        String First_Name = scanner.next();

        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        Matcher matcher = pattern.matcher(First_Name);

        boolean result = matcher.matches();
        if(result == true)
            System.out.println("Valid");
        else
            System.out.println("Not valid");
    }
    private static void User_LastName() {
        //UC2 User need to enter valid Last Name
        String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
        System.out.println("Enter Last Name:");
        String Last_Name = scanner.next();

        Pattern pattern1 = Pattern.compile(LAST_NAME_PATTERN);
        Matcher matcher1 = pattern1.matcher(Last_Name);

        boolean result1 = matcher1.matches();
        if(result1 == true)
            System.out.println("Valid");
        else
            System.out.println("Not valid");
    }

    private static void User_Email() {
        //UC3 User need to enter valid Email
        String EMAIL_PATTERN = "^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9]+)*@"+"(?:[a-zA-Z0-9]+\\.)+[a-zA-Z]{2,7}$";
        System.out.println("Enter your Email:");
        String email = scanner.next();

        Pattern pattern2 = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher2 = pattern2.matcher(email);

        boolean result2 = matcher2.matches();
        if(result2 == true)
            System.out.println("Valid");
        else
            System.out.println("Not valid");
    }

    private static void User_MobileNumber() {
        //UC4 User need to enter valid Mobile Number
        String MOBILE_NUMBER_PATTERN = "^((91[: :])+([0-9]{10}))$";
        System.out.println("Enter your Mobile Number:");
        String mobile_Number = scanner.next();

        Pattern pattern3 = Pattern.compile(MOBILE_NUMBER_PATTERN);
        Matcher matcher3 = pattern3.matcher(mobile_Number);

        boolean result3 = matcher3.matches();
        if(result3 == true)
            System.out.println("Valid");
        else
            System.out.println("Not valid");
    }
    private static void User_Password() {
        //UC5 User need to enter valid Password with atleast 8 minimum character
        String PASSWORD_PATTERN = "^[a-zA-Z0-9~!@#$]{8,}$";
        System.out.println("Enter your Password:");
        String password = scanner.next();

        Pattern pattern4 = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher4 = pattern4.matcher(password);

        boolean result4 = matcher4.matches();
        if(result4 == true)
            System.out.println("Valid");
        else
            System.out.println("Not valid");
    }
    private static void User_Password_Rule1() {
        //UC6 User need to enter valid Password with at least one Uppercase
        String PASSWORD_PATTERN1 = "^([a-z0-9~!@#$]*[A-Z]){1}[0-9a-zA-Z~!@#$]*$";
        System.out.println("Enter your Password:");
        String password1 = scanner.next();

        Pattern pattern5 = Pattern.compile(PASSWORD_PATTERN1);
        Matcher matcher5 = pattern5.matcher(password1);

        boolean result5 = matcher5.matches();
        if(result5 == true)
            System.out.println("Valid");
        else
            System.out.println("Not valid");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration program");
        User_FirstName();
        User_LastName();
        User_Email();
        User_MobileNumber();
        User_Password();
        User_Password_Rule1();
    }
}
