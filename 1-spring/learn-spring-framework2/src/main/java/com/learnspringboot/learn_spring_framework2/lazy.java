package com.learnspringboot.learn_spring_framework2;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Component
class ClassA{

}

@Component
@Lazy
class ClassB{
    private ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("ClassB constructor");
        this.classA = classA;
    }
    
}

@Configuration
@ComponentScan()
public class lazy {

    public static void main(String[] args) {
        // try (var context = new AnnotationConfigApplicationContext(lazy.class)) {
        //     System.out.println(context.getBean(ClassB.class));
        // }

        var context = new AnnotationConfigApplicationContext(lazy.class);
    }
}
