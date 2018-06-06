package com.learning.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class StreamWithMapSortClass2
{



   public static void main(String args[])
   {
      Map<String, String> nameMap = new HashMap<String, String>();
      nameMap.put("mzn", "gaurav");
      nameMap.put("del", "shray");
      nameMap.put("noida", "sanjay");
      nameMap.put("ambala", "sandeep");
      System.out.println("This is unsorted map :: "+nameMap);

      List<Map.Entry<String, String>> sortedMap = new LinkedList<>(nameMap.entrySet());
      System.out.println("this is unsorted list :: "+sortedMap);

      Collections.sort(sortedMap, new Comparator<Map.Entry<String, String>>()
      {@Override
         public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
         return o1.getValue().compareTo(o2.getValue());
     }}  );

      System.out.println("this is sorted list by value :: "+sortedMap);



   }


   public static void sortedMethod1()
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

   public static void sortedMethod2()
   {
      List<String> nameList = Arrays.asList("gaurav", "rahul", "sanjay", "agrim");
      List<String> upperNameList = nameList.stream().map(String::toUpperCase).collect(Collectors.toList());
      System.out.println("This is array list in upper case  :: "+upperNameList);
   }

   public static void sortedMethodSimpleByKey()
   {
      Map<String, String> nameMap = new HashMap<String, String>();
      nameMap.put("mzn", "gaurav");
      nameMap.put("del", "shray");
      nameMap.put("noida", "sanjay");
      nameMap.put("ambala", "sandeep");
      System.out.println("This is unsorted map :: "+nameMap);
      TreeMap<String, String> sortedTreeMap = new TreeMap<>(nameMap);
      System.out.println("this is sorted map "+sortedTreeMap);

   }

   public static void sortedMethodSimpleByKeyUsingComparator()
   {
      Map<String, String> nameMap = new HashMap<String, String>();
      nameMap.put("mzn", "gaurav");
      nameMap.put("del", "shray");
      nameMap.put("noida", "sanjay");
      nameMap.put("ambala", "sandeep");
      System.out.println("This is unsorted map :: "+nameMap);
      TreeMap<String, String> sortedTreeMap = new TreeMap<>(new Comparator<String>()
      {  @Override
         public int compare(String o1, String o2) {
         return o1.compareTo(o2);
     }}  );
     sortedTreeMap.putAll(nameMap);
     System.out.println("this is sorted map "+sortedTreeMap);
   }
}
