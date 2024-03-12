package com.learning.core.day3;

import java.util.Scanner;

public class D03P06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter the value of 'n': ");
        int n = scanner.nextInt();
        
        String lastNVowels = getLastNVowels(input, n);
        if (lastNVowels == null) {
            System.out.println("Mismatch in vowel count");
        } else {
            System.out.println("Last " + n + " vowels: " + lastNVowels);
        }
    }
    
    public static String getLastNVowels(String str, int n) {
        StringBuilder result = new StringBuilder();
        String vowels = "aeiouAEIOU";
        int count = 0;
        
        for (int i = str.length() - 1; i >= 0 && n > 0; i--) {
            char ch = str.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                result.insert(0, ch); // Insert at the beginning to maintain order
                count++;
                n--;
            }
        }
        
        if (n > 0) {
            return null; // Mismatch in vowel count
        }
        
        return result.toString();
	}

}
