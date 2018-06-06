package com.learning.Sorting;

import java.util.Arrays;

public class BinarySearchSimple
{

   public static void main(String[] args)
   {
      int[] array = {9, 17, 21, 36, 57, 63, 79, 82, 90};
      System.out.println(Arrays.toString(array));

      int low = 0;
      int high =array.length-1;

      int mid;
      int result=-1;

      int searching =21;

      while(low<=high)
      {
         mid=(low+high)/2;
        if(array[mid]==searching)
        {
           result=mid;
           break;
        }

        if(array[mid]>searching)
        {
          high=mid-1;
        }

        if(array[mid]<searching)
        {
          low=mid+1;
        }
      }
   if(result==-1)
      System.out.println("Element not found");
   else
      System.out.println("Element found ... "+result);
   }

   public static int binarySearch(int[] array, int search, int low, int high)
   {
      return 1;
   }
}
