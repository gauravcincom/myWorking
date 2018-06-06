package com.learning.testing;

public class ReverseString
{
   public static void main(String args[])
   {
      String actionStr = "Alert";
    //  byStringBuilder(actionStr);
    //  byIterativeMethod(actionStr);

     String revStr= recursiveMethod(actionStr);
     System.out.println("this is reverse string by recersive method :: "+revStr);


   }

  public static void byStringBuilder(String actionStr)
  {
     StringBuilder revStr = new StringBuilder(actionStr);
     revStr.reverse();
     System.out.println("this is reverse string by inbuilt method :: "+revStr);
  }

  public static void byIterativeMethod(String actionStr)
  {
     StringBuilder revStr = new StringBuilder();
     for(int i=(actionStr.length()-1); i>=0; i--)
     {
        revStr.append(actionStr.charAt(i));
     }
     System.out.println("this is reverse string by iterative method :: "+revStr);

  }

  public static String recursiveMethod(String str)
  {
     if ((null == str) || (str.length() <= 1))
     {
            return str;
     }
     System.out.println("This is substring 1:: "+str.substring(1));
     System.out.println("This is char at 0:: "+str.charAt(0));
     return recursiveMethod(str.substring(1))+ str.charAt(0);

  }
}
