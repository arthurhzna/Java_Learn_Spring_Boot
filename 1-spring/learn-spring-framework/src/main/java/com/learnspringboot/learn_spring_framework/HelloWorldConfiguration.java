package com.learnspringboot.learn_spring_framework;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.beans.factory.annotation.Qualifier;


record Person(String name, int age ) {}
record Address(String firstLine, String city) {}
record Person2(String name, Address address ) {}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Arthur Hozanna";
    }

    @Bean
    public int age() {
        return 25;
    }

    @Bean
    public Person person() {
        var person = new Person(name(), age());
        return person;
    }

    // @Bean
    // public Address Address() {
    //     var address = new Address("Ness", "Surabaya");
    //     return address;
    // }

    @Bean(name = "Address2")
    @Primary
    public Address Address1() {
        return new Address("Ness", "Surabaya");
    }

    @Bean
    public Person2 person2callmethod() {
        return new Person2(name(), new Address("Ness", "Surabaya"));
    }

    @Bean
    public Person2 personCostum(String name, Address address) {
        return new Person2(name, address);
    }

    @Bean
    @Primary
    public Person2 person2callmethod2() {
        return new Person2("Arthur Hozanna", new Address("Ness", "Surabaya"));
    }

    @Bean
    @Qualifier("address2qualifier")
    public Address address2qualifier() {
        return new Address("Ness", "Surabaya");
    }


}

