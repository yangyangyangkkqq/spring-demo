package com.example.springdemo.design.Proxy;

import com.example.springdemo.interview.designpattern.company.Engineer;

import java.lang.reflect.Proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
//        //静态代理
//        Image image=new ProxyImage("test_10mb.jpg");
//        //图像将从磁盘加载
//        image.display();
//        System.out.println("");
//        //图像不需要从磁盘加载
//        image.display();

        //jdk动态代理
//        Image image1=new RealImage("test_11mb.jpg");
//        MyInvocationHandler invocationHandler=new MyInvocationHandler(image1);
//
//        Image proImage1=(Image) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Image.class},invocationHandler);
//        proImage1.display();

        //Cglib动态代理
        //生成代理类
        Engineerr engineer=(Engineerr) CglibProxy.getProxy(new Engineerr());
        //调用相关方法
        engineer.eat();
    }
}
