package com.learning.core.day4;

import java.util.Scanner;

public class D04P02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter player details (name critic1 critic2 critic3):");
        String playerName = scanner.next();
        float critic1 = scanner.nextFloat();
        float critic2 = scanner.nextFloat();
        float critic3 = scanner.nextFloat();
        CricketRating player1 = new CricketRating(playerName, critic1, critic2, critic3);
        player1.display();

        System.out.println("Enter player details (name critic1):");
        playerName = scanner.next();
        critic1 = scanner.nextFloat();
       // critic2 = scanner.nextFloat();
        
        CricketRating player2 = new CricketRating(playerName, critic1);
        player2.display();

        scanner.close();
	}

}
