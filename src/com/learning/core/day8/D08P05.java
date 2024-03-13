package com.learning.core.day8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class D08P05 {
    public static Queue<Integer>[] splitQueue(Queue<Integer> inputQueue) {
        Queue<Integer> oddQueue = new LinkedList<>();
        Queue<Integer> evenQueue = new LinkedList<>();

        while (!inputQueue.isEmpty()) {
            int num = inputQueue.poll();
            if (num % 2 == 0) {
                evenQueue.add(num);
            } else {
                oddQueue.add(num);
            }
        }

        return new Queue[]{oddQueue, evenQueue};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements of the queue separated by spaces:");
        String inputLine = scanner.nextLine();
        Queue<Integer> inputQueue = new LinkedList<>();
        
        // Process input
        String[] elements = inputLine.trim().split("\\s+");
        for (String element : elements) {
            inputQueue.add(Integer.parseInt(element));
        }

        Queue<Integer>[] result = splitQueue(inputQueue);

        // Output
        System.out.print("Odd Queue: ");
        while (!result[0].isEmpty()) {
            System.out.print(result[0].poll() + " ");
        }
        System.out.println();

        System.out.print("Even Queue: ");
        while (!result[1].isEmpty()) {
            System.out.print(result[1].poll() + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}
