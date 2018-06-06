package com.learning.collection;

import java.util.ArrayList;
import java.util.List;

public class ComparatorWithLambda
{

   public static void main(String args[])
   {
      List<People> detail = new ArrayList<People>();
      People obj1 = new People("Gaurav", 32);
      People obj2 = new People("Sandeep", 30);
      People obj3 = new People("Shray", 27);
      People obj4 = new People("Sanjay", 28);
      People obj5 = new People("Rahul", 29);

      detail.add(obj1);
      detail.add(obj2);
      detail.add(obj3);
      detail.add(obj4);
      detail.add(obj5);
      System.out.println("this is list before sorting "+detail);

     detail.sort((People o1, People o2) -> o1.getName().compareTo(o2.getName()));
      System.out.println("this is list after sorting on name "+detail);
    //lambda, valid, parameter type is optional
      detail.sort((o1, o2) -> o2.getName().compareTo(o1.getName()));
      System.out.println("this is list after desc sorting on name "+detail);

     detail.forEach((People o1) -> System.out.println("This is list :: "+o1));
   //lambda, valid, parameter type is optional
     detail.forEach((o1) -> System.out.println("This is list :: "+o1));

   }



}
