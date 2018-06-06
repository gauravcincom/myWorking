package com.learning.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ForWithAdv
{

   public static void main(String args[])
   {

      forWithMapLambda();

   }

   public static void forWithList()
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

      for (People emp : detail)
      {
          System.out.println("This is emp name :: "+emp.getName()+ " and age :: "+emp.getAge());
      }

   }

   public static void forWithListLambda()
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

      //Lambda
      detail.forEach(emp -> System.out.println("This is emp name :: "+emp.getName()+ " and age :: "+emp.getAge()));
     //Method refrence
      detail.forEach(System.out::println);
      //output
      detail.forEach(emp -> {if(emp.getAge()>=30) System.out.println("This is emp name "+emp.getName());});

    }


   public static void forWithMap()
   {
      Map<String, People> detail = new HashMap<String, People>();
      People obj1 = new People("Gaurav", 32);
      People obj2 = new People("Sandeep", 30);
      People obj3 = new People("Shray", 27);
      People obj4 = new People("Sanjay", 28);
      People obj5 = new People("Rahul", 29);

      detail.put("1",obj1);
      detail.put("2",obj2);
      detail.put("3",obj3);
      detail.put("4",obj4);
      detail.put("5",obj5);
      System.out.println("this is Map before sorting "+detail);

      for (Entry<String, People> entry : detail.entrySet())
      {
          System.out.println("This is key :: "+entry.getKey()+ " and value :: "+entry.getValue());
      }

   }

   public static void forWithMapLambda()
   {
      Map<String, People> detail = new HashMap<String, People>();
      People obj1 = new People("Gaurav", 32);
      People obj2 = new People("Sandeep", 30);
      People obj3 = new People("Shray", 27);
      People obj4 = new People("Sanjay", 28);
      People obj5 = new People("Rahul", 29);

      detail.put("1",obj1);
      detail.put("2",obj2);
      detail.put("3",obj3);
      detail.put("4",obj4);
      detail.put("5",obj5);
      System.out.println("this is Map before sorting "+detail);

     detail.forEach((K,V) ->System.out.println("This is key :: "+K+ " and value :: "+V.getName()));

   }



}
