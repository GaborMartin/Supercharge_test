package com.supercharge.Test.Model;

import java.util.Date;

public class DepositTransaction extends Transaction {

    private Date date;
    private Double amount;
    private Double balance;

    public DepositTransaction(Date date, Double amount, Double balance) {
        super(date, amount, balance);
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public Double getAmount() {
        return amount;
    }

    @Override
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public Double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "DepositTransaction{" +
                "date=" + date +
                ", amount=" + amount +
                ", balance=" + balance +
                '}';
    }
}
