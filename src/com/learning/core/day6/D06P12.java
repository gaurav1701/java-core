package com.learning.core.day6;

import java.util.Hashtable;

class Employee1 {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee1(int id, String name, String department, String designation) {
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
        Employee1 employee1 = (Employee1) obj;
        return id == employee1.id;
    }
}

public class D06P12 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee1> employeeTable = new Hashtable<>();

        // Predefined information for 4 employees
        Employee1 employee1 = new Employee1(1001, "Daniel", "L&D", "Analyst");
        Employee1 employee2 = new Employee1(1002, "Thomas", "Testing", "Tester");
        Employee1 employee3 = new Employee1(1003, "Robert", "Development", "Product Manager");
        Employee1 employee4 = new Employee1(1004, "Grace", "HR", "Tech Support");

        // Store predefined employees in the Hashtable
        employeeTable.put(employee1.hashCode(), employee1);
        employeeTable.put(employee2.hashCode(), employee2);
        employeeTable.put(employee3.hashCode(), employee3);
        employeeTable.put(employee4.hashCode(), employee4);

        // User input to add employees if they don't exist
        addEmployeeIfNotExists(employeeTable, 1005, "Charles", "Testing", "QA Lead");

        // Print the output
        printEmployeeTable(employeeTable);
    }

    private static void addEmployeeIfNotExists(Hashtable<Integer, Employee1> employeeTable,
                                               int id, String name, String department, String designation) {
        if (!employeeTable.containsKey(id)) {
            Employee1 newEmployee = new Employee1(id, name, department, designation);
            employeeTable.put(newEmployee.hashCode(), newEmployee);
        }
    }

    private static void printEmployeeTable(Hashtable<Integer, Employee1> employeeTable) {
        for (Employee1 employee : employeeTable.values()) {
            System.out.println(employee);
        }
    }
}