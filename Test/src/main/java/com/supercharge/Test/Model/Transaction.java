package com.supercharge.Test.Model;
import java.util.Date;

public abstract class Transaction {

    private Date date;
    private Double amount;

    public Transaction(Double amount) {
        this.date = new Date();
        this.amount = amount;
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

    @Override
    public String toString() {
        return "Transaction{" +
                "date=" + date +
                ", amount=" + amount +
                '}';
    }
}
