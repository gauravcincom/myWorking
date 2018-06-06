package com.learning.lambda;

import java.util.List;

public class Emplyoee
{
   String name;
    String age;
    List<String> mobile;

public List<String> getMobile()
   {
      return mobile;
   }

   public void setMobile(List<String> mobile)
   {
      this.mobile = mobile;
   }

public Emplyoee()
{

}

public Emplyoee(String name, String age)
{
   this.name=name;
     this.age=age;

}

public Emplyoee(String name, String age, List<String> mobile)
{
   this.name=name;
     this.age=age;
     this.mobile=mobile;

}

public String getName()
{
   return name;
}

public String getAge()
{
   return age;
}

@Override
public String toString()
{
   // TODO Auto-generated method stub
   return "name :: "+name+  " age :: "+age;
}


}
