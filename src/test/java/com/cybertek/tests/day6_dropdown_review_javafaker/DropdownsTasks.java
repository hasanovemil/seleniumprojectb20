package com.cybertek.tests.day6_dropdown_review_javafaker;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class DropdownsTasks {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

       driver = WebDriverFactory.getDriver("chrome");

       driver.get("http://practice.cybertekschool.com/dropdown");

    }
    @Test
    public void test2_verify_state_dropdown() throws InterruptedException{

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));


        Thread.sleep(5000);
        stateDropdown.selectByVisibleText("Illinois");

        Thread.sleep(5000);
        stateDropdown.selectByValue("VA");

        Thread.sleep(5000);
        stateDropdown.selectByIndex(5);

        String expectedResult = "California";
        String actualResult = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualResult,expectedResult,"Actual vs expected is not equal!");

    }

    @Test
    public void test3_date_dropdown_verification(){

        Select yeardropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthdropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select daydropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        yeardropdown.selectByVisibleText("1947");
        monthdropdown.selectByValue("1");
        daydropdown.selectByIndex(21);

        String expectedyear = "1947";
        String expectedmonth = "February";
        String expectedday = "22";

        String actualyear = yeardropdown.getFirstSelectedOption().getText();
        String actualmonth = monthdropdown.getFirstSelectedOption().getText();
        String actualday = daydropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(expectedyear,actualyear,"actual year vs expected year is not equal!");
        Assert.assertEquals(expectedmonth,actualmonth,"actual month vs expected month is not equal!");
        Assert.assertTrue(actualday.equals(expectedday),"Actual day vs expected day is not equal!");

    }
    @Test
    public void test4_multiple_value_select_dropdown(){

        Select multipleselectdropdown = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));

        List<WebElement> allOptions = multipleselectdropdown.getOptions();

        for(WebElement eachoption : allOptions){
            eachoption.click();

            System.out.println("Selected: "+eachoption.getText());

            Assert.assertTrue(eachoption.isSelected(),"The option: "+eachoption.getText()+" is not selected!");
        }

        multipleselectdropdown.deselectAll();

        for(WebElement eachoption : allOptions){
            Assert.assertTrue(!eachoption.isSelected());
        }







    }



}
