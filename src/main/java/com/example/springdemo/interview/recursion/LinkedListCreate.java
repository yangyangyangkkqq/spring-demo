package com.example.springdemo.interview.recursion;

import com.example.springdemo.interview.common.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 链表创建
 */
public class LinkedListCreate {

    /**
     * 递归创建单链表
     * @param data
     * @return
     */
    public Node createLinkedList(List<Integer> data){
        if (data.isEmpty()){
            return null;
        }
        Node fristNode=new Node(data.get(0));
        Node headofSubList=createLinkedList(data.subList(1,data.size()));
        fristNode.setNext(headofSubList);
        return fristNode;
    }
    public static void main(String[] args) {
        LinkedListCreate creator=new LinkedListCreate();
        Node.printlnList(creator.createLinkedList(new ArrayList<>()));
        Node.printlnList(creator.createLinkedList(Arrays.asList(1)));
        Node.printlnList(creator.createLinkedList(Arrays.asList(1,2,3)));
    }
}
