package com.tutorial.spring.annotation;

/**
 * Created by Leo on 2016/11/27.
 */
import org.springframework.context.annotation.*;

@Configuration
public class HelloWorldConfig {

    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
}