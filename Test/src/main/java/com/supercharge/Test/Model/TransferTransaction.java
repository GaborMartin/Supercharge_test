package com.supercharge.Test.Model;

import java.util.Date;

public class TransferTransaction extends Transaction {

    public TransferTransaction(Date date, Double amount, Double balance) {
        super(date, amount, balance);
    }
}
