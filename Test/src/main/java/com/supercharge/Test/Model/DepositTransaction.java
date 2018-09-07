package com.supercharge.Test.Model;

import java.util.Date;

public class DepositTransaction extends Transaction {

    public DepositTransaction(Date date, Double amount, Double balance) {
        super(date, amount, balance);
    }
}
