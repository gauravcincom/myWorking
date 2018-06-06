package com.learning.Sorting;

public class FactorialNumber
{
    public static void main(String args[])
    {
       int i=5;
      int val= factorial(i);
      System.out.println("This is factorial value of "+i+ " : "+val);
    }

    public static int factorial(int i)
    {
     if(i==1)
        return 1;
     int n =i*(i-1);
     System.out.println("this is value of return ... for i "+i+" ("+n+" )");
     return i*factorial(i-1);
    }
}
