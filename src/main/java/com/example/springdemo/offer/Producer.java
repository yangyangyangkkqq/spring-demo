package com.example.springdemo.offer;

/**
 * @author ykq
 * @date 2021/10/15 11:08
 */
public class Producer extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println("producer:"+i);
            Thread.yield();
        }
    }
}
