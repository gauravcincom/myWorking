package com.learning.custom;

//Run time custome exception
public class ListTooLargeException extends RuntimeException
{
   public ListTooLargeException(String msg)
   {
      super(msg);
   }
}
