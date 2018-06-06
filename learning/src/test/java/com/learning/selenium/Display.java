package com.learning.selenium;

import java.io.File;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class Display
{
    @Test
    public void fluent()
    {
       DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
       caps.setCapability("ignoreZoomSetting", true);

       File chPath = new File("C:/Gaurav/seleniumserver/Drivers/IEDriverServer.exe");
       System.setProperty("webdriver.ie.driver", chPath.getAbsolutePath());
       WebDriver driver = new InternetExplorerDriver(caps);

       driver.navigate().to("http://www.amazon.com");
       driver.manage().window().maximize();


       Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                            .withTimeout(30, TimeUnit.SECONDS)
                            .pollingEvery(250, TimeUnit.MILLISECONDS)
                            .ignoring(NoSuchElementException.class);

      wait.until(new Function<WebDriver, String>()
      {
          @Override
         public String apply(WebDriver driverNew)
         {
             JavascriptExecutor js = (JavascriptExecutor) driver;
            String state= (String)js.executeScript("return document.readyState;");
            System.out.println("This is state :: "+state);
            if(state.equals("complete"))
               return "Right";
            else
            return null;
         };
      });



       JavascriptExecutor executor = (JavascriptExecutor)driver;

       WebElement searchBox = (WebElement)executor.executeScript(
          "return document.getElementById('twotabsearchtextbox');");


     //  WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
    //

       executor.executeScript(
          "document.getElementById('twotabsearchtextbox').setAttribute('value', \"new message\");");

       String message = (String)executor.executeScript(
          "return document.getElementById('twotabsearchtextbox').value;");
       System.out.println("This is message :: "+message);

       executor.executeScript(
          "document.getElementById('twotabsearchtextbox').setAttribute('value', \"\");");

       searchBox.sendKeys("Lala Harpal Ke Joote");

        message = (String)executor.executeScript(
          "return document.getElementById('twotabsearchtextbox').value;");
       System.out.println("This is message :: "+message);

       WebElement searchButton= driver.findElement(By.xpath("//input[@value='Go']"));
       searchButton.click();


       executor.executeScript(
          "document.getElementsByClassName('nav-input')[0].style.display='none';");

       /*   "var array = document.querySelectorAll('*[class=nav-input]');" +
       "for(var i=0; i<array.length;i++){ "
             + "console.log(array[i].style.display='none'); }");*/
       WebElement searchButton1= driver.findElement(By.xpath("//input[@value='Go']"));
       //org.openqa.selenium.ElementNotVisibleException: element not visible
      System.out.println(searchButton1.isDisplayed());

       searchButton1.click();
   }

}
