package com.dio.gft.bank;

import java.util.Date;
public class BankTest {


    public static void main(String[] args) {



            Date birthDate = new Date();
            Client joe = new SavingsAccountClient("Joe Friberg", "10.899.786", "098.786.654-98", birthDate);

            /*first test*/
            Account ca = new CheckingAccount();
            Account sa = new SavingsAccount();
//
//        ca.printTransactions();
//        sa.printTransactions();
//
            ca.deposit(100);
            sa.deposit(400);
//
//        ca.printTransactions();
//        sa.printTransactions();
//
        ca.transfer(100, sa);
//
            ca.printTransactions();
            sa.printTransactions();



    }


}
