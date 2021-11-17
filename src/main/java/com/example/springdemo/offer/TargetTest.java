package com.example.springdemo.offer;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射 测试
 * @author ykq
 * @date 2021/11/17 15:33
 */
public class TargetTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class<?> targetClass = Class.forName("com.example.springdemo.offer.TargetObject");
        TargetObject targetObject = (TargetObject) targetClass.newInstance();
        // 获取所有定义方法
        Method[] methods = targetClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        // 获取指定方法执行
        Method method = targetClass.getDeclaredMethod("publicMethod", String.class);
        method.invoke(targetObject, "public");
        // 调用private方法
        Method method1 = targetClass.getDeclaredMethod("privateMethod");
        method1.invoke(targetObject);
        // 修改参数
        Field field = targetClass.getDeclaredField("value");
        field.setAccessible(true);
        field.set(targetObject, "JAVATEST");
        Method method2 = targetClass.getDeclaredMethod("privateMethod");
        method2.setAccessible(true);
        method2.invoke(targetObject);
    }
}
