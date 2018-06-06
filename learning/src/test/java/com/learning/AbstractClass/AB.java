package com.learning.AbstractClass;

public abstract class AB implements A, B
{

   public int sub()
   {
      System.out.println("This is addition");
      return 0;
   }

   public int add()
 //  private int add()   //can't reduce visibilty to inherited method

   {
      System.out.println("This is sub");
      return 0;
   }

}
