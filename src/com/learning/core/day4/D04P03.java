package com.learning.core.day4;

import java.util.Scanner;

public class D04P03 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter applicant details (name post age):");
        String name = scanner.next();
        String post = scanner.next();
        int age = scanner.nextInt();

        Applicant applicant = new Applicant(name, post, age);
        Validator validator = new Validator();

        try {
            validator.validate(applicant);
        } catch (CatheyBankException e) {
            System.out.println(e.getMessage());
        }
	}

}
