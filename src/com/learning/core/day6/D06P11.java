package com.learning.core.day6;

import java.util.Hashtable;

class Employee {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee(int id, String name, String department, String designation) {
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
        Employee employee = (Employee) obj;
        return id == employee.id;
    }
}
public class D06P11 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();

        // Predefined information for 4 employees
        Employee employee1 = new Employee(1001, "John", "HR", "HR Manager");
        Employee employee2 = new Employee(1002, "Alice", "Finance", "Finance Analyst");
        Employee employee3 = new Employee(1003, "Robert", "Development", "Product Manager");
        Employee employee4 = new Employee(1004, "Sara", "Marketing", "Marketing Specialist");

        // Store employees in the Hashtable with employee id as the key
        employeeTable.put(employee1.hashCode(), employee1);
        employeeTable.put(employee2.hashCode(), employee2);
        employeeTable.put(employee3.hashCode(), employee3);
        employeeTable.put(employee4.hashCode(), employee4);

        // Search for a specific Employee using employee id
        int searchId = 1003;
        Employee searchedEmployee = employeeTable.get(searchId);

        // Print the output
        if (searchedEmployee != null) {
            System.out.println(searchedEmployee);
        } else {
            System.out.println("Employee with id " + searchId + " not found.");
        }
    }
}