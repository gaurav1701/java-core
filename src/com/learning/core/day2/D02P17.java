package com.learning.core.day2;

import java.util.Scanner;

public class D02P17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Prime numbers from 1 to " + n + ":");
        for (int i = 2; i <= n; i++)
        {
            if (isPrime(i))
            {
                System.out.print(i);
                if (i != n)
                {
                    System.out.print(", ");
                }
            }
        }

    }

    public static boolean isPrime(int num) {
        if (num <= 1) 
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0) 
            {
                return false;
            }
        }
        return true;

	}

}
