package com.learning.core.day8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class D08P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input queue
        System.out.println("Enter elements of the queue separated by spaces:");
        String input = scanner.nextLine();
        Queue<String> queue1 = new LinkedList<>();
        if (!input.equals("[]")) {
            String[] elements = input.replaceAll("\\[|\\]", "").split(",?\\s+");
            for (String element : elements) {
                queue1.add(element);
            }
        }

        // Check if queue is empty
        if (!queue1.isEmpty()) {
            System.out.println("Output 1: Not Empty");
        } else {
            System.out.println("Output 1: Empty");
        }

        // Input empty queue
        System.out.println("Enter elements of the queue separated by spaces:");
        input = scanner.nextLine();
        Queue<String> queue2 = new LinkedList<>();
        if (!input.equals("[]")) {
            String[] elements = input.replaceAll("\\[|\\]", "").split(",?\\s+");
            for (String element : elements) {
                queue2.add(element);
            }
        }

        // Check if empty queue is empty
        if (!queue2.isEmpty()) {
            System.out.println("Output 2: Not Empty");
        } else {
            System.out.println("Output 2: Empty");
        }
        
        scanner.close();
    }
}
