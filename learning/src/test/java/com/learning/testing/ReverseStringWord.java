package com.learning.testing;

public class ReverseStringWord
{
   public static void main(String args[])
   {
      replaceSubStringByReplace();
   }

   public static void reverseBySplit()
   {
      String oldStr = "This is demo string";
      String newStr = "";
      String oldStrArray[] = oldStr.split(" ");
      int size = oldStrArray.length;
      for (int i = size - 1; i >= 0; i--)
      {
         newStr = newStr + oldStrArray[i] + " ";
      }
      newStr = newStr.trim();
      System.out.println("This is old str :: " + oldStr);
      System.out.println("This is reverse str :: " + newStr);

   }

   public static void reverseByStringBuilder()
   {
      String oldStr = "This is demo string";
      String newStr = "";
      String oldStrArray[] = oldStr.split(" ");
      int size = oldStrArray.length;
      for (int i = size - 1; i >= 0; i--)
      {
         newStr = newStr + oldStrArray[i] + " ";
      }
      newStr = newStr.trim();
      System.out.println("This is old str :: " + oldStr);
      System.out.println("This is reverse str :: " + newStr);

   }

   public static void replaceSubStringByReplace()
   {
         String newStr = "Java is very good i like Java";
         newStr = newStr.replace("Java", ".Net");
         System.out.println("This is new string :: "+newStr);

   }

   public static void replaceSubStringByLogic()
   {
      String newStr = "Java is very good i like Java";
      char[] newStrArr = newStr.toCharArray();
      char[] repStrArr = "Java".toCharArray();

      for (int i = 0; i < newStrArr.length; i++)
      {


         System.out.println("This is new string :: "+newStr);

   }

   }
}


