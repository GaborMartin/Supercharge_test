package com.supercharge.Test.Service;

import com.supercharge.Test.Model.*;

import java.util.List;

public class BankImpl implements Bank {

    @Override
    public void transferMoney(BankAccount myAccount, BankAccount destinationAccount, Double amount) {
        List<Transaction> myTransactions = myAccount.getTransactions();
        TransferTransaction transfer = new TransferTransaction(amount);

        myAccount.decreaseBalance(amount);
        destinationAccount.increaseBalance(amount);

        myTransactions.add(transfer);
    }

    @Override
    public void depositMoney(BankAccount myAccount, Double amount) {
        List<Transaction> myTransactions = myAccount.getTransactions();

        DepositTransaction deposit = new DepositTransaction(amount);

        myAccount.increaseBalance(amount);
        myTransactions.add(deposit);
    }

    @Override
    public void withDrawalMoney(BankAccount myAccount, Double amount) {
        List<Transaction> myTransactions = myAccount.getTransactions();

        WithdrawalTransaction withdrawal = new WithdrawalTransaction(amount);

        myAccount.decreaseBalance(amount);
        myTransactions.add(withdrawal);
    }
}
