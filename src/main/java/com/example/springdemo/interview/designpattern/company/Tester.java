package com.example.springdemo.interview.designpattern.company;

import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        Employee employee1=new Employee("John",10000,new Engineer());
        System.out.println(employee1);
        employee1.doWork();
        employee1.setRole(new Manager(Arrays.asList(new Employee("marry",20000,new Engineer()))));
        System.out.println(employee1);
        employee1.doWork();
    }
}
