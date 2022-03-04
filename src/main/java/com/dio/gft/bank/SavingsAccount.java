package com.dio.gft.bank;

public class SavingsAccount extends Account{

    public SavingsAccount() {

    }

    public SavingsAccount(Client client) {
        super(client);
    }

    @Override
    public void printTransactions() {
        System.out.println(" - Savings Account Transactions - ");
        super.printSimilarInfo();

    }
}
