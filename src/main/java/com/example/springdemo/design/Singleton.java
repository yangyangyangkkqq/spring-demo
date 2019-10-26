package com.example.springdemo.design;

/**
 * 单例模式
 */
public class Singleton {

    private Singleton(){}

    /**
     * 懒汉式，线程不安全
     */
    private static Singleton instance;

    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

    /**
     * 懒汉式，线程安全，加锁影响效率
     */
    private static Singleton instance1;

    public static synchronized Singleton getInstance1(){
        if(instance1==null){
            instance1=new Singleton();
        }
        return instance1;
    }
    /**
     * 饿汉式，常用，浪费内存
     */
    private static Singleton instance2=new Singleton();

    public static Singleton getInstance2(){
        return instance2;
    }
    /**
     * 双重检验锁，多线程下保持高性能
     */
    private volatile static Singleton instance3;

    public static Singleton getInstance3(){
        if(instance3==null){
            synchronized(Singleton.class){
                if(instance3==null){
                    instance3=new Singleton();
                }
            }
        }
        return instance3;
    }

    /**
     * 静态内部类，与双重检验锁方式效果一样，但实现更简单
     */
    private static class SingletonHolder{
        private static final Singleton INSTANCE=new Singleton();
    }

    public static final Singleton getInstance4(){
        return SingletonHolder.INSTANCE;
    }
    /**
     * 枚举，最佳方式
     */
    public enum SingletonEnum {
        INSTANCE;

        public void whateverMethod() {

        }
    }

    public static void main(String[] args) {
        SingletonEnum singleton=SingletonEnum.INSTANCE;
        singleton.whateverMethod();
    }
}
