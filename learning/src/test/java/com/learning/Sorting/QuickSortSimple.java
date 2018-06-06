package com.learning.Sorting;

import java.util.Arrays;

public class QuickSortSimple
{

   public static void main(String[] args)
   {
     int[] array = {23,9, 5,12, 56,98,45,14,67};
                  //0  1  2  3   4  5  6  7 8
     System.out.println(Arrays.toString(array));

      int i,j,low=0;
      int high=array.length-1;
      int pivot =(low+high)/2;
      i=low;
      j=high;
      while(i<=high && j>=low)
      {
         System.out.println("pivot ... "+array[pivot]);
      while(array[pivot]>array[i] && i<=high)
      {
         i++;
         System.out.println("inside i "+i);
      }

      while(array[pivot]<array[j])
      {
         j--;
         System.out.println("inside j "+j);
      }
      if(i<=high && j>=low)
      {
      int temp=array[i];
      array[i]=array[j];
      array[j]=temp;
      }
      System.out.println("This is after sorting ... "+Arrays.toString(array));
      }

     System.out.println("This is after sorting ... "+Arrays.toString(array));

   }

   public static void quickSort(int[] array, int low, int high)
   {

   }


}
