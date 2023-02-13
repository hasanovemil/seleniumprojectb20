package com.cybertek.tests.day13_pom_synchronization;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.testng.annotations.Test;

public class NegativeLoginTests_SB {

    LoginPage loginPage;

    @Test(description = "entering incorrect username")
    public void negative_login_test1(){

        String url = ConfigurationReader.getProperty("Smartbearurl");
        Driver.getDriver().get(url);

        loginPage = new LoginPage();

        String username = ConfigurationReader.getProperty("smartbear_username");
        loginPage.usernameInput.sendKeys("Tester");

        String password = ConfigurationReader.getProperty("smartbear_password");
        loginPage.passwordinput.sendKeys("test");

        loginPage.loginButton.click();





    }

    @Test(description = "using login method for negative tests")
    public void negative_login_test2(){
        String url = ConfigurationReader.getProperty("Smartbearurl");
        Driver.getDriver().get(url);

        loginPage = new LoginPage();

        String username = "wrongusername";
        String password = ConfigurationReader.getProperty("smartbear_password");




    }


}
