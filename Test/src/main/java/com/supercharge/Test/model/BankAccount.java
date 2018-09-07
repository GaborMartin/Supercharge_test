package com.supercharge.Test.model;

import com.supercharge.Test.exception.NotEnoughMoneyException;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private String accountNumber;
    private Long balance;
    private List<Transaction> transactions;

    public BankAccount(String accountNumber, Long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Long getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void increaseBalance(Long amount) {
        this.balance += amount;
    }

    public void decreaseBalance(Long amount) throws NotEnoughMoneyException {
        if (balance < amount || balance == 0) {
            throw new NotEnoughMoneyException("Current balance is lower than the amount!");
        }
        this.balance -= amount;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "AccountNumber: " + accountNumber
                + ", Balance: " + balance
                + ", transactions: " + transactions + '}';
    }
}
