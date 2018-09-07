package com.supercharge.Test.Model;

import java.util.Date;

public class WithdrawalTransaction extends Transaction {

    public WithdrawalTransaction(Date date, Double amount, Double balance) {
        super(date, amount, balance);
    }
}
