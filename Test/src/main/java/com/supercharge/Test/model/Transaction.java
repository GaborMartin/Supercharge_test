package com.supercharge.Test.model;

import java.util.Date;

public abstract class Transaction {

    private Date date;
    private Long amount;

    public Transaction(Long amount) {
        this.date = new Date();
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Date: "+ date + ", Amount: " + amount;
    }
}
