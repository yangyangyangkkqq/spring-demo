package com.example.springdemo.interview.lang;

import com.example.springdemo.interview.common.Node;
import com.example.springdemo.interview.recursion.*;

import java.util.Arrays;

/**
 * 删除单链表
 */
public class LinkedListDeletor {
    public <T>  Node<T> deleteIfEquals(Node<T> head,T value){
        while (head!=null&&head.getValue()==value){
            head=head.getNext();
        }
        if(head==null){
            return head;
        }
        Node prev=head;
        while (prev.getNext()!=null){
            if (prev.getNext().getValue()==value){
                prev.setNext(prev.getNext().getNext());
            }else {
                prev=prev.getNext();
            }
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedListDeletor deletor=new LinkedListDeletor();
        LinkedListCreate create=new LinkedListCreate();
        Node node=create.createLinkedList(Arrays.asList(1,1,2,3,1,4,1));
        Node.printlnList(deletor.deleteIfEquals(node,1));
    }
}
