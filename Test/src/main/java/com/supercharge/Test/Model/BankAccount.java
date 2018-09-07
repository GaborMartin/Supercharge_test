package com.supercharge.Test.Model;

public class BankAccount {

    private String accountNumber;
    private Double balance;

    public BankAccount(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void increaseBalance(Double amount) {
        this.balance += amount;
    }

    public void decreaseBalance(Double amount) {
        this.balance += amount;
    }
}
