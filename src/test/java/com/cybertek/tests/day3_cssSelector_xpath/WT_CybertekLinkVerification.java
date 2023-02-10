package com.cybertek.tests.day3_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class WT_CybertekLinkVerification {

    public static void main(String[] args) {

       // WebDriverManager.chromedriver().setup();

        // WebDriver driver = new ChromeDriver();

       WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://practice.mail.ru/forgot password");






    }




}
