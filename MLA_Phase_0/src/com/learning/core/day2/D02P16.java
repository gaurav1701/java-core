package com.learning.core.day2;

import java.util.Scanner;

public class D02P16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n = sc.nextInt();
		int f=0, f1=0, f2=1;
		System.out.println(f1+" "+f2+" ");
		f=f1+f2;
		while(f<=n)
		{
			System.out.println(f+" ");
			f1=f2;
			f2=f;
			f=f1+f2;
		}
			
		
	}

}
