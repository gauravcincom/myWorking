package com.learning.Builder;

public class Emplyoee
{
   String name;
   String dept;
   String manager;
   String post;
   String age;

public Emplyoee()
{

}

public Emplyoee(EmplyoeeBuilder empObj)
{
   this.name=empObj.name;
   this.dept=empObj.dept;
   this.manager=empObj.manager;
   this.post=empObj.post;
   this.age=empObj.age;

}

@Override
public String toString()
{
   // TODO Auto-generated method stub
   return "name :: "+name+" dept :: "+dept+" manager :: "+manager+" post :: "+post+" age :: "+age;
}


}
