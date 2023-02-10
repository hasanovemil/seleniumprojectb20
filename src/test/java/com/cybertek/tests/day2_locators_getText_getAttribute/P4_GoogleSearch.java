package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearch {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);

        String expectedtitle = "apple - Google Search";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedtitle)){
            System.out.println("Search title verification passed!");
        }else{
            System.out.println("Search title veriication failed!");
        }


    }
}
