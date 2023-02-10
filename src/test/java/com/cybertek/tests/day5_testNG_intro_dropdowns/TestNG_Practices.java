package com.cybertek.tests.day5_testNG_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Practices {

    WebDriver driver;

    @BeforeMethod
    public void setupmethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com");

    }

    @Test
    public void google_title_verification(){


       String expectedTitle = "Google";
       String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        Assert.assertEquals(actualTitle, expectedTitle, "Titles are not matching");
    }

    @Test
    public void google_search_title_verification(){

        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys("apple"+ Keys.ENTER);

        String exceptedIntitle = "apple";
        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(exceptedIntitle),"Title does not contin search value.");
    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException{
        Thread.sleep(3000);
        driver.close();
    }






}
