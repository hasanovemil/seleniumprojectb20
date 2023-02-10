package com.cybertek.tests.day8_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IframePractice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/iframe");
    }

     @Test
    public void p4_iframe_practice(){

        driver.switchTo().frame("mce_0_ifr");

        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(1);


         WebElement yourcontentgoesheretext = driver.findElement(By.xpath("//p"));

         Assert.assertTrue(yourcontentgoesheretext.isDisplayed(),"Text is not displayed.Verification failed!");



    }





}
