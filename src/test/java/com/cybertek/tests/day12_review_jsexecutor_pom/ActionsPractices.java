package com.cybertek.tests.day12_review_jsexecutor_pom;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPractices {

    @Test
    public void p2_double_click_test(){

        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        Driver.getDriver().switchTo().frame("iframeResult");

        WebElement texttodoubleclick = Driver.getDriver().findElement(By.id("demo"));

        Actions actions = new Actions(Driver.getDriver());

        actions.doubleClick(texttodoubleclick).perform();

        String excepted = "red";
        String actual = texttodoubleclick.getAttribute("style");

        Assert.assertTrue(actual.contains(excepted));








    }
}
