package com.learning.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterListMap
{

   public static void main(String args[])
   {
      List<Emplyoee> empList = Arrays.asList( new Emplyoee("Gaurav", "32"),
                                              new Emplyoee("Sandeep", "30"),
                                              new Emplyoee("Shray", "25"),
                                              new Emplyoee("Ravi", "22"),
                                              new Emplyoee("Vishal", "38"),
                                              new Emplyoee("Allu Arjun", "35"),
                                              new Emplyoee("Gaurav", "36"));
      //Sort the list -- ascending
      List<Emplyoee> empSortedList = empList.stream().
                                   sorted((x,y) -> x.getName().compareTo(y.getName())).
                                   collect(Collectors.toList()) ;
        System.out.println("this is list withsorting ... "+empSortedList);

      //Sort the list -- descending
        List<Emplyoee> empSortedListDesc = empList.stream().
                                     sorted((x,y) -> y.getName().compareTo(x.getName())).
                                     collect(Collectors.toList()) ;
          System.out.println("this is list withsorting ... "+empSortedListDesc);

     // Get a List based on filter
      List<String> empNameList = empList.stream().
                                filter(x -> !x.getName().equals("Gaurav")).
                                map(x->x.getName()).
                               collect(Collectors.toList()) ;
      System.out.println("this is list without Gaurav ... "+empNameList);

   // Get a Map convert from list with method reference
      Map<String, String> empMap = empList.stream().
                                       collect(Collectors.toMap(Emplyoee::getAge, Emplyoee::getName));
      System.out.println("this is Map with method reference... "+empMap);

   // Get a Map convert from list with lambda
      Map<String, String> empNameMap = empList.stream().
                                       collect(Collectors.toMap(x -> x.getAge(), x -> x.getName()));
      System.out.println("this is Map with lambda... "+empNameMap);

   // Get a Map convert from list with method reference duplicate key error
      Map<String, String> empMapDupl = empList.stream().
                                       collect(Collectors.toMap(Emplyoee::getName, Emplyoee::getAge,
                                                                (oldValue, newValue) -> newValue));
                                       // ==> If the key is duplicated, do you prefer oldKey or newKey?
      System.out.println("this is Map with method reference..with duplicate key. "+empMapDupl);


    //Get a String based on any find
     String empName = empList.stream().
                      filter(x -> x.getName().equals("Gaurav")).
                      map(x->x.getName()).
                      findAny().orElse(null);
      System.out.println("this is emp name "+empName);

    //Get a Employee based on any find
      Emplyoee empObj = empList.stream().
                       filter(x -> x.getName().startsWith("Gau")).
                       findAny().orElse(null);
       System.out.println("this is emp obj "+empObj);

    //Use of map
       List<String> name = Arrays.asList("Ram");



   }



}
