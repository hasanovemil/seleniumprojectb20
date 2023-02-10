package com.cybertek.tests.day7_webtables;

import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTableTasks {
    WebDriver driver;
    @BeforeMethod

    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearUtilities.logintoSmartBear(driver);
    }

    @Test

    public void p3_verify_susans_order_date(){

        WebElement susansDate = driver.findElement(By.xpath("//td[.='Susan McLaren']/following-sibling::td[3]"));

        // System.out.println("susansDate = " + susansDate.getText());

        String expecteddate = "01/05/2010";
        String actualdate = susansDate.getText();

        Assert.assertTrue(actualdate.equals(expecteddate));
        Assert.assertEquals(actualdate,expecteddate,"actualdate is not equal expecteddate");
    }


}
