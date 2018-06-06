package com.learning.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Peek
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
     List<Emplyoee> newFilterList = empList.stream().
                 filter(e -> e.getMobile().size()>2).
                 peek(p -> System.out.println("These employees have more than 2 mobile "+p.getName())).
                 filter(e -> e.getName().contains("Rana")).
                 peek(p -> System.out.println("Name of Rana employees who have more than 2 mobile "+p.getName())).
                 collect(Collectors.toList());


     System.out.println("Data Found :: "+newFilterList);


}


}
