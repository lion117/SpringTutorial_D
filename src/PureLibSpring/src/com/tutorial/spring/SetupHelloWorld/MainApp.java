package com.tutorial.spring.SetupHelloWorld;

/**
 * Created by Leo on 2016/11/26.
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld_test");

        obj.getMessage();
    }
}