package com.example.springdemo.offer;

/**
 * @author ykq
 * @date 2021/10/13 12:24
 */
public class ThreadDemo1 extends Thread{
    private int ticket = 100;

    @Override
    public void run() {
        while (true){
            System.out.println("threadDemo1 ticket:"+Thread.currentThread().getName()+":"+ticket--);
            if (ticket<0){
                break;
            }
        }

    }
}
