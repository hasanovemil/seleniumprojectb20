package com.cybertek.tests.day10_testbase_properties_driverUtil;

import org.testng.annotations.Test;

public class Learningproperties {

    @Test
    public void java_properties_test(){
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"username\") = " + System.getProperty("username"));



    }
}
