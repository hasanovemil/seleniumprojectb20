package com.cybertek.tests.day8_alerts_iframes_windows;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class DropDownPractices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void p7_month_dropdown_default_value_test(){

        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));

        String expectedvalue = LocalDateTime.now().getMonth().name();
        System.out.println("expectedvalue = " + expectedvalue);

        String actualvalue = monthDropdown.getFirstSelectedOption().getText();
        System.out.println("actualvalue = " + actualvalue);

        Assert.assertEquals(actualvalue.toLowerCase(),expectedvalue.toLowerCase());

        List<WebElement> actualmonthOptions = monthDropdown.getOptions();

        List<String> expectedMonthOptions = Arrays.asList("January","February","March","April","May",
                "June","July","August","September","October","November","December");


      //  List<String> actualmonthTexts = new ArrayList<>();

      //  for(WebElement each : actualmonthOptions){

        //    actualmonthTexts.add(each.getText());

        Assert.assertEquals(BrowserUtils.getElementsText(actualmonthOptions),expectedMonthOptions);

        }





    }

