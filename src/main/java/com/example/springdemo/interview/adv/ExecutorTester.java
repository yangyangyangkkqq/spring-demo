package com.example.springdemo.interview.adv;

import com.example.springdemo.interview.designpattern.task.CodingTask;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Java Executor Framework演示
 */
public class ExecutorTester {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService=Executors.newFixedThreadPool(3);
        List<Future<?>> taskResults=new LinkedList<>();
        for (int i=0;i<10;i++){
            taskResults.add(executorService.submit(new CodingTask(i)));
        }
        System.out.println("10 tasks dispatched successfully.");
        for (Future<?> taskResult:taskResults){
            taskResult.get();
        }
        System.out.println("All tasks finished.");
        executorService.shutdown();
    }
}
