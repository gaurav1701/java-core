package com.learning.core.day2;

import java.util.Scanner;

public class D02P13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number :");
		int n = sc.nextInt();
		int temp = 1;
		for(int i=1; i<=n;i++)
		{
			temp = temp * i;
		}
		System.out.println(temp);

	}

}
