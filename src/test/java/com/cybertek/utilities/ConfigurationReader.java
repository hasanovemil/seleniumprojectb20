package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();

    static{

        try {
            FileInputStream file = new FileInputStream("configuration.properties");

            properties.load(file);
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("Properties file not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }


}
