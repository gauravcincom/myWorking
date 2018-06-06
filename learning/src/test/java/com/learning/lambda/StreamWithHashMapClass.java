package com.learning.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class StreamWithHashMapClass
{



   public static void main(String args[])
   {
      Map<String, String> nameMap = new HashMap<String, String>();
      nameMap.put("mzn", "gaurav");
      nameMap.put("del", "shray");
      nameMap.put("noida", "sanjay");
      nameMap.put("ambala", "sandeep");

      Map<String, String> upperNameMap = nameMap.entrySet().stream().collect(Collectors.toMap(data -> data.getKey(), data -> data.getValue().toUpperCase()));
      System.out.println("This is hash map in upper case  :: "+upperNameMap);

   }

   public static void changeToUpperCaseUsingEntrySet()
   {
      Map<String, String> nameMap = new HashMap<String, String>();
      nameMap.put("mzn", "gaurav");
      nameMap.put("del", "shray");
      nameMap.put("noida", "sanjay");
      nameMap.put("ambala", "sandeep");

      Map<String, String> upperNameMap = nameMap.entrySet().stream().collect(Collectors.toMap(data -> data.getKey(), data -> data.getValue().toUpperCase()));
      System.out.println("This is hash map in upper case  :: "+upperNameMap);


   }

   public static void changeToUpperCaseStreamUsingGetKey()
   {
      Map<String, String> nameMap = new HashMap<String, String>();
      nameMap.put("mzn", "gaurav");
      nameMap.put("del", "shray");
      nameMap.put("noida", "sanjay");
      nameMap.put("ambala", "sandeep");

      Map<String, String> upperNameMap = nameMap.keySet().stream().collect(Collectors.toMap(data ->data, data->nameMap.get(data).toUpperCase()));
      System.out.println("This is hash map in upper case  :: "+upperNameMap);
   }

   public static void changeToUpperCaseSimple()
   {
      Map<String, String> nameMap = new HashMap<String, String>();
      nameMap.put("mzn", "gaurav");
      nameMap.put("del", "shray");
      nameMap.put("noida", "sanjay");
      nameMap.put("ambala", "sandeep");

      Map<String, String> upperNameMap = new HashMap<String, String>();
      for(Entry<String, String> entry:nameMap.entrySet())
      {
         upperNameMap.put(entry.getKey(), entry.getValue().toUpperCase());
      }

      System.out.println("This is hash map in upper case  :: "+upperNameMap);
   }
}
