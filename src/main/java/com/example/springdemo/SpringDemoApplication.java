package com.example.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {
        //spring ioc
//        ApplicationContext context=SpringApplication.run(SpringDemoApplication.class, args);
//        Person person=context.getBean(Person.class);
//        System.out.println(person.getName());
//        person.run();
        SpringApplication.run(SpringDemoApplication.class, args);
    }

}
