package com.learning.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapAdv
{
      public static void main(String args[])
      {
        Map<Integer, Entry<String, String>> detail = new HashMap<Integer, Entry<String, String>>();
        Entry<String, String> obj1 = new MyEntry<String, String>("Gaurav", "94");
        Entry<String, String> obj2 = new MyEntry<String, String>("Sandeep", "65");
        Entry<String, String> obj3 = new MyEntry<String, String>("Shray", "128");
        Entry<String, String> obj4 = new MyEntry<String, String>("Sanjay", "116");

        detail.put(32, obj1);
        detail.put(30, obj2);
        detail.put(27, obj3);
        detail.put(28, obj4);
        System.out.println("this is map"+detail);
        String empNo= detail.get(32).getValue();
        System.out.println("this is the emp number :: "+empNo+ " for  Gaurav");
      }

      public static void HashMapWithEntrySet()
      {
         Map<Integer, Entry<String, String>> detail = new HashMap<Integer, Entry<String, String>>();
         Entry<String, String> obj1 = new MyEntry<String, String>("Gaurav", "94");
         Entry<String, String> obj2 = new MyEntry<String, String>("Sandeep", "65");
         Entry<String, String> obj3 = new MyEntry<String, String>("Shray", "128");
         Entry<String, String> obj4 = new MyEntry<String, String>("Sanjay", "116");

         detail.put(32, obj1);
         detail.put(30, obj2);
         detail.put(27, obj3);
         detail.put(28, obj4);
         System.out.println("this is map"+detail);
         String empNo= detail.get(32).getValue();
         System.out.println("this is the emp number :: "+empNo+ " for  Gaurav");
      }

      public static void HashMapWithMultiKeys()
      {
         Map<Integer, Map<String, String>> detail = new HashMap<Integer, Map<String, String>>();
         Map<String, String> obj1 = new HashMap<String, String>();
         obj1.put("Gaurav", "94");
         Map<String, String> obj2 = new HashMap<String, String>();
         obj2.put("Sandeep", "65");
         Map<String, String> obj3 = new HashMap<String, String>();
         obj3.put("Shray", "128");
         Map<String, String> obj4 = new HashMap<String, String>();
         obj4.put("Sanjay", "116");
         detail.put(32, obj1);
         detail.put(30, obj2);
         detail.put(27, obj3);
         detail.put(28, obj4);
         System.out.println("this is map"+detail);
         String empNo= detail.get(32).get("Gaurav");
         System.out.println("this is the emp number :: "+empNo+ " for  Gaurav");
      }


      public static void HashMapWithObject()
      {
         Map<People, String> detail = new HashMap<People, String>();
         People obj1 = new People("Gaurav", 32);
         People obj2 = new People("Sandeep", 30);
         People obj3 = new People("Shray", 27);
         People obj4 = new People("Sanjay", 28);
         People obj5 = new People("Sanjay", 28);

         detail.put(obj1, "94");
         detail.put(obj2, "65");
         detail.put(obj3, "128");
         detail.put(obj4, "116");
         System.out.println("this is map"+detail);

         String empNo= detail.get(obj5);
         System.out.println("this is the emp number :: "+empNo+ " for object :: "+obj5);

         System.out.println("Two object are equals :: "+obj4.equals(obj5));

      }
}
