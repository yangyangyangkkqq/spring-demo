package com.example.springdemo.offer;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ykq
 * @date 2021/10/13 12:14
 */
public class RunnableDemo1 implements Runnable{

    private int ticket = 1;

    private AtomicInteger ticketAto = new AtomicInteger(1);

    private Lock lock = new ReentrantLock();

    @Override
    public void run() {

            if (lock.tryLock()){

                try {
                    while (ticket<1000){
                //            int ticket = ticketAto.get();
                //            int ticketAdd = ticket + 1;
                //            if (ticketAto.compareAndSet(ticket, ticketAdd)){
                            System.out.println(Thread.currentThread().getName()+":"+ticket++);
                //            }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }


//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
    }
}
