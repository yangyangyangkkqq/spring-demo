package com.example.springdemo.interview.oop.company;

import java.util.List;
import java.util.Objects;

/**
 * 雇员类
 * @author johnyang
 * @date 2019/3/10
 */
public class Employee {
    public static List<Employee> allEmployees;

    private final String name;
    private final int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name){
        this.name=name;
        this.salary=0;
    }

    public void doWork(){

    }

    public void getPaid(BankEndPoint bankEndPoint){
        bankEndPoint.payment(this.name,this.salary);
    }

    // Loads all employees from database.
    static void loadAllEmployee(){

    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name,this.salary);
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }
        if (this==null){
            return false;
        }
        if (getClass()!=obj.getClass()){
            return false;
        }
        Employee other=(Employee)obj;
        return Objects.equals(this.getName(),other.getName())&&
                Objects.equals(this.getSalary(),other.getSalary());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
