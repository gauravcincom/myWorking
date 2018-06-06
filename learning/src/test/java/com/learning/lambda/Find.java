package com.learning.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Find
{


  public static void main(String args[])
{
     List<Emplyoee> empList = Arrays.asList(
        new Emplyoee("Gaurav Jain", "34", Arrays.asList("1", "2", "3")),
        new Emplyoee("Manoj Pant", "42", Arrays.asList("4", "5")),
        new Emplyoee("Nishant Gupta", "36", Arrays.asList("6")),
        new Emplyoee("Sonu Rana", "28", Arrays.asList("7", "8", "9")),
        new Emplyoee("Updesh Rana", "28", Arrays.asList("10", "11", "12","13"))
        );
    Predicate<String> pred = emp -> emp.startsWith("G");

    //find any match
    boolean result = empList.stream().
                          map(emp -> emp.getName()).
                          anyMatch(pred);

     System.out.println("Data Found :: "+result);

     //find all match
     result = empList.stream().
                           map(emp -> emp.getName()).
                           allMatch(pred);

      System.out.println("Data Found :: "+result);

      //find none match
      result = empList.stream().
                            map(emp -> emp.getName()).
                            noneMatch(pred);

       System.out.println("Data Found :: "+result);


}


}
