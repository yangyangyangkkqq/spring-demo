package com.example.springdemo.offer;

/**
 * 反射 实例
 * @author ykq
 * @date 2021/11/17 15:28
 */
public class TargetObject {

    private String value;

    public TargetObject() {
        value = "javaTest";
    }

    public void publicMethod(String s){
        System.out.println("public:"+s);
    }

    public void privateMethod(){
        System.out.println("private:"+value);
    }
}
