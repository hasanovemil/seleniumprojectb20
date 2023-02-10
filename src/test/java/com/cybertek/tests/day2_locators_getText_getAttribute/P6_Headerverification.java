package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_Headerverification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://zero.webappsecurity.com/login.html");

        String actualText = driver.findElement(By.tagName("h3")).getText();
        String expectedText = "Log in to Zerobank";

        if(actualText.equals(expectedText)){
            System.out.println("Header verification passed!");
        }else{
            System.out.println("Header verification failed!");
        }


    }
}
