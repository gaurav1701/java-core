package com.learning.core.day3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D03P14 {

	public static void main(String[] args) {
		
    Scanner scanner = new Scanner(System.in);
        
        // Input first array
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }
        
        // Input second array
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }
        
        // Finding union and intersection
        findUnionIntersection(array1, array2);
    }
    
    public static void findUnionIntersection(int[] array1, int[] array2) {
        Set<Integer> union = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        
        int i = 0, j = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                union.add(array1[i]);
                i++;
            } else if (array2[j] < array1[i]) {
                union.add(array2[j]);
                j++;
            } else {
                union.add(array1[i]);
                intersection.add(array1[i]);
                i++;
                j++;
            }
        }
        
        while (i < array1.length) {
            union.add(array1[i]);
            i++;
        }
        
        while (j < array2.length) {
            union.add(array2[j]);
            j++;
        }
        
        System.out.print("Union: ");
        for (int num : union) {
            System.out.print(num);
        }
        
        System.out.print(" Intersection: ");
        for (int num : intersection) {
            System.out.print(num);
        }

	}

}
