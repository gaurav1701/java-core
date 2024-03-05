package com.learning.core.day2;

import java.util.Scanner;

public class D02P04 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number :");
		int num1 = sc.nextInt();
		System.out.println("Enter the First Number :");
		int num2 = sc.nextInt();
		System.out.println("Enter the First Number :");
		int num3 = sc.nextInt();
		int result = num3 >(num1 > num2 ? num1 :num2) ? num3 :((num1 > num2) ? num1:num2);
		System.out.println("Maximum Number among "+num1+" "+num2+" "+num3+ " is  "+result);
		
	}

}
