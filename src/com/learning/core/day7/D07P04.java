package com.learning.core.day7;

import java.util.Scanner;
import java.util.Stack;

public class D07P04 {
	
	 public static int evaluateExpression(String expression) {
	        Stack<Integer> operandStack = new Stack<>();
	        Stack<Character> operatorStack = new Stack<>();

	        for (char currentChar : expression.toCharArray()) {
	            if (Character.isDigit(currentChar)) {
	                operandStack.push(Character.getNumericValue(currentChar));
	            } else if (isOperator(currentChar)) {
	                while (!operatorStack.isEmpty() && hasPrecedence(currentChar, operatorStack.peek())) {
	                    evaluateTopOperation(operandStack, operatorStack);
	                }
	                operatorStack.push(currentChar);
	            }
	        }

	        while (!operatorStack.isEmpty()) {
	            evaluateTopOperation(operandStack, operatorStack);
	        }

	        return operandStack.pop();
	    }

	    private static boolean isOperator(char c) {
	        return c == '+' || c == '-' || c == '*' || c == '/';
	    }

	    private static boolean hasPrecedence(char op1, char op2) {
	        return (op2 == '+' || op2 == '-') && (op1 == '*' || op1 == '/');
	    }

	    private static void evaluateTopOperation(Stack<Integer> operandStack, Stack<Character> operatorStack) {
	        int operand2 = operandStack.pop();
	        int operand1 = operandStack.pop();
	        char operator = operatorStack.pop();
	        int result = switch (operator) {
	            case '+' -> operand1 + operand2;
	            case '-' -> operand1 - operand2;
	            case '*' -> operand1 * operand2;
	            case '/' -> operand1 / operand2;
	            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
	        };
	        operandStack.push(result);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter an arithmetic expression");
	        String userInput = scanner.nextLine();

	        try {
	            int result = evaluateExpression(userInput);
	            System.out.println("Output: " + result);
	        } catch (Exception e) {
	            System.out.println("Please check your input.");
	        }

	        scanner.close();
	    }	

}