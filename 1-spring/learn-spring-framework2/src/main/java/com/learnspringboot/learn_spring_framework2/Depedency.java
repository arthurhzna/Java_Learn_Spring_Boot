package com.learnspringboot.learn_spring_framework2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
class Dependency1 {

}
@Component
class Dependency2 {
    public String toString() {
        return "Dependency2";
    }
}

@Component
class YourBusinessClass {

    // @Autowired
    // Dependency1 dependency1;

    // @Autowired
    // Dependency2 dependency2;

    // @Autowired
    // public void setDependency1(Dependency1 dependency1) {
    //     this.dependency1 = dependency1;
    // }
    // @Autowired
    // public void setDependency2(Dependency2 dependency2) {
    //     this.dependency2 = dependency2;
    // }

    Dependency1 dependency1;
    Dependency2 dependency2;

    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        super();
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }



    public String toString() {
        return "YourBusinessClass [dependency1=" + dependency1 + ", dependency2=" + dependency2 + "]";
    }

    public void testing() {
        System.out.println(this.dependency2.toString());
    }



}

@Configuration
@ComponentScan("com.learnspringboot.learn_spring_framework2")
public class Depedency {
    
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(Depedency.class)) {
            
            // Ambil YourBusinessClass dari Spring container
            YourBusinessClass business = context.getBean(YourBusinessClass.class);
            
            // Print hasilnya untuk melihat apakah @Autowired bekerja
            System.out.println(business);
            business.testing();
            
        }
    }
}
