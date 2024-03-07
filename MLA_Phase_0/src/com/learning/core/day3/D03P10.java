package com.learning.core.day3;

import java.util.Scanner;

public class D03P10 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

       
        int result = PrefixSuffixLength(inputString);
        System.out.println("Length of the longest prefix that is also a suffix: " + result);
    }

    private static int PrefixSuffixLength(String str) {
        int n = str.length();
        int[] lps = calculateLPS(str);
        
        return lps[n - 1];
    }

    private static int[] calculateLPS(String str) {
        int n = str.length();
        int[] lps = new int[n];
        int len = 0;
        int i = 1;

        while (i < n) {
            if (str.charAt(i) == str.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }

}
