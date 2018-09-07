package com.supercharge.Test.Model;

import java.util.Date;

public abstract class Transaction {

    private Date date;
    private Double amount;
    private Double balance;

    public Transaction(Date date, Double amount, Double balance) {
        this.date = date;
        this.amount = amount;
        this.balance = balance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
