package com.learning.Builder;

public class EmplyoeeBuilder
{
   String name;
   String dept;
   String manager;
   String post;
   String age;

   public EmplyoeeBuilder name(String name)
   {
      this.name=name;
      return this;
   }

   public EmplyoeeBuilder dept(String dept)
   {
      this.dept=dept;
      return this;
   }

   public EmplyoeeBuilder manager(String manager)
   {
      this.manager=manager;
      return this;
   }

   public EmplyoeeBuilder post(String post)
   {
      this.post=post;
      return this;
   }

   public EmplyoeeBuilder age(String age)
   {
      this.age=age;
      return this;
   }

   public Emplyoee build()
   {
      return new Emplyoee(this);
   }


}
