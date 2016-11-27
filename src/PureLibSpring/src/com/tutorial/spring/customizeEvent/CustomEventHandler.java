package com.tutorial.spring.customizeEvent;

/**
 * Created by Leo on 2016/11/27.
 */

import org.springframework.context.ApplicationListener;

public class CustomEventHandler
        implements ApplicationListener<CustomEvent>{

    public void onApplicationEvent(CustomEvent event) {
        System.out.println(event.toString());
    }

}