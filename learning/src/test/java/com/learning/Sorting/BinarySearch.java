package com.learning.Sorting;

import java.util.Arrays;

public class BinarySearch
{

   public static void main(String[] args)
   {
      int[] array = {9, 17, 21, 36, 57, 63, 79, 82, 90};
      System.out.println(Arrays.toString(array));
      int search =82;  //7+8-1=7+
      int low =0;
      int high=array.length;
      int result;

      result = binarySearch(array,search,low,high-1);
      System.out.println("This is mid element ... "+result);

   }

   public static int binarySearch(int[] array, int search, int low, int high)
   {
      if(low<=high)
      {
      int mid = (low+(high))/2;
      System.out.println(mid);
      System.out.println("This is mid"+mid+" in recercession"+array[mid]);
      if(array[mid]==search)
      {
       System.out.println("inside equal ... ");
       return mid;
      }
      if(array[mid]>search)
        return binarySearch(array,search,low,mid-1);
      if(array[mid]<search)
         return binarySearch(array,search,mid+1,high);
      }
      return -1;
   }

}
