package com.learning.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamWithListSortClass
{



   public static void main(String args[])
   {
      Map<String, String> nameMap = new HashMap<String, String>();
      nameMap.put("mzn", "gaurav");
      nameMap.put("del", "shray");
      nameMap.put("noida", "sanjay");
      nameMap.put("ambala", "sandeep");


      Map<String, String> upperNameMap = nameMap.entrySet().stream()
                                           .sorted(Map.Entry.comparingByKey())
                                           .collect(Collectors.toMap(entry -> entry.getKey() , entry -> entry.getValue(),
                                              (s, a) -> s, LinkedHashMap::new));
      System.out.println("This is hash map  :: "+upperNameMap);
   }


   public static void sortedMethod1()
   {
      List<String> nameList = Arrays.asList("gaurav", "rahul", "sanjay", "agrim");
      List<String> upperNameList =nameList.stream().sorted((String s1, String s2) -> s2.compareTo(s1)).collect(Collectors.toList());
      System.out.println("This is array list sorted  :: "+upperNameList);
   }

   public static void sortedMethod2()
   {
      List<String> nameList = Arrays.asList("gaurav", "rahul", "sanjay", "agrim");
      List<String> upperNameList = nameList.stream().map(String::toUpperCase).collect(Collectors.toList());
      System.out.println("This is array list in upper case  :: "+upperNameList);
   }

   public static void sortedMethodSimple()
   {
      List<String> nameList = Arrays.asList("gaurav", "rahul", "sanjay", "agrim");
      Collections.sort(nameList);
      System.out.println("This is sorted array list :: "+nameList);
   }
}
