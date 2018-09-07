package com.supercharge.Test.service;

import com.supercharge.Test.exception.NoTransactionsException;
import com.supercharge.Test.model.*;
import com.supercharge.Test.exception.NotEnoughMoneyException;
import java.util.List;

public class BankImpl implements Bank {

    @Override
    public void transferMoney(BankAccount myAccount, BankAccount destinationAccount, Long amount) throws NotEnoughMoneyException {
        List<Transaction> myTransactions = myAccount.getTransactions();
        List<Transaction> destinationTransactions = destinationAccount.getTransactions();

        TransferTransaction transfer = new TransferTransaction(amount);

        myAccount.decreaseBalance(amount);
        destinationAccount.increaseBalance(amount);

        myTransactions.add(transfer);
        destinationTransactions.add(transfer);
    }

    @Override
    public void depositMoney(BankAccount myAccount, Long amount) {
        List<Transaction> myTransactions = myAccount.getTransactions();

        DepositTransaction deposit = new DepositTransaction(amount);

        myAccount.increaseBalance(amount);
        myTransactions.add(deposit);
    }

    @Override
    public void withDrawalMoney(BankAccount myAccount, Long amount) throws NotEnoughMoneyException {
        List<Transaction> myTransactions = myAccount.getTransactions();

        WithdrawalTransaction withdrawal = new WithdrawalTransaction(amount);

        myAccount.decreaseBalance(amount);
        myTransactions.add(withdrawal);
    }

    @Override
    public void printAccountHistory(String filter, BankAccount account) throws NoTransactionsException {
        List<Transaction> transactions = account.getTransactions();
        Long balance = account.getBalance();

        if (transactions.size() == 0) {
            throw new NoTransactionsException("No transactions yet!");
        }

        for (Transaction transaction : transactions) {
            if (filter.equals("none")) {
                System.out.println(transaction + ", Current balance: " + balance);
            } else if (filter.equals("deposit") && transaction instanceof DepositTransaction) {
                System.out.println(transaction + ", Current balance: " + balance);
            } else if (filter.equals("withdraval") && transaction instanceof WithdrawalTransaction) {
                System.out.println(transaction + ", Current balance: " + balance);
            }
        }
    }
}
