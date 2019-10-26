package com.example.springdemo.interview.lang;

import com.example.springdemo.interview.common.Node;

/**
 * 循环反转列表
 */
public class LinkedListReverser {
    /**
     * 反转链表
     * @return
     */
    public Node reverserLinkedList(Node head){
        Node newHead=null;
        Node curHead=head;
        while (curHead!=null){
            Node next=curHead.getNext();
            curHead.setNext(newHead);
            newHead=curHead;
            curHead=next;
        }
        return newHead;
    }

    public static void main(String[] args) {
        LinkedListReverser reverser=new LinkedListReverser();
        Node.printlnList(reverser.reverserLinkedList(new LinkedListCreator().creatorLinkedList(10)));
    }
}
