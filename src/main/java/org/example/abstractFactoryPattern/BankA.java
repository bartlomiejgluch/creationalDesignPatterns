package org.example.abstractFactoryPattern;

public class BankA implements Bank {

    private final String bankName;

    public BankA() {
        bankName = "A";

    }


    @Override
    public String getBankName() {
        return bankName;
    }
}
