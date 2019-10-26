package com.example.springdemo.interview.recursion;

import com.example.springdemo.interview.common.Node;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 链表反转
 */
public class LinkedListReverser {

    /**
     * 反转链表
     * @param head
     * @return
     */
    public Node reverserLinkedList(Node head){
        if (head==null||head.getNext()==null){
            return head;
        }
        Node newHead=reverserLinkedList(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return newHead;
    }

    public static void main(String[] args) {
        LinkedListReverser reverser=new LinkedListReverser();
        LinkedListCreate creator=new LinkedListCreate();
        Node.printlnList(reverser.reverserLinkedList(creator.createLinkedList(new ArrayList<>())));
        Node.printlnList(reverser.reverserLinkedList(creator.createLinkedList(Arrays.asList(1))));
        Node.printlnList(reverser.reverserLinkedList(creator.createLinkedList(Arrays.asList(1,2,3,4,5))));
    }
}
