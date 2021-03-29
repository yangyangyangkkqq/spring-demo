package com.example.springdemo.design.state;

/**
 * 状态模式demo
 */
public class StateDemo {
    public static void main(String[] args) {
        Content content = new Content();
        StartState startState = new StartState();
        startState.doAction(content);
        System.out.println(content.getState().toString());
        StopState stopState = new StopState();
        stopState.doAction(content);
        System.out.println(content.getState().toString());
    }
}
