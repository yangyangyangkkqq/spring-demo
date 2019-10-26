package com.example.springdemo.interview.designpattern.task;

public class CodingTask implements Runnable{

    private final int employeeId;

    public CodingTask(int employeeId){
        this.employeeId=employeeId;
    }

    @Override
    public void run() {
        System.out.println("Employee "+employeeId+" started writing code.");
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("Emplyee "+employeeId+" finished writing code.");
    }

}
