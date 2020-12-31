package com.iopanda.battleground.cp21.h02;

public class MyThread implements Runnable {
    @Override
    public void run() {
        //SharedValue.setValue(SharedValue.getValue() + 1);
        SharedValue.addon();
    }
}
