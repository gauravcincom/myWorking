package com.learning.testing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringFirstCharCharOccurence
{
   public static void main(String args[])
   {
      usingList();
      usingSet();
   }

   public static void usingSet()
   {
      Set<Character> occ = new HashSet<Character>();
      String name = "abbceddfere";
      Character repeatChar = '\0';
      for (Character c : name.toCharArray())
      {
         if (occ.contains(c))
         {
            repeatChar = c;
            break;
         }
         occ.add(c);
      }
      System.out.println("This is first repeating character using set :: " + repeatChar);
   }

   public static void usingList()
   {
      List<Character> occ = new ArrayList<Character>();
      String name = "gaurav";
      Character repeatChar = '\0';
      for (Character c : name.toCharArray())
      {
         if (occ.contains(c))
         {
            repeatChar = c;
            break;
         }
         occ.add(c);
      }
      System.out.println("This is first repeating character using list :: " + repeatChar);
   }
}
