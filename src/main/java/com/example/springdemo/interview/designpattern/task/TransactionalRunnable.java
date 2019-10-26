package com.example.springdemo.interview.designpattern.task;

public class TransactionalRunnable implements Runnable {

    private final Runnable innerRunnable;

    public TransactionalRunnable(Runnable innerRunnable){
        this.innerRunnable=innerRunnable;
    }

    @Override
    public void run() {
        boolean shhouldRollback=false;
        try{
            beginTransaction();
            innerRunnable.run();
        }catch (Exception e){
            shhouldRollback=true;
            throw e;
        }finally {
            if(shhouldRollback){
                rollback();
            }else{
                commit();
            }
        }
    }

    private void beginTransaction() {
        System.out.println("beginTransaction");
    }

    private void rollback() {
        System.out.println("rollback");
    }

    private void commit() {
        System.out.println("commit");
    }
}
