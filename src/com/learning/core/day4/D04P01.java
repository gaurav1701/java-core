package com.learning.core.day4;

import java.util.Scanner;

public class D04P01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account number, customer name, account type, and initial balance:");
        int accNo = scanner.nextInt();
        String custName = scanner.next();
        String accType = scanner.next();
        float initialBalance = scanner.nextFloat();

        try {
            BankAccount account = new BankAccount(accNo, custName, accType, initialBalance);
            
            System.out.println("Enter the amount to deposit:");
            float depositAmount = scanner.nextFloat();
            account.deposit(depositAmount);

            float balance = account.getBalance();
            System.out.println("Current balance: " + balance);
        } catch (LowBalanceException | NegativeAmountException e) {
            System.out.println(e.getMessage());
        }
	}

}
