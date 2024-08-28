package com.xworkz.sbiapp.account;

import jdk.nashorn.internal.parser.JSONParser;

public class BankAccount {
    public double balance;
    public double fetchBalance(){
        return balance;
    }


    public void debit (double amount){
        System.out.println("debit method is started");
     if (amount<balance)

         balance = balance - amount;

     else {
         System.out.println("Insufficient Balance");
     }
        System.out.println("debit method is ended");

    }

    public void credit(double amount) {
        System.out.println("creit method is started");

        if (amount>0)
        balance = balance + amount;
        else{
        System.out.println("balance is greater than 0");}
        System.out.println("creit method is ended");

    }

}
