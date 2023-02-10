package com.cybertek.tests.day8_alerts_iframes_windows;

import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTablePractices {

    WebDriver driver;
    @BeforeMethod

    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearUtilities.logintoSmartBear(driver);
    }


    @Test
    public void task4_verify_order(){

        SmartBearUtilities.verifyorder(driver,"Mark Smith");
    }

    @Test
    public void task5_print_names_and_cities(){
        SmartBearUtilities.printnamesandcities(driver);
    }


}
