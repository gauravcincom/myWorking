package com.learning.design.AbstractFactory;

public class HDFC implements Bank
{
   private final String BNAME;
   public HDFC(){
          BNAME="HDFC BANK";
  }
  public String getBankName() {
            return BNAME;
  }

}
