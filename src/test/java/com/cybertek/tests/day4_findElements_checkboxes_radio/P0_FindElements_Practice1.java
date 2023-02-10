package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P0_FindElements_Practice1 {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        driver.get("https://modern.az/iqtisadiyyat/390218/ten-il-elektrik-enerjisinin-ixraci-artib/");

        List<WebElement> listofLinks = driver.findElements(By.xpath("//body//a"));

        for(WebElement eachLink : listofLinks ){
            System.out.println(eachLink.getText());
        }

        int numberoflinks = listofLinks.size();

        System.out.println(numberoflinks);





    }
}
