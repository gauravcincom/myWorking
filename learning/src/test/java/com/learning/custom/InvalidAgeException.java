package com.learning.custom;

// Compile time custome exception
public class InvalidAgeException extends Exception
{
   InvalidAgeException(String s)
   {
      super(s);
   }

}
