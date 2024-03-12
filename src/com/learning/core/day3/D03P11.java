package com.learning.core.day3;

import java.util.ArrayList;
import java.util.List;

public class D03P11 {
	
	

	    public static List<String> findMatchingStrings(String[] dictionary, String pattern) {
	        List<String> result = new ArrayList<>();
	        for (String word : dictionary) {
	            if (word.length() == pattern.length()) {
	                if (matchesPattern(word, pattern)) {
	                    result.add(word);
	                }
	            }
	        }
	        return result;
	    }

	    private static boolean matchesPattern(String word, String pattern) {
	        char[] wordChars = word.toCharArray();
	        char[] patternChars = pattern.toCharArray();
	        int n = word.length();

	        int[] map = new int[256];
	        boolean[] marked = new boolean[256];

	        for (int i = 0; i < n; i++) {
	            if (map[wordChars[i]] == 0) {
	                if (marked[patternChars[i]]) {
	                    return false;
	                }
	                map[wordChars[i]] = patternChars[i];
	                marked[patternChars[i]] = true;
	            } else {
	                if (map[wordChars[i]] != patternChars[i]) {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }

	public static void main(String[] args) {
		
		 String[] dictionary = {"abb", "abc", "xyz", "xyy", "foo"};
	        String pattern = "abb";

	        List<String> matchingStrings = findMatchingStrings(dictionary, pattern);
	        System.out.println("Matching strings:");
	        for (String str : matchingStrings) {
	            System.out.println(str);
	        }

	}
}

