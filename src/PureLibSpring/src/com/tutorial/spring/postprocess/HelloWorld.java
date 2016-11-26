package com.tutorial.spring.postprocess;

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

    public void init(){
        System.out.println("postprocess Bean is going through init.");
    }

    public void destroy(){
        System.out.println("postprocess Bean will destroy now.");
    }
}