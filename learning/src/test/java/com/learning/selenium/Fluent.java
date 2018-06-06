package com.learning.selenium;

import java.io.File;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class Fluent
{
    @Test
    public void fluent()
    {
       DesiredCapabilities dc = DesiredCapabilities.chrome();
       dc.setCapability(CapabilityType.BROWSER_NAME, "chrome");
       ChromeOptions options = new ChromeOptions();
       options.addArguments("disable-infobars");
       dc.setCapability("chromeOptions", options);

       File chPath = new File("C:/Gaurav/seleniumserver/Drivers/chromedriver.exe");
       System.setProperty("webdriver.chrome.driver", chPath.getAbsolutePath());
       WebDriver driver = new ChromeDriver(dc);
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

   }

}
