package com.learning.core.day2;

import java.util.Scanner;

public class D02P03 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the First Number :");
		 int num1 = sc.nextInt();
		 System.out.println("Enter the Second Number :");
		 int num2 = sc.nextInt();
		 System.out.println("Enter the operator");
		 char ch = sc.next().charAt(0);
		 double result;
		 switch(ch)
		 {
		 case '+': result=num1 + num2;
		 		    System.out.println(num1 +" + "+ num2 +" = "+ result);break;  
		 case '-': result=num1 - num2;
		 			System.out.println(num1 +" - "+ num2 +" = "+ result);break;
		 case '*': result=num1 * num2;
		 			System.out.println(num1 +" X "+ num2 +" = "+ result);break;
		 case '/': result=num1 / num2;
		 			System.out.println(num1 +" / "+ num2 +" = "+ result);break;
		   
		 }
	}

}
