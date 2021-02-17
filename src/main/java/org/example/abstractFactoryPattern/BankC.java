package org.example.abstractFactoryPattern;

public class BankC implements Bank{


    private final String bankName;

    public BankC(){

        bankName = "C";

    }

    public String getBankName() {
        return bankName;
    }
}
