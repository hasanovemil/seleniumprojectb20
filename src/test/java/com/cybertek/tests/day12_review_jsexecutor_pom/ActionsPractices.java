package com.cybertek.tests.day12_review_jsexecutor_pom;

import com.cybertek.utilities.BrowserUtils;
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

    @Test
    public void p3_drag_and_drop(){

        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement smallcircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigcircle = Driver.getDriver().findElement(By.id("droptarget"));

        Actions actions = new Actions(Driver.getDriver());

        BrowserUtils.wait(15);

        actions.dragAndDrop(smallcircle,bigcircle).perform();

        String excepted = "You did great!";
        String actual = bigcircle.getText();

        Assert.assertTrue(actual.equals(excepted));

        BrowserUtils.wait(2);
        Driver.getDriver().close();


    }
}
