package com.cybertek.tests.day9_windows_tabs;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alert3Practice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }

     @Test
     public void p3_prompt_alert_practice(){

         WebElement promptalertbutton = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));

         promptalertbutton.click();

         Alert alert = driver.switchTo().alert();

         BrowserUtils.wait(2);

         alert.sendKeys("something is happening");

         alert.accept();

         WebElement resultText = driver.findElement(By.id("result"));

         Assert.assertTrue(resultText.isDisplayed(),"Text is not displayed.Verification failed!");



     }










}
