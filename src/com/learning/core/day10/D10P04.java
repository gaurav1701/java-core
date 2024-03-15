package com.learning.core.day10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class D10P04 {
    public static void main(String[] args) {
        // Source and destination file paths
        String sourceFilePath = "C:\\Users\\gktha\\Desktop\\source.txt"; // Replace "source.txt" with the path to your source file
        String destinationFilePath = "C:\\Users\\gktha\\Desktop\\destination.txt"; // Replace "destination.txt" with the path to your destination file

        try {
            // Copy the contents of the source file to the destination file
            copyFile(sourceFilePath, destinationFilePath);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while copying the file: " + e.getMessage());
        }
    }

    // Method to copy contents from source file to destination file
    private static void copyFile(String sourceFilePath, String destinationFilePath) throws IOException {
        Path sourcePath = Paths.get(sourceFilePath);
        Path destinationPath = Paths.get(destinationFilePath);
        Files.copy(sourcePath, destinationPath);
    }
}