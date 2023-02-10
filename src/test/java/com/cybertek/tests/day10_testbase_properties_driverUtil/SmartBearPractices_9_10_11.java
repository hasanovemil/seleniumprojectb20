package com.cybertek.tests.day10_testbase_properties_driverUtil;

import com.cybertek.tests.base.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.SmartBearUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class SmartBearPractices_9_10_11 extends TestBase {



    @Test
    public void p9_delete_order_task() throws IOException {

        //Creating properties object to be able to read properties file

        Properties p1 = new Properties();

        // Opening file in JVM memory using fileinputstream object
        FileInputStream f1 = new FileInputStream("configuration.properties");

        // Loading file into properties object
        p1.load(f1);
        String url = p1.getProperty("SmartbearURL");


        driver.get(url);
        SmartBearUtilities.logintoSmartBear(driver);


        WebElement marksmithcheckbox = driver.findElement(By.xpath("//td[.='Mark Smith']/../td[1]"));
        BrowserUtils.wait(2);
        marksmithcheckbox.click();

         WebElement deletebutton = driver.findElement(By.id("ctl00_MainContent_btnDelete"));

        deletebutton.click();

        List<WebElement> allnames = driver.findElements(By.id("//table[.='ctl00_MainContent_orderGrid']//tr/td[2]"));

        for(WebElement each : allnames){
            Assert.assertFalse(each.getText().equals("Mark Smith"));
        }



    }







}
