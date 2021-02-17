package org.example.abstractFactoryPattern;

class BankFactory extends AbstractFactory{
    public Bank getBank(String bank){
        if(bank == null){
            return null;
        }
        if(bank.equalsIgnoreCase("A")){
            return new BankA();
        } else if(bank.equalsIgnoreCase("B")){
            return new BankB();
        } else if(bank.equalsIgnoreCase("C")){
            return new BankC();
        }
        return null;
    }
    public Loan getLoan(String loan) {
        return null;
    }
}//End of the BankFactory class.