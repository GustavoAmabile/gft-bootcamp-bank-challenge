package com.dio.gft.bank;

public class CheckingAccount extends Account{

    public CheckingAccount() {
    }

//    public CheckingAccount(Account accountClient) {
//        super(accountClient);
//    }

    @Override
    public void printTransactions() {
        System.out.println(" - Checking Account Transactions - ");
        super.printSimilarInfo();

    }



}
