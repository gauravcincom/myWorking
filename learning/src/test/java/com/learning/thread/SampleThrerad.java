package com.learning.thread;

public class SampleThrerad extends Thread{

   @Override
   public void run()
   {
     System.out.println("This is inside run method ::");
   }

    public static void main(String args[])
    {
       System.out.println("This is simple Thread program");

       SampleThrerad st = new SampleThrerad();
       Thread t = new Thread(st);
       t.start();

    }
}
