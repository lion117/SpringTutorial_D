package com.tutorial.spring.scope;

/**
 * Created by Leo on 2016/11/26.
 */

public class HelloWorld {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}