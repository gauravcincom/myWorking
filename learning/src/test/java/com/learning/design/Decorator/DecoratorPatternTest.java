package com.learning.design.Decorator;

public class DecoratorPatternTest
{

   public static void main(String[] args)
   {
      Car basicCar = new BasicCar();
      basicCar.assemble();
      System.out.println("\n*****");

      Car sportsCar = new SportsCar(new BasicCar());
      sportsCar.assemble();
      System.out.println("\n*****");

      Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
      sportsLuxuryCar.assemble();
   }

}