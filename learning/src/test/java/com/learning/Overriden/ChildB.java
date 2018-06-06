package com.learning.Overriden;

public class ChildB extends SuperA
{

   public void display(ChildB str){
      System.out.println("This is str to display in child :: ");
   }

   public static void main(String args[]){
      ChildB obj = new ChildB();
      obj.display(obj);
      SuperA obj1 = new ChildB();
      obj1.display(obj);
   }
}
