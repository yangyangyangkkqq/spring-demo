package com.example.springdemo.interview.oop.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 管理人员
 * @author johnyang
 * @date 2019/3/10
 */
public class Manager extends Employee{
    private final List<Employee> reporters;

    public Manager(String name, int salary,List<Employee> reporters) {
        super(name, salary);
        this.reporters=Collections.unmodifiableList(new ArrayList<>(reporters));
    }

    @Override
    public void getPaid(BankEndPoint bankEndPoint) {
        super.getPaid(bankEndPoint);
        getStocks();
    }

    private void getStocks() {

    }
    
    @Override
    public String toString() {
        return "Manager [name=" + getName()
                + ", salary=" + getSalary() + "]";
    }
    
    @Override
    public void doWork() {
        Employee worker=selectReporter();
        worker.doWork();
    }

    private Employee selectReporter() {
        loadReporters();
        return this;
    }

    private void loadReporters() {
        reporters.clear();;
        reporters.add(new Employee("john",10000));
        reporters.add(new Employee("mary",20000));
    }
}
