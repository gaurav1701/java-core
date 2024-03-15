package com.learning.core.day10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

class Student implements Serializable {
    private int rollNo;
    private String name;
    private int age;
    private String address;

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        //this.address = address;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

   /* public String getAddress() {
        return address;
    }*/
}

public class D10P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Student student = acceptStudent(scanner);
            if (student != null) {
                System.out.print("Do you want to save this record to file? (yes/no): ");
                String choice = scanner.nextLine().toLowerCase();
                if (choice.equals("yes")) {
                    writeToFile(student);
                } else {
                    break;
                }
            }
        }
        scanner.close();
    }

    private static Student acceptStudent(Scanner scanner) {
        try {
            System.out.print("Enter Roll Number: ");
            int rollNo = Integer.parseInt(scanner.nextLine().trim());
            System.out.print("Enter Name: ");
            String name = scanner.nextLine().trim();
            System.out.print("Enter Age: ");
            int age = Integer.parseInt(scanner.nextLine().trim());
          //  System.out.print("Enter Address: ");
          //  String address = scanner.nextLine().trim();

            if (rollNo == 0 || name.isEmpty() || age == 0 ){//|| address.isEmpty()) {
                throw new CustomException("Fields cannot be blank");
            }

            return new Student(rollNo, name, age);
        } catch (NumberFormatException e) {
            System.out.println("Roll Number and Age must be numeric.");
            return null;
        } catch (CustomException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    private static void writeToFile(Student student) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("students_records.dat", true))) {
            outputStream.writeObject(student);
            System.out.println("Record saved to file.");
        } catch (IOException e) {
            System.out.println("Error occurred while saving to file: " + e.getMessage());
        }
    }
}