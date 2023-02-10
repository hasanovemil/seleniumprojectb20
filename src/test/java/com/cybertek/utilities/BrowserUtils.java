package com.cybertek.utilities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {

    public static List<String> getElementsText(List<WebElement> list){

          List<String> webelementsasString = new ArrayList<>();

        for (WebElement each : list) {
            webelementsasString.add(each.getText());
        }
        return webelementsasString;
    }

    public static void wait(int sec){
        try {
            Thread.sleep(5000 * sec);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

    }



}
