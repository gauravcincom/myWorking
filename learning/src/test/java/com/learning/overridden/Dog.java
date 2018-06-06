package com.learning.overridden;

public class Dog extends Animal
{
   public static void sleep()
   {
      System.out.println("Dog is sleeping ...");
   }

   @Override
   public Dog covariant()
   {
      System.out.println("this is dog covariant method .. ");
      return this;

   }

   //this is overloading not overriding
   public void sameList(Dog a){
      System.out.println("this is dog. . same signature list method ..");

   }


}
