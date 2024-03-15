package com.learning.core.day10;

import java.util.Date;

public class D10P10 {
	public class TestUserProfile {

	    public static void main(String[] args) {
	        UserProfile userProfile = new UserProfile();

	        long startTime = new Date().getTime();
	        System.out.println("Testing validateUsername()...");
	        System.out.println("Username is valid: " + userProfile.validateUsername("JohnDoe"));
	        long endTime = new Date().getTime();
	        System.out.println("Execution time: " + (endTime - startTime) + " milliseconds");

	        startTime = new Date().getTime();
	        System.out.println("Testing validatePassword()...");
	        System.out.println("Password is valid: " + userProfile.validatePassword("JohnDoe123"));
	        endTime = new Date().getTime();
	        System.out.println("Execution time: " + (endTime - startTime) + " milliseconds");
	    }
	}
    
}

class UserProfile {

    public boolean validateUsername(String name) {
        String usernamePattern = "^[a-zA-Z]+$";
        return name.matches(usernamePattern);
    }

    public boolean validatePassword(String password) {
        String passwordPattern = "^(?=.[0-9])(?=.[a-z])(?=.[A-Z])(?=.[@#$%^&+=]).{8,}$";
        return password.matches(passwordPattern);
    }
}

