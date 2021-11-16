package com.example.springdemo.offer;


/**
 * @author ykq
 * @date 2021/10/12 21:21
 */
public class ThreadTest {

    static ThreadLocal<String> local = new ThreadLocal<>();

    public static void main(String[] args) throws InterruptedException {
        //ThreadLocal测试
//        Thread t1 = new Thread(new Runnable(){
//
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                local.set("thread1");
//                System.out.println(local.get()+":1111");
//                local.remove();
//                System.out.println(local.get()+":1111");
//            }
//        });
//        Thread t2 = new Thread(new Runnable(){
//
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                local.set("Thread2");
//                System.out.println(local.get()+":2222");
//                local.remove();
//                System.out.println(local.get()+":2222");
//            }
//        });
//        t1.start();
//        t2.start();
//        System.out.println("0000");

        // Thread使用 守护线程
        RunnableDemo1 runnableDemo1 = new RunnableDemo1();
        Thread t1 = new Thread(runnableDemo1,"run1");
        Thread t2 = new Thread(runnableDemo1,"run2");
        Thread t3 = new Thread(runnableDemo1,"run3");
        Thread t4 = new Thread(runnableDemo1,"run4");
        Thread t5 = new Thread(runnableDemo1,"run5");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

//        new ThreadDemo1().start();
//        new ThreadDemo1().start();
//
//        Thread thread = new Thread(runnableDemo1);
//        thread.setDaemon(true);
//        thread.start();

        // wait notify 测试
//        Object object = new Object();
//        WaitNotifyThread thread = new WaitNotifyThread(true, object);
//        WaitNotifyThread thread1 = new WaitNotifyThread(false, object);
//
//        Thread t1 = new Thread(thread,"t1");
//        Thread t2 = new Thread(thread1, "t2");
//
//        t1.start();
//        t2.start();

        // yield join 测试
//        Thread t1 = new Producer();
//        Thread t2 = new Consumer();
//        t1.setPriority(Thread.MAX_PRIORITY);
//        t2.setPriority(Thread.MIN_PRIORITY);
//        t1.start();
//        t2.start();

        // 线程池
//        ThreadFactory namedThreadFactory = new CustomizableThreadFactory("springThread-pool-");
//        ExecutorService singleThreadPool = new ThreadPoolExecutor(10, 10,
//                0L, TimeUnit.SECONDS,
//                new LinkedBlockingQueue<Runnable>(), namedThreadFactory);
//
//        for (int i = 0; i < 100; i++) {
//            final int ii = i;
//            singleThreadPool.execute(()-> {
//                System.out.println(Thread.currentThread().getName()+":"+ii);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            });
//        }
//        singleThreadPool.shutdown();
    }
}
