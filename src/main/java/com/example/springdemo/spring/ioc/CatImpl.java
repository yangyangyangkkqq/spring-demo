package com.example.springdemo.spring.ioc;

import org.springframework.stereotype.Component;

@Component("CatImpl")
public class CatImpl implements Cat {
    @Override
    public void run() {
        System.out.println("Cat is running...");
    }
}
