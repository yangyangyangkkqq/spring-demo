package com.example.springdemo.interview.oop.company;

public class Tester {
    public static void main(String[] args) {
        Employee employee1=new Employee("John",10000);
        Employee employee2=new Employee("Mary",20000);
        Employee employee3=new Employee("John",10000);

        System.out.println("Testing equest");
        System.out.println("employee1==employee3 ?"+(employee1==employee3));
        System.out.println("employee1.equals(employee3) ?"+(employee1.equals(employee3)));
        System.out.println("employee1.equals(employee2) ?"+(employee1.equals(employee2)));
    }
}
