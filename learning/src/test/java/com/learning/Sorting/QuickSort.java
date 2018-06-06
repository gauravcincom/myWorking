package com.learning.Sorting;

import java.util.Arrays;

public class QuickSort
{

   public static void main(String[] args)
   {
     int[] array = {23,9, 5,12, 56,98,45,14,67};
                  //0  1  2  3   4  5  6  7 8
     System.out.println(Arrays.toString(array));

     int high, low;
     high = array.length-1;
     low=0;

     quickSort(array, low, high);

     System.out.println("This is after sorting ... "+Arrays.toString(array));

   }

   public static void quickSort(int[] array, int low, int high) {
      if (array == null || array.length == 0)
          return;

      if (low >= high)
          return;

   // pick the pivot
      int middle = low + (high - low) / 2;
      int pivot = array[middle];

      // make left < pivot and right > pivot
      int i = low, j = high;

      while(i<j)
      {
         while(array[i]<pivot)
         {
            i++;
         }
         while(array[j]>pivot)
         {
            j--;
         }

         if (i <= j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }

      }

      System.out.println("This is sorting in recersive... "+Arrays.toString(array));
      if (low < j)
         quickSort(array, low, j);

     if (high > i)
         quickSort(array, i, high);




   }


}
