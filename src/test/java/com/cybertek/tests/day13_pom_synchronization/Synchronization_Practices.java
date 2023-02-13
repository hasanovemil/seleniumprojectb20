package com.cybertek.tests.day13_pom_synchronization;

import com.cybertek.pages.Loading7page;
import com.cybertek.utilities.Driver;
import org.testng.annotations.Test;

public class Synchronization_Practices {

    @Test
    public void p40_dynamic_title_test(){
        String url = "http://practice.cybertekschool.com/dynamic_loading/7";
        Driver.getDriver().get(url);

        Loading7page loading7page = new Loading7page();








    }

}
