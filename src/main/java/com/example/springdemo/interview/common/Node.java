package com.example.springdemo.interview.common;

/**
 * 单链表定义
 */
public class Node<T> {
    private final T value;
    private Node<T> next;

    public Node(T value) {
        this.value = value;
        this.next=null;
    }

    public T getValue() {
        return value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public static <T>void printlnList(Node<T> head){
        while (head!=null){
            System.out.print(head.getValue());
            System.out.print(" ");
            head=head.getNext();
        }
        System.out.println();
    }
}
