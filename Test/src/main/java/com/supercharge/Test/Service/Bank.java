package com.supercharge.Test.Service;

public interface Bank {

    void transferMoney(String accountNumber, Double amount);

    void depositMoney(String accountNumber, Double amount);

    void withDrawalMoney(String accountNumber, Double amount);

}
