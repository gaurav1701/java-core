package com.learning.core.day6;

import java.util.Hashtable;

class Employee2 {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee2(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + designation + " " + department;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee2 employee2 = (Employee2) obj;
        return id == employee2.id;
    }
}

public class D06P13 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();

        // Predefined information for 4 employees
        Employee employee1 = new Employee(1001, "Daniel", "L&D", "Analyst");
        Employee employee2 = new Employee(1002, "Thomas", "Testing", "Tester");
        Employee employee3 = new Employee(1003, "Robert", "Development", "Product Manager");
        Employee employee4 = new Employee(1004, "Grace", "HR", "Tech Support");
        Employee employee5 = new Employee(1005, "Alice", "Finance", "Finance Analyst");
        // Store predefined employees in the Hashtable
        employeeTable.put(employee1.hashCode(), employee1);
        employeeTable.put(employee2.hashCode(), employee2);
        employeeTable.put(employee3.hashCode(), employee3);
        employeeTable.put(employee4.hashCode(), employee4);
        employeeTable.put(employee5.hashCode(), employee5);
        // Get the number of keys in the Hashtable
        int numberOfKeys = employeeTable.size();

        // Print the output
        System.out.println(numberOfKeys);
    }
}
