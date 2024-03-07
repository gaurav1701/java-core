package com.learning.core.day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class D03P09 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        // Input the array of strings separated by space
	        System.out.print("Enter the array of strings separated by space: ");
	        String[] strings = scanner.nextLine().split(" ");

	        // Check if the strings can form a circle
	        boolean result = canFormCircle(strings);

	        // Output the result
	        if (result) {
	            System.out.println("Yes");
	        } else {
	            System.out.println("No");
	        }
	    }

	    public static boolean canFormCircle(String[] strings) {
	        // Create a graph where keys are first characters and values are lists of strings starting with that character
	        Map<Character, List<String>> graph = new HashMap<>();
	        for (String str : strings) {
	            char start = str.charAt(0);
	            char end = str.charAt(str.length() - 1);
	            if (!graph.containsKey(start)) {
	                graph.put(start, new ArrayList<>());
	            }
	            graph.get(start).add(str);
	        }

	        // Perform DFS to check if there is a cycle
	        Set<String> visited = new HashSet<>();
	        for (String str : strings) {
	            if (dfs(graph, str, visited)) {
	                return true;
	            }
	        }
	        return false;
	    }

	    private static boolean dfs(Map<Character, List<String>> graph, String str, Set<String> visited) {
	        char start = str.charAt(0);
	        char end = str.charAt(str.length() - 1);
	        if (visited.contains(str)) {
	            return false; // Cycle detected
	        }
	        visited.add(str);
	        if (!graph.containsKey(end)) {
	            visited.remove(str);
	            return false;
	        }
	        for (String next : graph.get(end)) {
	            if (dfs(graph, next, visited)) {
	                return true;
	            }
	        }
	        visited.remove(str);
	        return false;

	}

}
