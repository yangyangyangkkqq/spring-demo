package com.example.springdemo.design.state;

public class StopState implements State {
    @Override
    public void doAction(Content content) {
        System.out.println("===in stop state===");
        content.setState(this);
    }

    @Override
    public String toString() {
        return "stop state";
    }
}
