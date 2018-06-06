package com.learning.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMax
{

   public static void main(String args[])
   {
      List<Emplyoee> empList = Arrays.asList(
         new Emplyoee("Gaurav Jain", "34", Arrays.asList("1", "2", "3")),
         new Emplyoee("Manoj Pant", "42", Arrays.asList("4", "5")),
         new Emplyoee("Nishant Gupta", "36", Arrays.asList("6")),
         new Emplyoee("Sonu Rana", "28", Arrays.asList("7", "8", "9")),
         new Emplyoee("Updesh Rana", "28", Arrays.asList("10", "11", "12", "13")));
      Optional<Integer> minAge = empList.stream().map(e -> Integer.parseInt(e.getAge())).min((e1, e2) -> e1.compareTo(e2));

      if (minAge.isPresent())
         System.out.println("Min age Found :: " + minAge.get());

      Optional<Integer> maxAge = empList.stream().map(e -> Integer.parseInt(e.getAge())).max(Integer::compareTo);

      if (minAge.isPresent())
         System.out.println("max age Found :: " + maxAge.get());

      maxAge = empList.stream().map(e -> Integer.parseInt(e.getAge())).max((x, y) -> Integer.compare(x, y));

      if (minAge.isPresent())
         System.out.println("max age Found :: " + maxAge.get());

      minAge = empList.stream().map(e -> Integer.parseInt(e.getAge())).min((x, y) -> x.compareTo(y));

      if (minAge.isPresent())
         System.out.println("min age Found :: " + minAge.get());

      Comparator<Integer> comp = (Integer a, Integer b) -> a.compareTo(b);

      maxAge = empList.stream().map(e -> Integer.parseInt(e.getAge())).max(comp);

      if (minAge.isPresent())
         System.out.println("max age Found by comp :: " + maxAge.get());

      Comparator<Integer> comp2 = (Integer a, Integer b) -> Integer.compare(a, b);

      maxAge = empList.stream().map(e -> Integer.parseInt(e.getAge())).max(comp2);

      if (minAge.isPresent())
         System.out.println("max age Found by comp2 :: " + maxAge.get());

   }

}
