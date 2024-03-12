package com.learning.core.day2;

import java.util.Scanner;

public class D02P15 {

	public static void main(String[] args) {
		
		int i, countP =0 ,countN =0, countZ =0;
		char ch;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("Enter the numbers :");
			int n =sc.nextInt();
			if(n>0)
			{
				countP++;
			}
			else if(n<0)
			{
				countN++;
			}
			else
			{
				countZ++;
			}
			System.out.println("Do you wish to continue(y/n :");
			ch = sc.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');
		
		System.out.println("Toatl Positive Numbers  :  "+countP);
		System.out.println("Toatl Negative Numbers  :  "+countN);
		System.out.println("Toatl Zero Numbers  :  "+countZ);

	}

}
