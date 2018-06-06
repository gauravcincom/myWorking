package com.learning.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass
{

   public static void main(String args[]) throws IOException{
      loadfile();
   }
   public static void loadfile() throws IOException
   {
      File dir = new File(".");
      System.out.println("This is directory absolute path :: "+dir.getAbsolutePath());
      System.out.println("This is directory canonical path :: "+dir.getCanonicalPath());

      FileInputStream fis = new FileInputStream(dir.getCanonicalPath()+File.separator+"src/test/java/config.properties");
      Properties prop = new Properties();
      prop.load(fis);
   }

   public static void readFile(){
     // System.out.println("This is url :: "+prop.get("url"));
   }
}
