package com.learning.core.day2;

import java.util.Scanner;

public class D02P10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int reverse = 0;
		while(n != 0)
		{
			int temp = n % 10;
			reverse = reverse * 10 + temp;
			n = n / 10;
		}
		System.out.println(reverse);

	}

}
