package com.learning.core.day10;

import java.io.*;

public class D10P03 {
    public static void main(String[] args) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("students_records.dat"))) {
            System.out.println("Displaying all records from the file:");
            while (true) {
                try {
                    Student student = (Student) inputStream.readObject();
                    System.out.println("Roll Number: " + student.getRollNo() + ", Name: " + student.getName() + ", Age: " + student.getAge());
                } catch (EOFException e) {
                    break; // End of file reached
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error occurred while reading file: " + e.getMessage());
        }
    }
}