package com.learning.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorWithAdv
{

   public static void main(String args[])
   {
      List<People> detail = new ArrayList<People>();
      People obj1 = new People("Gaurav", 32);
      People obj2 = new People("Sandeep", 30);
      People obj3 = new People("Shray", 27);
      People obj4 = new People("Sanjay", 28);
      People obj5 = new People("Sanjay", 28);

      detail.add(obj1);
      detail.add(obj2);
      detail.add(obj3);
      detail.add(obj4);
      System.out.println("this is list before sorting "+detail);

      Collections.sort(detail, new Comparator<People>()
      {
         public int compare(People o1, People o2)
         {
            // TODO Auto-generated method stub
            return Integer.valueOf(o1.getAge()).compareTo(o2.getAge());
         }
      });
      System.out.println("this is list after sorting on age "+detail);

      Collections.sort(detail, new Comparator<People>()
      {
        public int compare(People o1, People o2)
      {
         // TODO Auto-generated method stub
         return o1.getName().compareTo(o2.getName());
      }
      });

      System.out.println("this is list after sorting on name "+detail);

   }



}
