package com.learning.core.day4;

public class CricketRating {
	
	private String playerName;
    private float critic1;
    private float critic2;
    private float critic3;
    public float avgRating;
    private String coins;

    CricketRating(String playerName, float critic1) {
        this.playerName = playerName;
        this.critic1 = critic1;
       // this.critic2 = critic2;
       // calculateAverageRating(critic1);
        this.coins = calculateCoins();
    }

    CricketRating(String playerName, float critic1, float critic2, float critic3) {
        this.playerName = playerName;
        this.critic1 = critic1;
        this.critic2 = critic2;
        this.critic3 = critic3;
        calculateAverageRating(critic1, critic2, critic3);
        this.coins = calculateCoins();
    }

    void calculateAverageRating(float critic1) {
        this.avgRating = critic1;
    }

    void calculateAverageRating(float critic1, float critic2, float critic3) {
        this.avgRating = (critic1 + critic2 + critic3) / 3;
    }

    String calculateCoins() {
        if (avgRating >= 7)
            return "Gold";
        else if (avgRating >= 5 && avgRating < 7)
            return "Silver";
        else if (avgRating >= 2 && avgRating < 5)
            return "Copper";
        else {
            try {
                throw new NotEligibleException("Not eligible for coins");
            } catch (NotEligibleException e) {
                return e.getMessage();
            }
        }
    }

    void display() {
        System.out.println(playerName + " " + avgRating);
    }

}
