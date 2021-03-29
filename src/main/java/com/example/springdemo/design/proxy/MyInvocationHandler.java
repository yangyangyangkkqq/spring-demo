package com.example.springdemo.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * jdk动态代理
 */
public class MyInvocationHandler implements InvocationHandler {

    Image image;

    public MyInvocationHandler(Image image){
        this.image=image;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用代理类");
        if(method.getName().equals("display")){
            method.invoke(image,args);
            System.out.println("调用display方法");
        }
        return null;
    }
}
