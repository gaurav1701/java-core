package com.learning.core.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class D03P05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Input array elements
        System.out.print("Enter the array elements separated by space: ");
        String[] input = scanner.nextLine().split(" ");
        int[] arr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        // Input the value of k
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        // Find all distinct combinations of numbers
        List<String> combinations = findCombinations(arr, k);

        // Output the combinations
        System.out.println("Output:");
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }

    public static List<String> findCombinations(int[] arr, int k) {
        List<String> result = new ArrayList<>();

        // Generate combinations using recursion
        generateCombinations(arr, k, 0, new ArrayList<>(), result);

        return result;
    }

    public static void generateCombinations(int[] arr, int k, int start, List<Integer> current, List<String> result) {
        if (current.size() == k) {
            result.add(convertToString(current));
            return;
        }

        for (int i = start; i < arr.length; i++) {
            current.add(arr[i]);
            generateCombinations(arr, k, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }

    public static String convertToString(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i < list.size() - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }


}
