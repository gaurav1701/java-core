package com.learning.core.day7;
import java.util.Stack;
import java.util.Scanner;


public class D07P03 {
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();
        // Push characters onto the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        // Pop characters from the stack to form the reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String input = scanner.nextLine();
        scanner.close();

        String reversedString = reverseString(input);
        System.out.println("Reversed string: " + reversedString);
    }
}