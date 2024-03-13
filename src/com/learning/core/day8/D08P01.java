package com.learning.core.day8;

public class D08P01 {
    private static final int MAX_SIZE = 100;
    private int[] queueArray;
    private int front, rear, size;

    public D08P01() {
        queueArray = new int[MAX_SIZE];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int item) {
        if (size == MAX_SIZE) {
            System.out.println("Queue is full.");
            return;
        }
        rear = (rear + 1) % MAX_SIZE;
        queueArray[rear] = item;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        int removedItem = queueArray[front];
        front = (front + 1) % MAX_SIZE;
        size--;
        return removedItem;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Elements in queue: ");
        int index = front;
        for (int i = 0; i < size; i++) {
            System.out.print(queueArray[index] + " ");
            index = (index + 1) % MAX_SIZE;
        }
        System.out.println();
    }

    public static void main(String[] args) {
    	D08P01 queue = new D08P01();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.display();

        // Remove first element
        queue.dequeue();
        queue.display();
    }
}
