package com.learning.design.Adapter;

import com.learning.design.Adapter.CreditCard;

//This is the client class.
public class AdapterPatternDemo
{
   public static void main(String args[])
   {
      CreditCard targetInterface = new BankCustomer();
      targetInterface.giveBankDetails();
      System.out.print(targetInterface.getCreditCard());
   }
}// End of the BankCustomer class.
