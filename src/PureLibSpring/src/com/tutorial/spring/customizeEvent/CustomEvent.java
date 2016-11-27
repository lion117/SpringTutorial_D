package com.tutorial.spring.customizeEvent;

/**
 * Created by Leo on 2016/11/27.
 */
import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent{

    public CustomEvent(Object source) {
        super(source);
    }

    public String toString(){
        return "My Custom Event";
    }
}