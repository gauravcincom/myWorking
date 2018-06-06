package com.learning.testing;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateChars
{
   public static void main(String args[])
   {
      String withDup = "kavvakyaykavv";
      removeDuplicateByList(withDup);

   }

   public static void removeDuplicateByList(String withDup)
   {
      char[] withDupChar = withDup.toCharArray();
      List<Character> withoutDupList = new ArrayList<Character>();
      for (char c : withDupChar)
      {
         if (!(withoutDupList.contains(c)))
            withoutDupList.add(c);
      }
      System.out.println("this is list :: " + withoutDupList);
      StringBuffer newStr = new StringBuffer();
      for (char c : withoutDupList)
      {
         newStr.append(c);
      }
      System.out.println("this is new string :: " + newStr);
   }

   public static void removeDuplicateBySet(String withDup)
   {
      char[] withDupChar = withDup.toCharArray();
      Set<Character> withoutDupSet = new LinkedHashSet<Character>();
      for (char c : withDupChar)
      {
         withoutDupSet.add(c);
      }
      System.out.println("this is set :: " + withoutDupSet);
      StringBuffer newStr = new StringBuffer();
      for (char c : withoutDupSet)
      {
         newStr.append(c);
      }
      System.out.println("this is new string :: " + newStr);
   }

}
