package com.supercharge.Test.service;

import com.supercharge.Test.exception.NoTransactionsException;
import com.supercharge.Test.exception.NotEnoughMoneyException;
import com.supercharge.Test.model.BankAccount;

public interface Bank {

    void transferMoney(BankAccount myAccount, BankAccount destinationAccount, Long amount) throws NotEnoughMoneyException;

    void depositMoney(BankAccount myAccount, Long amount);

    void withDrawalMoney(BankAccount myAccount, Long amount) throws NotEnoughMoneyException;

    void printAccountHistory(String filter, BankAccount account) throws NoTransactionsException;

}
