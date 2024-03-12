package com.learning.core.day7;

import java.util.Scanner;
import java.util.Stack;

public class D07P07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers for the stack separated by spaces:");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        Stack<Integer> stack = new Stack<>();
        for (String number : numbers) {
            stack.push(Integer.parseInt(number));
        }

        boolean result = isBottomElementEven(stack);
        System.out.println(result);
        
        scanner.close();
    }

    public static boolean isBottomElementEven(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return false;
        }

        Stack<Integer> tempStack = new Stack<>();
        boolean isBottomEven = false;

        // Pop elements and find bottom element
        while (!stack.isEmpty()) {
            int element = stack.pop();
            tempStack.push(element);
            if (stack.isEmpty()) {
                isBottomEven = element % 2 == 0;
            }
        }

        // Restore the stack
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }

        return isBottomEven;
    }
}