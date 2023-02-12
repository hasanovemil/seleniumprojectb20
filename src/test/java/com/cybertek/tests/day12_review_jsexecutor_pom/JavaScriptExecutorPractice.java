package com.cybertek.tests.day12_review_jsexecutor_pom;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutorPractice {

    @Test
    public void scroll_using_jsexecutor(){

        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


        for (int i = 0; i < 10; i++) {
            BrowserUtils.wait(2);

            js.executeScript("window.scrollBy(0,500)");
        }






    }

    @Test
    public void scroll_using_jsexecutor2(){
        Driver.getDriver().get("http://practice.cybertekschool.com/large");

        WebElement link = Driver.getDriver().findElement(By.linkText("cybertekschool"));

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        js.executeScript("arguments[0].scroolintoview(true)",link);

    }

    @Test
    public void fill_form_using_javascript(){

        Driver.getDriver().get("http://practice.cybertekschool.com/sign_up");

        WebElement usernameInput = Driver.getDriver().findElement(By.name("full_name"));
        WebElement emailInput = Driver.getDriver().findElement(By.name("email"));
        WebElement signupbutton = Driver.getDriver().findElement(By.name("wooden_spoon"));





    }
}
