package com.supercharge.Test;

import com.supercharge.Test.exception.NoTransactionsException;
import com.supercharge.Test.exception.NotEnoughMoneyException;
import com.supercharge.Test.model.BankAccount;
import com.supercharge.Test.service.BankImpl;

public class TestApplication {

	public static void main(String[] args) throws NotEnoughMoneyException, NoTransactionsException {
        BankAccount myAccount = new BankAccount("111-222-333", (long) 150000);
        BankImpl bank = new BankImpl();
        System.out.println(myAccount);
        bank.depositMoney(myAccount, (long) 50000);
        bank.printAccountHistory("none", myAccount);
    }
}
