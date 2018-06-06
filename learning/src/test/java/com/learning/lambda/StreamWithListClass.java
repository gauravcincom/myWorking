package com.learning.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamWithListClass
{



   public static void main(String args[])
   {
        List<String> nameList = Arrays.asList("gaurav", "rahul", "sanjay", "agrim");
        List<String> upperNameList = nameList.stream().map(String::toUpperCase).collect(Collectors.toList());


         System.out.println("This is array list in upper case  :: "+upperNameList);

   }

   public static void changeToUpperCaseStreamMethod1()
   {
      List<String> nameList = Arrays.asList("gaurav", "sandeep", "shray", "agrim");
      List<String> upperNameList = nameList.stream().map(data -> data.toUpperCase()).collect(Collectors.toList());
      System.out.println("This is array list in upper case  :: "+upperNameList);
   }

   public static void changeToUpperCaseStreamMethod2()
   {
      List<String> nameList = Arrays.asList("gaurav", "rahul", "sanjay", "agrim");
      List<String> upperNameList = nameList.stream().map(String::toUpperCase).collect(Collectors.toList());
      System.out.println("This is array list in upper case  :: "+upperNameList);
   }

   public static void changeToUpperCaseSimple()
   {
      List<String> nameList = Arrays.asList("gaurav", "rahul", "sanjay", "agrim");
      List<String> upperNameList = new ArrayList<String>();
      for(String name : nameList)
      {
         upperNameList.add(name.toUpperCase());
      }

       System.out.println("This is array list in upper case  :: "+upperNameList);
   }
}
