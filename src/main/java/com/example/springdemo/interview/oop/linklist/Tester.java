package com.example.springdemo.interview.oop.linklist;

public class Tester {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=LinkedList.newEmptyList();
        for (int i = 0; i < 100; i++) {
            linkedList.add(i);
        }
        for (Integer integer : linkedList) {
            System.out.println(integer);
        }
    }
}
