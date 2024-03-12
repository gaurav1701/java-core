package com.learning.core.day6;

import java.util.Hashtable;
import java.util.Map;

public class D06P10 {
    private int id;
    private String name, department, designation;

    public D06P10(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    public static void main(String[] args) {
        D06P10 employee1 = new D06P10(1, "John Doe", "IT", "Software Engineer");
        D06P10 employee2 = new D06P10(2, "Jane Doe", "HR", "HR Manager");
        D06P10 employee3 = new D06P10(3, "Bob Smith", "Finance", "Finance Analyst");
        D06P10 employee4 = new D06P10(4, "Alice Johnson", "Marketing", "Marketing Manager");

        Hashtable<Integer, D06P10> employees = new Hashtable<>(Map.of(
                employee1.id, employee1,
                employee2.id, employee2,
                employee3.id, employee3,
                employee4.id, employee4
        ));

        System.out.println("Is the Hashtable empty?\n" +employees.isEmpty());
    }
}
