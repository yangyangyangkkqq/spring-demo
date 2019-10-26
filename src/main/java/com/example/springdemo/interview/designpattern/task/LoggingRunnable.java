package com.example.springdemo.interview.designpattern.task;

public class LoggingRunnable implements Runnable{
    private final Runnable innnerRunnable;

    public LoggingRunnable(Runnable innnerRunnable){
        this.innnerRunnable=innnerRunnable;
    }

    @Override
    public void run() {
        long startTime=System.currentTimeMillis();
        System.out.println("Task started at "+startTime);
        innnerRunnable.run();
        System.out.println("Task finished.Elapsed time:"+(System.currentTimeMillis()-startTime));
    }
}
