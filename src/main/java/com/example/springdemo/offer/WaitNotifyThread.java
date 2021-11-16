package com.example.springdemo.offer;

/**
 * @author ykq
 * @date 2021/10/15 10:43
 */
public class WaitNotifyThread implements Runnable {

    private Boolean flag;

    private Object object;

    public WaitNotifyThread(Boolean flag, Object object){
        this.flag = flag;
        this.object = object;
    }

    private void notifyThread(){
        synchronized (object){
            System.out.println("notify start=======");
            object.notify();
            System.out.println("notify end=========");
        }
    }

    private void waitThread(){
        synchronized (object) {
            System.out.println("wait start======");
            try {
                object.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("wait end=======");
        }
    }

    @Override
    public void run() {
        if (flag){
            waitThread();
        }else {
            notifyThread();
        }
    }
}
