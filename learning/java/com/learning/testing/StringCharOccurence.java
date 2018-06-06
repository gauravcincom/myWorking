package com.learning.testing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringCharOccurence
{
  public static void main(String args[])
  {
     Map<String, Integer> occ = new HashMap<String, Integer>();
     System.out.println("This is main function ");
     char charc[] = "mahendrasinghgupta".toCharArray();

     for(char s :charc){
        String ob=""+s;
       boolean i= occ.containsKey(ob);

       if(i==false)
       {
          occ.put(ob, 1);
       }else
       {
          occ.put(ob, occ.get(ob)+1);
       }
    }

       for(Entry<String, Integer> ent : occ.entrySet()){

        //  System.out.println("this is key "+ent.getKey());
        //  System.out.println("this is value "+ent.getValue());
       }
       fun();
  }
   public static void fun()
   {
      Map<Character, Integer> occ = new HashMap<Character, Integer>();
      System.out.println("This is fun function ");
      String obj ="aaabcadccb";
      for(Character c: obj.toCharArray()){
      Integer count=occ.get(c);
      int counts= (count==null)?1:count+1;
      occ.put(c, counts);
      }
      for(Entry<Character, Integer> ent : occ.entrySet()){

         System.out.println("this is key "+ent.getKey());
         System.out.println("this is value "+ent.getValue());
      }



   }




}
