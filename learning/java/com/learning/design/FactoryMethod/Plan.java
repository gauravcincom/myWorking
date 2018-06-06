package com.learning.design.FactoryMethod;

public abstract class Plan
{
    double rate;
    abstract void getRate();
    public void calculateBill(int units)
    {
       System.out.println("This is the rate :: "+units*rate);
    }


}
