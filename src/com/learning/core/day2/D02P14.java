package com.learning.core.day2;

import java.util.Scanner;

public class D02P14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base :");
		int n1 = sc.nextInt();
		System.out.println("Enter the exponent :");
		int n2 = sc.nextInt();
		int result =1;
		for(int i=1; i<=n2; i++)
		{
			result = result * n1;
		}
		System.out.println(result);
		
	}

}
