package com.learning.testing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Email
{

   public static void main(String args[])
   {

      Map<String, List<String>> mailList = new HashMap<String, List<String>>();
      mailList.put("rahul@test.com", Arrays.asList("rajat@test.com","rashmi@test.com","vinod@test.com"));
      mailList.put("vineet@test.com", Arrays.asList("ajay@test.com","rajat@test.com","rahul@test.com"));
      mailList.put("Vinod@test.com", Arrays.asList("rahul@test.com","nitin@test.com","vineet@test.com"));
      mailList.put("ajay@test.com", Arrays.asList("ramesh@test.com","nitin@test.com","vinod@test.com"));

      Set<String> senderList = new HashSet<String>();

      senderList.add("vineet@test.com");
      senderList.addAll(mailList.get("vineet@test.com"));
      System.out.println("this is sender list :: "+senderList);


   }

}
