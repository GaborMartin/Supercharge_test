package com.supercharge.Test.Service;

import com.supercharge.Test.Model.BankAccount;

public interface Bank {

    void transferMoney(BankAccount myAccount, BankAccount destinationAccount, Double amount);

    void depositMoney(BankAccount myAccount, Double amount);

    void withDrawalMoney(BankAccount myAccount, Double amount);

}
