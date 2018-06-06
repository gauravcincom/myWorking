package com.learning.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile
{

   public static void main(String[] args) throws IOException
   {
      //FileReader is mainly used for reading a txt file, it reads the file character by char
      //FileInputStream is maily used for reading binary file like music, png

      //Note: File will read/write in ASCII form so if you are reading/writing any character then it will be in ASCII form
      copyFileByString();
   }

  public static void writeLine() throws IOException
  {
     File newFile = new File(".");
     System.out.println("This is file path .. "+newFile.getAbsolutePath());
     FileWriter fw = new FileWriter("C:\\Gaurav\\AdvanceLearning\\myGitHub\\learning\\src\\test\\java\\com\\learning\\file\\FileToWrite");
     BufferedWriter bw = new BufferedWriter(fw);
     String str= "Alert manager is mainly used for .... ";
     String strAppend = "Managing the alert....";
     bw.write(str);
     bw.newLine();
     bw.write(strAppend);
     bw.write(78);
     System.out.println("This is file data ... "+str);
     bw.close();
     fw.close();
  }



  public static void copyFileToFile() throws IOException
  {
     File newFile = new File(".");
     System.out.println("This is file path .. "+newFile.getAbsolutePath());
     FileReader fr = new FileReader("C:\\Gaurav\\AdvanceLearning\\myGitHub\\learning\\src\\test\\java\\com\\learning\\file\\SourceFile");
     FileWriter fw = new FileWriter("C:\\Gaurav\\AdvanceLearning\\myGitHub\\learning\\src\\test\\java\\com\\learning\\file\\TargetFile");

     BufferedReader br = new BufferedReader(fr);
     BufferedWriter bw = new BufferedWriter(fw);
     int intValue;
     while((intValue=br.read())!= -1)
     {
        bw.write(intValue);
        bw.newLine();
     }
     br.close();
     fr.close();
     bw.close();
     fw.close();
  }

  public static void copyFileByString() throws IOException
  {
     File newFile = new File(".");
     System.out.println("This is file path .. "+newFile.getAbsolutePath());
     FileReader fr = new FileReader("C:\\Gaurav\\AdvanceLearning\\myGitHub\\learning\\src\\test\\java\\com\\learning\\file\\SourceFile");
     FileWriter fw = new FileWriter("C:\\Gaurav\\AdvanceLearning\\myGitHub\\learning\\src\\test\\java\\com\\learning\\file\\TargetFile");

     BufferedReader br = new BufferedReader(fr);
     BufferedWriter bw = new BufferedWriter(fw);
     String str;
     while((str=br.readLine())!= null)
     {
        for(int i=0; i<str.length();i++)
        {
          bw.write(str.charAt(i));
          bw.newLine();
        }
     }
     br.close();
     fr.close();
     bw.close();
     fw.close();
  }

}
