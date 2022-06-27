package com.bridgelabz.junit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JunitUserRegistration {
    public String regex;

    public boolean firstName(String firstName) {
        regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }
    public boolean lastName(String lastName) {
        regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }
    public boolean emailId(String emailIds) {
        regex = "^[a-zA-Z-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailIds);
        return matcher.matches();
    }
    
    public boolean mobileNumber(String mobileNumber) {
        regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }
    
    public boolean passwordRule1(String password) {
        regex = "^[a-z]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
    
    public boolean passwordRule2(String password) {
        regex = "^[a-z](?=.*[A-Z]+).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
    
    public boolean passwordRule3(String password) {
        regex = "^[a-z](?=.*[A-Z]+)(?=.*[0-9]+).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
    
    public boolean passwordRule4(String password) {
        regex = "^[a-z](?=.*[A-Z]+)(?=.*[0-9]+).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
    
}
