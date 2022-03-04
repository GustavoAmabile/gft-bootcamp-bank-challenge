package com.dio.gft.bank;

public interface IAccount {

     void withdraw(double value);

     void deposit(double value);

     void transfer(double value, Account destinyAccount);

     void printTransactions();

}
