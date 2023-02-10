package com.cybertek.tests.day5_testNG_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dropdown_Introduction {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.google.com");

        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void dropdown_test_1() throws InterruptedException{

        Select simpledropdown = new Select(driver.findElement(By.id("dropdown")));

        String actualSelectedOption = simpledropdown.getFirstSelectedOption().getText();
        String exceptedSelectedOption = "Please select an option";

        Assert.assertEquals(actualSelectedOption,exceptedSelectedOption);

        Thread.sleep(2000);

        simpledropdown.selectByVisibleText("Option 2");








    }
}
