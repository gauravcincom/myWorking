package com.learning.testing;

import java.util.LinkedList;
import java.util.List;

public class HeightMatter
{
   public static void main(String args[])
   {
      int[] a = { 14, 12, 6, 8, 15, 18, 9, 11, 14, 20, 19, 5, 4 };
      List visible = new LinkedList();
      int heightpoint = a[0];
      visible.add(heightpoint);

      for (int i = 1; i < a.length; i++)
      {
         if (heightpoint < a[i])
         {
            heightpoint = a[i];
            visible.add(heightpoint);
         }
      }

      System.out.println("this is array subset :: " + visible);

   }

}
