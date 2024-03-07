package com.learning.core.day3;

import java.util.HashMap;
import java.util.Scanner;

public class D03P04 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findFirstRepeating(arr);

        if (result != -1) {
            System.out.println("Index of the first repeating element: " + result);
        } else {
            System.out.println("No repeating elements found.");
        }
    }

    public static int findFirstRepeating(int[] arr) {
    	
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (indexMap.containsKey(arr[i])) {
                return indexMap.get(arr[i]) + 1;
            }
            else {
                indexMap.put(arr[i], i);
            }
        }
        return -1;
		
		
    }
}


