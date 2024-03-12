package com.learning.core.day7;

import java.util.Scanner;

class Node {
    double data;
    Node next;

    Node(double data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top;

    Stack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(double data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public double pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return Double.MIN_VALUE;
        } else {
            double poppedData = top.data;
            top = top.next;
            return poppedData;
        }
    }

    public void display() {
        Node current = top;
        System.out.print("The elements of the stack are: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class D07P02 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);

       // System.out.println("Enter elements to push onto the stack (separated by spaces):");
        String input = scanner.nextLine();
        String[] elements = input.split("\\s+");

        // Pushing elements onto the stack
        for (String element : elements) {
            try {
                double data = Double.parseDouble(element);
                stack.push(data);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + element);
            }
        }

        scanner.close();

        // Displaying the stack
        stack.display();

        // Popping twice
        double poppedElement1 = stack.pop();
        double poppedElement2 = stack.pop();

        System.out.println("After popping twice: ");
        stack.display();
    }
}