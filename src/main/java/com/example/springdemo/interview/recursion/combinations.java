package com.example.springdemo.interview.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 列出所有组合
 */
public class combinations {
    public static void combinations(List<Integer> selected, List<Integer> data, int n){
        if (n==0){
            for (Integer integer : selected) {
                System.out.print(integer);
                System.out.print(" ");
            }
            System.out.println();
            return;
        }
        if (data.isEmpty()){
            return;
        }
        //select elment 0
        selected.add(data.get(0));
        combinations(selected,data.subList(1,data.size()),n-1);
        //un-select elment 0
        selected.remove(selected.size()-1);
        combinations(selected,data.subList(1,data.size()),n);
    }
    public static void main(String[] args) {
        combinations(new ArrayList<>(),Arrays.asList(1,2,3),2);
    }
}
