package com.example.springdemo.interview.lang;

import com.example.springdemo.interview.common.Node;

/**
 * 循环创建链表
 */
public class LinkedListCreator {
    /**
     * 创建链表
     * @return
     */
    public Node creatorLinkedList(int size){
        Node prev=null;
        Node head=null;
        for (int i=1;i<=size;i++){
            Node node=new Node(i);
            if(prev!=null){
                prev.setNext(node);
            }else{
                head=node;
            }
            prev=node;
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedListCreator creator=new LinkedListCreator();
        Node.printlnList(creator.creatorLinkedList(10));
    }
}
