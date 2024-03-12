package com.learning.core.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D03P07 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        // Input the string
	        System.out.print("Enter the string: ");
	        String str = scanner.nextLine();

	        // Find all subsequences of the string
	        List<String> subsequences = findSubsequences(str);

	        // Output the subsequences
	        System.out.println("Output:");
	        for (String subsequence : subsequences) {
	            System.out.print(subsequence + ", ");
	        }
	    }

	    public static List<String> findSubsequences(String str) {
	        List<String> result = new ArrayList<>();
	        generateSubsequences(str, "", 0, result);
	        return result;
	    }

	    private static void generateSubsequences(String str, String current, int index, List<String> result) {
	        // Base case: when we have reached the end of the string
	        if (index == str.length()) {
	            if (!current.isEmpty()) {
	                result.add(current);
	            }
	            return;
	        }

	        // Include the current character in the subsequence
	        generateSubsequences(str, current + str.charAt(index), index + 1, result);

	        // Exclude the current character from the subsequence
	        generateSubsequences(str, current, index + 1, result);
	}

}
