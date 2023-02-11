package com.cybertek.tests.day11_utils_review_actions;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Actionpractices {


    @Test
    public void hover_over_test(){

        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//div[@class='figure'])[1]"));



    }


}
