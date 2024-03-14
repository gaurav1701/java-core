package com.learning.core.day9;

import java.util.Scanner;

public class D09P02 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        
	        System.out.println("Enter the elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        
	        mergeSort(arr, 0, n - 1);
	        
	        System.out.println("Sorted array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	    
	    public static void mergeSort(int[] arr, int low, int high) {
	        if (low < high) {
	            int mid = (low + high) / 2;
	            
	            mergeSort(arr, low, mid);
	            mergeSort(arr, mid + 1, high);
	            
	            merge(arr, low, mid, high);
	        }
	    }
	    
	    public static void merge(int[] arr, int low, int mid, int high) {
	        int n1 = mid - low + 1;
	        int n2 = high - mid;
	        
	        int[] left = new int[n1];
	        int[] right = new int[n2];
	        
	        for (int i = 0; i < n1; ++i)
	            left[i] = arr[low + i];
	        for (int j = 0; j < n2; ++j)
	            right[j] = arr[mid + 1 + j];
	        
	        int i = 0, j = 0;
	        
	        int k = low;
	        while (i < n1 && j < n2) {
	            if (left[i] <= right[j]) {
	                arr[k] = left[i];
	                i++;
	            } else {
	                arr[k] = right[j];
	                j++;
	            }
	            k++;
	        }
	        
	        while (i < n1) {
	            arr[k] = left[i];
	            i++;
	            k++;
	        }
	        
	        while (j < n2) {
	            arr[k] = right[j];
	            j++;
	            k++;
	        }
	    }

}
