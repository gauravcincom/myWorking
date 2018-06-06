package com.learning.Builder;

public class TestingBuilder
{
   public static void main(String args[])
    {
     Emplyoee emp = new EmplyoeeBuilder().name("Gaurav").build();

      System.out.println("In the main :: "+emp);

    }
}
