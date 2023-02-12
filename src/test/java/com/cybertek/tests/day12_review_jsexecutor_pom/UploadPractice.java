package com.cybertek.tests.day12_review_jsexecutor_pom;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UploadPractice {

    @Test
    public void uploading_file_test(){
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");
        Driver.getDriver().manage().window().maximize();

        String path = "C:\\Users\\lenovo\\Desktop";

        WebElement uploadinput = Driver.getDriver().findElement(By.id("file-upload"));
        BrowserUtils.wait(3);
        uploadinput.sendKeys(path);

        WebElement uploadbutton = Driver.getDriver().findElement(By.id("file-submit"));
        BrowserUtils.wait(2);
        uploadbutton.click();



    }
}
