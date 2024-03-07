package com.learning.core.day5;

import java.util.ArrayList;
import java.util.Scanner;

public class D05P02 {
	
	public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student names (enter 'done' when finished):");
        String name;
        while (!(name = scanner.next()).equalsIgnoreCase("done")) {
            studentList.add(name);
        }

       
        System.out.println("Enter a name to search for:");
        String searchName = scanner.next();
        if (studentList.contains(searchName)) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }

}
