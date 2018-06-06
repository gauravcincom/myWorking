package com.learning.thread;

public class RunnableThrerad implements Runnable{

   public void run()
   {
     System.out.println("This is inside run method ::");
   }

    public static void main(String args[])
    {
       System.out.println("This is simple Thread program");

       RunnableThrerad st = new RunnableThrerad();
       Thread t = new Thread(st);
       t.start();

    }
}
