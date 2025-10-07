package com.learnspringboot.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Arrays;

public class App02HelloWorldSpring {

    public static void main(String[] args) {

        // System.out.println("Hello World");
        
        try (var context = 
                new AnnotationConfigApplicationContext
                        (HelloWorldConfiguration.class)) {
                                    // var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
                        // System.out.println(context.getBean("name"));
                        // System.out.println(context.getBean("person"));
                        // System.out.println(context.getBean("Address2"));
                        System.out.println(context.getBean(Address.class));
                        // System.out.println(context.getBean("person2callmethod"));
                        // System.out.println("Person2 call method");
                        // System.out.println(context.getBean(Person.class));
                        // System.out.println(context.getBean("personCostum"));
                        // Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
                        }
    }
}


