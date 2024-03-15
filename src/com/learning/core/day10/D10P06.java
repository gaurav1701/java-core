package com.learning.core.day10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class D10P06 {
    public static void main(String[] args) {
        String semester1EnglishFile = "C:\\Users\\gktha\\Desktop\\DavidEnglish.txt";
        String semester1ScienceFile = "C:\\Users\\gktha\\Desktop\\DavidScience.txt";
        String semester2ComputerFile = "C:\\Users\\gktha\\Desktop\\DavidComputer.txt";
        String outputFileName = "C:\\Users\\gktha\\Desktop\\DavidNotes.txt";

        try (BufferedReader englishReader = new BufferedReader(new FileReader(semester1EnglishFile));
             BufferedReader scienceReader = new BufferedReader(new FileReader(semester1ScienceFile));
             BufferedReader computerReader = new BufferedReader(new FileReader(semester2ComputerFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

            // Read and write Semester 1 English notes
            String line;
            writer.write("Semester 1 English Notes:\n");
            while ((line = englishReader.readLine()) != null) {
                writer.write(line + "\n");
            }
            writer.write("\n");

            // Read and write Semester 1 Science notes
            writer.write("Semester 1 Science Notes:\n");
            while ((line = scienceReader.readLine()) != null) {
                writer.write(line + "\n");
            }
            writer.write("\n");

            // Read and write Semester 2 Computer notes
            writer.write("Semester 2 Computer Notes:\n");
            while ((line = computerReader.readLine()) != null) {
                writer.write(line + "\n");
            }
            writer.write("\n");

            System.out.println("Notes merged successfully to " + outputFileName);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
