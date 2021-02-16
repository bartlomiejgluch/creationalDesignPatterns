package org.example.factoryMethodPattern;

abstract public class Plan {

    protected double rate;
    abstract void gatRate();

    public void calculateBill(int units){

        System.out.println((units*rate));
    }


}
