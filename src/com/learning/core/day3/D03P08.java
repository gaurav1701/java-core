package com.learning.core.day3;

import java.util.Scanner;

public class D03P08 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        // Input the string
	        System.out.print("Enter the string: ");
	        String str = scanner.nextLine();

	        // Find the minimum number of deletions to make the string palindrome
	        int deletions = minDeletionsToPalindrome(str);

	        // Output the result
	        System.out.println("Output:");
	        System.out.println("Minimum number of deletions to make the string palindrome: " + deletions);
	    }

	    public static int minDeletionsToPalindrome(String str) {
	        // Find the length of the string
	        int n = str.length();

	        // Create a 2D array to store the length of the longest palindrome subsequence
	        int[][] dp = new int[n][n];

	        // Initialize the diagonal elements to 1 (each character is a palindrome by itself)
	        for (int i = 0; i < n; i++) {
	            dp[i][i] = 1;
	        }

	        // Build the dp table
	        for (int len = 2; len <= n; len++) {
	            for (int i = 0; i < n - len + 1; i++) {
	                int j = i + len - 1;
	                if (str.charAt(i) == str.charAt(j)) {
	                    dp[i][j] = dp[i + 1][j - 1] + 2;
	                } else {
	                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
	                }
	            }
	        }

	        // Minimum number of deletions required = Length of string - Length of longest palindrome subsequence
	        return n - dp[0][n - 1];

	}

}
