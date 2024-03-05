package com.learning.core.day2;

import java.util.ArrayList;
import java.util.Scanner;

public class D02P08 {
	
	public static int findSum(int L, int R)
	{
	    ArrayList<Integer> arr = new ArrayList<>(); 
	    int i = 0;
	    int x = 2;
	    while (i <= R)
	    {
	        arr.add(i + x);
	        if (i + 1 <= R)
	            arr.add(i + 1 + x);
	        x = x*(-1);
	        i += 2;
	    }
	    int sum = 0;
	    for(i = L; i <= R; ++i)

	       sum += arr.get(i);
	    
	    return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers :");
		int L = sc.nextInt();
		int R = sc.nextInt();
	    System.out.println(findSum(L, R));
	}

}
