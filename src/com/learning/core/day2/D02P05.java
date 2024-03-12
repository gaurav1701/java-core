package com.learning.core.day2;

import java.util.Scanner;

public class D02P05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n1 = sc.nextInt();
		if(n1 % 5 == 0)
			System.out.println(n1+ " is divisible by 5");
		else
			System.out.println(n1+ " is not divisible by 5");
		
	}

}
