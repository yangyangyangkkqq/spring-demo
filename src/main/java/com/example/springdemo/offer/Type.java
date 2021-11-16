package com.example.springdemo.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ykq
 * @date 2021/10/11 14:33
 */
public class Type {
    // 常量
    public static final String a1 = "aaa";
    // 静态变量
    public static String a2 = "bbb";

    public static void main(String[] args) {
        int a = 100;
        System.out.println(a);
        func(a);
        List<String> list1 = new ArrayList<>();
        System.out.println(a);
        String a1 = null;
        String a2 = "111";
    }

    public static void func(int a){
        a=0;
    }

    public void test(){

    }
}
