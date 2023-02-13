package com.cybertek.tests.day13_pom_synchronization;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.testng.annotations.Test;

public class NegativeLoginTests_SB {

    @Test(description = "entering incorrect username")
    public void negative_login_test(){

        Driver.getDriver().get(ConfigurationReader.getProperty("Smartbearurl"));


    }
}
