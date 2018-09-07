package com.supercharge.Test.Model;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private String accountNumber;
    private Double balance;
    List<Transaction> transactions;

    public BankAccount(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactions = new ArrayList<>();
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

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
