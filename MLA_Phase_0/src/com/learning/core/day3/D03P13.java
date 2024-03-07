package com.learning.core.day3;

import java.util.Scanner;

public class D03P13 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        // Input the string
	        System.out.print("Enter the string: ");
	        String str = scanner.nextLine();

	        // Replace spaces with '%20'
	        String replacedString = replaceSpaces(str);

	        // Output the result
	        System.out.println("Output:");
	        System.out.println(replacedString);
	    }

	    public static String replaceSpaces(String str) {
	        // Use the replaceAll method to replace spaces with '%20'
	        return str.replaceAll(" ", "%20");

	}

}
