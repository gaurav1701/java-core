package com.learning.core.day6;

import java.util.HashMap;
import java.util.Map;

public class D06P02 {

	public static void main(String[] args) {
		
		 // Create a HashMap to store phone book details
        Map<String, String> phoneBook = new HashMap<>();

        // Add predefined information to the phone book
        phoneBook.put("Amal", "998787823");
        phoneBook.put("Manvitha", "937843978");
        phoneBook.put("Joseph", "7882221113");
        phoneBook.put("Smith", "8293893311");
        phoneBook.put("Kathe", "7234560011");

        // Search for a phone number by name
        String nameToSearch = "Joseph";
        String phoneNumber = phoneBook.get(nameToSearch);

        // Output the phone number
        if (phoneNumber != null) {
            System.out.println(phoneNumber);
        } else {
            System.out.println("Phone number not found for " + nameToSearch);
        }

	}

}
