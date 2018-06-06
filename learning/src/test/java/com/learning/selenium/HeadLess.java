package com.learning.selenium;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HeadLess
{
   @Test
   public void headless() throws InterruptedException
   {

      WebDriver driver = new HtmlUnitDriver();

      driver.navigate().to("http://www.amazon.in");
      System.out.println("Current Url :: " + driver.getCurrentUrl());

      WebElement target = driver.findElement(By.id("nav-link-shopall"));

      Actions act = new Actions(driver);
      act.click(target).perform();

      System.out.println("Current Url :: " + driver.getCurrentUrl());
      WebElement linkBookCatogery = driver.findElement(By.xpath("//a[(text()='All Books')]"));
      linkBookCatogery.click();
      System.out.println("Current Url :: " + driver.getCurrentUrl());
      Thread.sleep(2000);
      WebElement linkTextBookCatogery = driver.findElement(By.xpath("//span[contains(text(),'Literature & Fiction')]"));
      linkTextBookCatogery.click();
      System.out.println("Current Url :: " + driver.getCurrentUrl());
   }

   public static void main(String args[]) throws IOException, HeadlessException, AWTException, InterruptedException
   {

   }

}
