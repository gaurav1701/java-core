package com.learning.core.day7;
import java.util.Stack;
import java.util.Scanner;

public class D07P05 {
	public static void reverseStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            reverseStack(stack);
            insertAtBottom(stack, temp);
        }
    }

    private static void insertAtBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
        } else {
            int temp = stack.pop();
            insertAtBottom(stack, item);
            stack.push(temp);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sequence of numbers (e.g., 1234): ");
        String userInput = scanner.nextLine();

        Stack<Integer> inputStack = new Stack<>();
        for (char c : userInput.toCharArray()) {
            if (Character.isDigit(c)) {
                inputStack.push(Character.getNumericValue(c));
            }
        }

        System.out.println(inputStack);

        reverseStack(inputStack);

        System.out.println(inputStack);

        scanner.close();
    }

}