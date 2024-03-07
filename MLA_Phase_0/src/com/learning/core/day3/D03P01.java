package com.learning.core.day3;

import java.util.Scanner;

public class D03P01 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String n = sc.nextLine();
        int length = n.length();
        System.out.println("Length of the string: " + length);
        String upper = n.toUpperCase();
        System.out.println("Uppercase string: " + upper);

        boolean isPalindrome = check(n);
        if (isPalindrome)
        {
            System.out.println("It is a Palindrome");
        }
        else
        {
            System.out.println("It is not a Palindrome");
        }
    }

    public static boolean check(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right)
        {
            if (str.charAt(left) != str.charAt(right)) 
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
	}

}
