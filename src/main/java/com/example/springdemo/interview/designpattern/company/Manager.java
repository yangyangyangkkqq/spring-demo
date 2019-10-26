package com.example.springdemo.interview.designpattern.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 管理人员
 * @author johnyang
 * @date 2019/3/10
 */
public class Manager implements Role {
    private final List<Employee> reporters;

    public Manager(List<Employee> reporters) {
        this.reporters=Collections.unmodifiableList(new ArrayList<>(reporters));
    }

    @Override
    public String toString() {
        return "Manage";
    }

    @Override
    public void doWork() {
        System.out.println("Dispatching work");
        Employee worker=selectReporter();
        worker.doWork();
    }

    private Employee selectReporter() {
       if(reporters.isEmpty()){
           throw new IllegalStateException("Manage without reporters");
       }
       return reporters.get(0);
    }

}
