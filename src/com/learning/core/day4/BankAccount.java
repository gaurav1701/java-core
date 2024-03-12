package com.learning.core.day4;

public class BankAccount {
	
	private int accNo;
    private String custName;
    private String accType;
    private float balance;

    public BankAccount(int accNo, String custName, String accType, float initialBalance) throws LowBalanceException {
        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;
        if (initialBalance < 0) {
            throw new LowBalanceException("Negative Amount");
        }
        else if ((accType.equals("Saving") && initialBalance < 1000) || (accType.equals("Current") && initialBalance < 5000)) {
            throw new LowBalanceException("Low Balance");
        }
       
        this.balance = initialBalance;
    }

    public void deposit(float amt) throws NegativeAmountException {
        if (amt < 0) {
            throw new NegativeAmountException("Negative Amount");
        }
        balance += amt;
        System.out.println("Amount deposited successfully. Current balance: " + balance);
    }

    public float getBalance() throws LowBalanceException {
        if ((accType.equals("Saving") && balance < 1000) || (accType.equals("Current") && balance < 5000)) {
            throw new LowBalanceException("Low Balance");
        }
        return balance;
    }
}



