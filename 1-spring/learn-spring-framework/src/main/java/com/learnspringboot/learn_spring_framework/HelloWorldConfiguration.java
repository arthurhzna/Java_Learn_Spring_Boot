package com.learnspringboot.learn_spring_framework;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Arthur Hozanna";
    }
    
    
}

