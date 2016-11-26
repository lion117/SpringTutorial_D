package com.tutorial.spring.postprocess;

/**
 * Created by Leo on 2016/11/26.
 */

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld_postprocess");
        obj.getMessage();
        context.registerShutdownHook();
    }
}