package com.learning.testing;

public class StringCharOccurenceWithoutLoop
{

   public static void main(String args[])
   {
     String toCheck = "kaavyakakvykvy";
     String occur ="a";
     byReplce(toCheck, occur);

   }

  public static void byReplce(String toCheck, String occur)
   {
      int noOfOccurrence = toCheck.length() - toCheck.replace(occur, "").length();
      System.out.println("This is no of occurrence :: "+noOfOccurrence);
   }
}
