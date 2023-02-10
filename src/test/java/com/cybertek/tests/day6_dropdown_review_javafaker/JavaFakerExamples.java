package com.cybertek.tests.day6_dropdown_review_javafaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerExamples {


    @Test
    public void faker_test(){

        Faker faker = new Faker();
       String firstname =  faker.name().firstName();

        System.out.println("firstname = " + firstname);

        String lastname = faker.name().lastName();

        System.out.println("lastname = " + lastname);

        String house = faker.gameOfThrones().house();

        System.out.println("house = " + house);


    }

}
