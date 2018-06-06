package com.learning.overridden;

public class Animal
{
   public static void sleep()
   {
      System.out.println("animal is sleeping .. ");
   }

   public Animal covariant()
   {
      System.out.println("this is animal covariant method .. ");
      return this;
   }

   public void sameList(Animal a){
      System.out.println("this is animal. . same signature list method ..");

   }

   protected void move()
   {
      System.out.println("this is animal. . move ..");
   }
}
