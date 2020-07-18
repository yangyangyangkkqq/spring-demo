package com.example.springdemo.spring.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Value("666")
    private String name;
    @Value("11")
    private int age;

    @Autowired
//    @Qualifier("CatImpl")
    private Cat cat;

    public void run(){
        cat.run();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
