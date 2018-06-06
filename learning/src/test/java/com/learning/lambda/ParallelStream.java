package com.learning.lambda;

import java.util.Arrays;
import java.util.List;

public class ParallelStream
{


  public static void main(String args[])
{
     List<Emplyoee> empList = Arrays.asList(
        new Emplyoee("Gaurav", "34", Arrays.asList("1", "2", "3")),
        new Emplyoee("Manoj", "42", Arrays.asList("4", "5")),
        new Emplyoee("Nishant", "36", Arrays.asList("6")),
        new Emplyoee("Sonu", "28", Arrays.asList("7", "8", "9"))
        );
     int count = (int) empList.stream().flatMap(p -> p.getMobile().stream()).count();
     System.out.println("Total mobile used :: "+count);


}


}
