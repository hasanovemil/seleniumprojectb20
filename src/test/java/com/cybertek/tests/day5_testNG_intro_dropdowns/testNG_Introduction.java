package com.cybertek.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class testNG_Introduction {
    @BeforeClass
    public void setupClass(){
        System.out.println("Before class is running ...");
    }
    @AfterClass
    public void teardownClass(){
        System.out.println("After class is running ...");
    }


    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before method is runnung ...");
    }
    @AfterMethod
    public void teardownMethod(){
        System.out.println("After method is running ... ");
    }


    @Test
    public void test1(){
        System.out.println("Test1 is running...");
    }
    @Test
    public void test2(){
        System.out.println("Test2 is running...");
    }
    @Test
    public void test3(){
        String str1 = "testNG";
        String str2 = "testNG";
        String str3 = "hasanov";

        Assert.assertTrue(str1.equals(str2));

        Assert.assertTrue(str1.equals(str3),"str1 is not equal str3");

        System.out.println("Just checking if this line will run ???");

        Assert.assertEquals(str1,str2,"Failure message just in case one str1 is not equals str2");
    }







}
