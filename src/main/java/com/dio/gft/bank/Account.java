package com.dio.gft.bank;

public abstract class Account implements IAccount {


    protected int agency;
    protected int account;
    protected double balance;
    protected Account accountClient;
    private Client client;


    private static final int DEFAULT_AGENCY = 1;
    private static int SEQUENCY_NUMBER = 1;


    public Account() {
    }

    public Account(Client client) {
        this.agency = Account.DEFAULT_AGENCY;
        this.account = SEQUENCY_NUMBER++;
        this.client = client;
    }

    public int getAgency() {
        return agency;
    }


    public int getAccount() {
        return account;
    }


    public double getBalance() {
        return balance;
    }

    public Account getAccountClient(Account accountClient) {
        return accountClient;
    }

    public Client getClient(Client client){
        return client;
    }

    @Override
    public void withdraw(double value) {
        balance -= value;
    }

    @Override
    public void deposit(double value) {
        balance += value;
    }

    @Override
    public void transfer(double value, Account destinyAccount) {
        this.withdraw(value);
        destinyAccount.deposit(value);

    }
    @Override
    public void printTransactions() {

    }



    protected void printSimilarInfo() {

        System.out.println(String.format("Agency: %d", this.agency));
        System.out.println(String.format("Account: %d", this.account));
        System.out.println(String.format("Balance: %.2f", this.balance ));
        System.out.println();
    }



}
