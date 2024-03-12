package com.learning.core.day6;

import java.util.Hashtable;
import java.util.Map;

class Employee3 {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee3(int id, String name, String department, String designation) {
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

        Employee3 employee3 = (Employee3) obj;
        return id == employee3.id;
    }
}
public class D06P14 {

    public static void main(String[] args) {
        Map<Integer, Employee> employeeHashTable = new Hashtable<>();

        // Creating Employee instances
        Employee employee1 = new Employee(1006, "Henry", "Finance", "Accountant");
        Employee employee2 = new Employee(1005, "Charles", "Testing", "QA Lead");
        Employee employee3 = new Employee(1004, "Grace", "HR", "Tech Support");
        Employee employee4 = new Employee(1003, "Robert", "Development", "Product Manager");

        // Adding employees to the HashTable
        employeeHashTable.put(employee1.hashCode(), employee1);
        employeeHashTable.put(employee2.hashCode(), employee2);
        employeeHashTable.put(employee3.hashCode(), employee3);
        employeeHashTable.put(employee4.hashCode(), employee4);

        // Creating a new Collection with additional data
        Map<Integer, Employee> additionalEmployeeData = new Hashtable<>();
        Employee employee5 = new Employee(1002, "Thomas", "Testing", "Tester");
        Employee employee6 = new Employee(1001, "Daniel", "L&D", "Analyst");

        // Adding new employees to the additional collection
        additionalEmployeeData.put(employee5.hashCode(), employee5);
        additionalEmployeeData.put(employee6.hashCode(), employee6);

        // Adding employees from the additional collection to the main HashTable
        employeeHashTable.putAll(additionalEmployeeData);

        // Displaying the employee details
        employeeHashTable.values().forEach(System.out::println);
    }
}
