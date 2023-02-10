package com.cybertek.tests.day10_testbase_properties_driverUtil;

import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_file() throws IOException {

        Properties properties1 = new Properties();

        String path = "configuration.properties";

        FileInputStream file1 = new FileInputStream(path);

        properties1.load(file1);

        System.out.println("properties1.getProperty() = " + properties1.getProperty("browser"));
        System.out.println("properties1.getProperty(\"username\") = " + properties1.getProperty("username"));


    }

    @Test
    public void using_properties_utility_method(){
        System.out.println("ConfigurationReader.getProperty(\"browser\") = " + ConfigurationReader.getProperty("browser"));
        System.out.println("ConfigurationReader.getProperty(\"Smartbearurl\") = " + ConfigurationReader.getProperty("Smartbearurl"));


    }
}
