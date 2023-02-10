package com.cybertek.tests.day9_windows_tabs;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandlingPractices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/windows");
    }

    @Test
    public void p5_handling_windows(){

        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        Assert.assertTrue(actualTitle.equals("Windows"));

        WebElement clickhereLink = driver.findElement(By.linkText("Click Here"));
        clickhereLink.click();

        String titleafterClick = driver.getTitle();
        System.out.println("titleafterClick = " + titleafterClick);

        String mainHandle = driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);

        Set<String> windowHandles = driver.getWindowHandles();

        for (String each : windowHandles) {
            driver.switchTo().window(each);
            System.out.println("Current Title = " + driver.getTitle());



        }

        Assert.assertTrue(driver.getTitle().equals("New Window"));

        BrowserUtils.wait(20);

        driver.close();

        driver.switchTo().window(mainHandle);

        driver.quit();


    }

    @Test
    public void p6_handling_more_than_two_windows(){

        driver.get("https://www.amazon.com/");

        ((JavascriptExecutor) driver).executeScript("window.open('https://www.google.com/','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://www.etsy.com/','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://www.facebook.com/','_blank');");

        Set<String> windowHandles = driver.getWindowHandles();

        for (String each : windowHandles) {
            BrowserUtils.wait(5);
            driver.switchTo().window(each);

            System.out.println("Current Title = " + driver.getTitle());

            if(driver.getCurrentUrl().contains("Etsy")){
                Assert.assertTrue(driver.getTitle().contains("Etsy"));
                break;
            }


        }



    }










}
