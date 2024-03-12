package com.learning.core.day7;

import java.util.Scanner;
import java.util.Stack;

public class D07P06 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements separated by space:");
        String input = scanner.nextLine();
        String[] elements = input.split(" ");
        
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();
        
        // Push elements onto the stack
        for (String element : elements) {
            int num = Integer.parseInt(element);
            stack.push(num);
            if (minStack.isEmpty() || num <= minStack.peek()) {
                minStack.push(num);
            }
        }
        
        System.out.println("Minimum element in the stack: " + minStack.peek());
        scanner.close();
    }
}
