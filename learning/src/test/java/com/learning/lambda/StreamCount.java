package com.learning.lambda;

import java.util.Arrays;
import java.util.List;

public class StreamCount
{

   public static void main(String args[])
   {
      List<Widget> widget = Arrays
         .asList(new Widget("RED", 3), new Widget("WHITE", 5), new Widget("BLACK", 4), new Widget("GREEN", 6), new Widget("BLUE", 4), new Widget("YELLOW", 7));

      int sum = widget.stream().mapToInt(wid -> wid.getWeight()).sum();
      System.out.println(" This is sum value without filter :: "+sum);

      int count = (int) widget.stream().
                   filter(wid -> wid.getColor().startsWith("B")).
                   mapToInt(wid -> wid.getWeight()).
                   peek(p-> System.out.println("This is color name starts with B :: "+p)).
                   count();
      System.out.println(" This is count of color getting after applying filter :: "+count);

      //sum of color's weight by using reduce
      int reduceCount = widget.stream().
                  map(wid -> wid.getWeight()*2).
                  reduce(0,(res,wid) -> res+wid);

      System.out.println(" This is sum of color's weight using reduce :: "+reduceCount);





   }

}

class Widget
{

   String color;
   int weight;

   public Widget(String color, int weight)
   {
      this.color = color;
      this.weight = weight;
   }

   public String getColor()
   {
      return color;
   }

   public void setColor(String color)
   {
      this.color = color;
   }

   public int getWeight()
   {
      return weight;
   }

   public void setWeight(int weight)
   {
      this.weight = weight;
   }

   @Override
   public String toString()
   {
      // TODO Auto-generated method stub
      return this.getColor()+ " : "+this.getWeight() ;
   }

}