package com.learning.core.day7;

public class D07P01 {
    private int maxSize;
    private String[] stackArray;
    private int top;

    public D07P01(int size) {
        this.maxSize = size;
        this.stackArray = new String[maxSize];
        this.top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public void push(String item) {
        if (!isFull()) {
            top++;
            stackArray[top] = item;
        } else {
            System.out.println("Stack is full, cannot push element");
        }
    }

    public String pop() {
        if (!isEmpty()) {
            String poppedItem = stackArray[top];
            top--;
            return poppedItem;
        } else {
            System.out.println("Stack is empty, cannot pop element");
            return null;
        }
    }

    public void display() {
        //System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
    	D07P01 stack = new D07P01(5);

        // Pushing elements
    	stack.push("Hello");
    	stack.push("world");
    	stack.push("java");
        stack.push("Programming");
        
       
        

        System.out.println("After Pushing 4 Elements:");
        stack.display();

        // Popping an element
        String poppedElement = stack.pop();
        System.out.println("After a Pop: ");

        // Displaying the stack after popping
        stack.display();
    }
}
