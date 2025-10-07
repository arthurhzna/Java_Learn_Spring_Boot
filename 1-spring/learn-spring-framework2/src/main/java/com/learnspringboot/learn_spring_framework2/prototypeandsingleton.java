package com.learnspringboot.learn_spring_framework2;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;    

@Component
class NormalClass {
    public String toString() {
        return "NormalClass";
    }
}

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class PrototypeClass {
    public String toString() {
        return "PrototypeClass";
    }
}

@Configuration
@ComponentScan()
public class prototypeandsingleton {

    public static void main(String[] args) {

    try (var context = new AnnotationConfigApplicationContext(prototypeandsingleton.class)) {

        System.out.println(context.getBean(NormalClass.class)); //instance sama
        System.out.println(context.getBean(NormalClass.class)); //instance sama
        System.out.println(context.getBean(PrototypeClass.class)); 
        System.out.println(context.getBean(PrototypeClass.class)); //instance baru
        System.out.println(context.getBean(PrototypeClass.class)); //instance baru
        System.out.println(context.getBean(PrototypeClass.class)); //instance baru

        //jika ingin instance baru, maka harus menggunakan @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)


    }
    }
}