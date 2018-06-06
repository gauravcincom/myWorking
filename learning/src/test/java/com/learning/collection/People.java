package com.learning.collection;

public class People
{
     String name;
     int age;

     public People(String name, int age)
   {
     this.name = name;
     this.age = age;

   }
   public String getName()
   {
      return this.name;
   }

   public int getAge()
   {
      return this.age;
   }

   @Override
   public String toString()
   {

      return getName()+ " :: "+getAge();
   }

  @Override
public boolean equals(Object arg0)
{
   // TODO Auto-generated method stub
   return this.toString().equals(arg0.toString());
}

@Override
public int hashCode()
{
   // TODO Auto-generated method stub
   return this.toString().hashCode();
}

}
