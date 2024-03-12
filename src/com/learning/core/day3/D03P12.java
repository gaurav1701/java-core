package com.learning.core.day3;

import java.util.HashSet;

public class D03P12 {

	 public static boolean canSplitIntoFour(String s) {
		 if (s.length() < 4) {
	            return false;
	        }

	        HashSet<String> set = new HashSet<>();
	        for (int i = 1; i <= s.length() - 3; i++) {
	            for (int j = i + 1; j <= s.length() - 2; j++) {
	                for (int k = j + 1; k <= s.length() - 1; k++) {
	                    String s1 = s.substring(0, i);
	                    String s2 = s.substring(i, j);
	                    String s3 = s.substring(j, k);
	                    String s4 = s.substring(k);

	                    set.clear();
	                    set.add(s1);
	                    set.add(s2);
	                    set.add(s3);
	                    set.add(s4);

	                    if (set.size() == 4) {
	                        return true;
	                    }
	                }
	            }
	        }

	        return false;
	    }

	    public static void main(String[] args) {
	        String s1 = "helloworld";
	        String s2 = "aaabb";

	        System.out.println(canSplitIntoFour(s1) ? "Yes" : "No");
	        System.out.println(canSplitIntoFour(s2) ? "Yes" : "No");
	}

}
