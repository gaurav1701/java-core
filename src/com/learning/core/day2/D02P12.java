package com.learning.core.day2;

import java.util.Scanner;

public class D02P12 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) 
        {
            for (int j = 0; j < n - i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


	}

}
