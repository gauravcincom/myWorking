package com.learning.overridden;

public class Test
{
    public static void main(String args[])
    {
       Animal a = new Animal();
       a.sleep();
       Dog d =new Dog();
       d.sleep();

       a.covariant();
       d.covariant();

       a.sameList(d);
       a.sameList(a);
       Dog dd =(Dog) a;
     //  d.sameList(dd);
       d.sameList(d);
    }
}
