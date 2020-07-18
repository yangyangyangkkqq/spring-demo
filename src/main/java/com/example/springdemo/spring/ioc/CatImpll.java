package com.example.springdemo.spring.ioc;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("CatImpll")
@Primary
public class CatImpll implements Cat{
    @Override
    public void run() {
        System.out.println("cat is running====");
    }
}
