package com.example.springdemo.design.state;

public class StartState implements State {
    @Override
    public void doAction(Content content) {
        System.out.println("===in start state===");
        content.setState(this);
    }

    @Override
    public String toString() {
        return "start state";
    }
}
