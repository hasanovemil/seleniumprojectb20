package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBearUtilities {

       public static void logintoSmartBear(WebDriver driver){
           WebElement usernameInput = driver.findElement(By.id("ctl00_MainContent_username"));
           usernameInput.sendKeys("Tester");

           WebElement passwordInput = driver.findElement(By.id("ctl00_MainContent_password"));
           passwordInput.sendKeys("test");

           WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
           loginButton.click();

           WebElement errormessage = driver.findElement(By.id("ctl00_MainContent_status"));
           errormessage.getAttribute("Invalid Login or Password.");
       }



          public static void verifyorder(WebDriver driver, String name){
           List<WebElement> namesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));

           for(WebElement each : namesList){
               if(each.getText().equals(name)){
                   Assert.assertTrue(true);
                   return;
               }
           }

           Assert.fail("Name does not exist in the list!");
       }

       public static void printnamesandcities(WebDriver driver){
           List<WebElement> namesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));

           List<WebElement> citiesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[7]"));

           for (int i = 0; i < namesList.size(); i++) {

               System.out.println("Name"+(i+1)+ ": "+namesList.get(i).getText() + " ,City"+(i+1)+": " + citiesList.get(i).getText());
           }




       }








}
