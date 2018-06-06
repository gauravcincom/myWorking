package com.learning.custom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestClass
{
   public static void verifyAgeForVote(int age) throws InvalidAgeException
   {
      if(age<18)
         throw new InvalidAgeException("Age is not valid for voting ...");
      else
         System.out.println("You are eligibe for voting :: "+age);

   }

   public static void analyze(List<String> data)
   {
      if (data.size()>50)
         throw new ListTooLargeException("only 50 ");
   }


   public static void main(String args[])
   {
       try
       {
          verifyAgeForVote(17);
       }catch(InvalidAgeException e){
         System.out.println("This is exception :: "+e.getMessage());
       }

       List<String> data = new ArrayList<String>(Collections.nCopies(100, "Gaurav"));
       analyze(data);
   }
}
