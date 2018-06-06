package com.learning.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile
{

   public static void main(String[] args) throws IOException
   {
      //FileReader is mainly used for reading a txt file, it reads the file character by char
      //FileInputStrea is maily used for reading binary file like music, png
      readChar();
   }

  public void readLine() throws IOException
  {
     File newFile = new File(".");
     System.out.println("This is file path .. "+newFile.getAbsolutePath());
     FileReader fr = new FileReader("C:\\Gaurav\\AdvanceLearning\\myGitHub\\learning\\src\\test\\java\\com\\learning\\file\\SourceFile");
     BufferedReader br = new BufferedReader(fr);
     String str;
     while((str=br.readLine())!= null)
     {
        System.out.println("This is file data ... "+str);
     }
     br.close();
     fr.close();
  }



  public static void readChar() throws IOException
  {
     File newFile = new File(".");
     System.out.println("This is file path .. "+newFile.getAbsolutePath());
     FileReader fr = new FileReader("C:\\Gaurav\\AdvanceLearning\\myGitHub\\learning\\src\\test\\java\\com\\learning\\file\\SourceFile");
     BufferedReader br = new BufferedReader(fr);
     int intValue;
     while((intValue=br.read())!= -1)
     {
        char c =(char) intValue;
        System.out.println("This is file data ... "+c);
     }
     br.close();
     fr.close();
  }


}
