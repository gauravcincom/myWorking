package com.learning.design.ChainOfResponsebility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Request {
   private int m_value;
   private String m_description;

   public Request(String description, int value)
   {
       m_description = description;
       m_value = value;
   }

   public int getValue()
   {
       return m_value;
   }

   public String getDescription()
   {
       return m_description;
   }
}
