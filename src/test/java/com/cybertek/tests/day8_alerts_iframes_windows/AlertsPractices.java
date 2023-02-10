package com.cybertek.tests.day8_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsPractices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }

    @Test
    public void p1_information_alert_practice(){

        WebElement warningAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));

        warningAlertButton.click();

        Alert alert = driver.switchTo().alert();

        alert.accept();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(resultText.isDisplayed(),"Result text is not displayed.Verification failed!");
    }

     @Test
    public void p2_confirmation_alert_practice(){

         WebElement warningAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));

         warningAlertButton.click();

         Alert alert = driver.switchTo().alert();

         alert.accept();

        WebElement resulttext = driver.findElement(By.xpath("//p[@id='result']"));

        resulttext.click();


     }











     }







