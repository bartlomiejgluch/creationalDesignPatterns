package org.example.abstractFactoryPattern;

public class BankB implements Bank{

    private final String bankName;


    public BankB() {
        bankName = "B";
    }

    public String getBankName(){

        return bankName;
    }
}
