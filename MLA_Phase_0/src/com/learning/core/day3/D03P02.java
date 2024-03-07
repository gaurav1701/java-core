package com.learning.core.day3;

import java.util.Scanner;

public class D03P02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers in the range from 1 to 40: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int[] array = {7, 25, 5, 19, 30};

        boolean found1 = false;
        boolean found2 = false;
        for (int i = 0; i < array.length; i++) {
            if (num1 == array[i]) {
                found1 = true;
            }
            if (num2 == array[i]) {
                found2 = true;
            }
        }

        if (found1 && found2) {
            System.out.println("Its Bingo");
        } else {
            System.out.println("Not Found");
        }

	}

}
