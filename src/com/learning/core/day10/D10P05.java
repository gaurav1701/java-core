package com.learning.core.day10;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class D10P05 {
    public static void main(String[] args) {
        String inputString = getUserInput();
        writeToFile(inputString);
        displayFileSize();
        readFromFileAndDisplay();
        deleteFile();
    }

    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();
        return inputString;
    }

    public static void writeToFile(String inputString) {
        try (FileWriter writer = new FileWriter("io.txt")) {
            writer.write(inputString);
            System.out.println("String written to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void displayFileSize() {
        File file = new File("io.txt");
        long fileSize = file.length();
        System.out.println("File size: " + fileSize + " bytes");
    }

    public static void readFromFileAndDisplay() {
        try (FileReader reader = new FileReader("io.txt")) {
            int character;
            StringBuilder content = new StringBuilder();
            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }
            System.out.println("File contents:");
            System.out.println(content.toString());
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }

    public static void deleteFile() {
        File file = new File("io.txt");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}

