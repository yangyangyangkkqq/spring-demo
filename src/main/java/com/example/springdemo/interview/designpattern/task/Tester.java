package com.example.springdemo.interview.designpattern.task;

import sun.rmi.runtime.Log;

public class Tester {
    public static void main(String[] args) {
//        new TransactionalRunnable(new CodingTask(0)).run();
        new LoggingRunnable(new CodingTask(0)).run();
    }
}
