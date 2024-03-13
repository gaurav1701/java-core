package com.learning.core.day8;

public class D08P03 {
    private static final int MAX_SIZE = 5;
    private int[] queueArray;
    private int front, rear, size;

    public D08P03() {
        queueArray = new int[MAX_SIZE];
        front = rear = -1;
        size = 0;
    }

    public void enqueue(int item) {
        if ((rear + 1) % MAX_SIZE == front) {
            System.out.println("Queue is full.");
            return;
        }
        if (isEmpty())
            front = 0;
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
        if (front == rear)
            front = rear = -1;
        else
            front = (front + 1) % MAX_SIZE;
        size--;
        return removedItem;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Elements in circular queue: ");
        int index = front;
        for (int i = 0; i < size; i++) {
            System.out.print(queueArray[index] + " ");
            index = (index + 1) % MAX_SIZE;
        }
        System.out.println();
    }

    public static void main(String[] args) {
    	D08P03 queue = new D08P03();
        queue.enqueue(14);
        queue.enqueue(13);
        queue.enqueue(22);
        queue.enqueue(-8);
        queue.display();

        // Remove first element
        queue.dequeue();
        queue.display();
    }
}
