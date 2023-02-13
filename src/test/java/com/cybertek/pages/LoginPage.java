package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id = "ctl00_MainContent_username") public WebElement Username;

     public WebElement usernameInput;

     @FindBy(id = "ctl00_MainContent_password") public WebElement password;

      public WebElement passwordinput;

      @FindBy(id = "ctl00_MainContent_login_button") public WebElement loginButton;
      public WebElement loginbutton;

      @FindBy(id = "ctl00_MainContent_status") public WebElement errormessage;
      public WebElement getErrormessage;



}
