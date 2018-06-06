package com.learning.Sorting;

import java.util.ArrayList;
import java.util.List;

public class FabonaciSeries
{
    public static void main(String args[])
    {
      int sum=1;
      int first=0;
      int num=1;
      List<Integer> fabonaciList = new ArrayList<Integer>();
      int val= fabonaci(sum,first,num);
      System.out.println("This is fabonaci series : "+fabonaciList);
    }

    public static int fabonaci(int sum,int first, int num)
    {
     if(num<=5)
     { num++;
     int old=sum;
      sum = sum+first;
      first=old;
     System.out.println("this is value of return ... for i "+num+" ("+sum+" )");
     return fabonaci(sum,first,num);
    }
    return 1;
    }
}
