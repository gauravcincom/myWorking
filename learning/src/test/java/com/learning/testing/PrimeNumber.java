package com.learning.testing;

public class PrimeNumber
{


   public static boolean verifyPrimeNumber(int number)
   {
      boolean prime = true;

      for(int i=2 ; i<number; i++)
      {
           if(number%i==0)
           {
              prime =false;
              break;
           }
      }
     return prime;
   }

   public static boolean verifyRussianDoll(int number)
   {
     boolean russianDoll = true;

     while(russianDoll && (number!=0))
     {
        russianDoll = verifyPrimeNumber(number);
        number= number/10;
     }

      return russianDoll;
   }


   public static void main(String args[])
   {

      System.out.println("This is prime number :: 293 "+verifyRussianDoll(293));
   }


}
