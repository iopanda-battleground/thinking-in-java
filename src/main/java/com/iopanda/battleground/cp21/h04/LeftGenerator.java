package com.iopanda.battleground.cp21.h04;

public class LeftGenerator implements Runnable {
    private int i;
    public LeftGenerator(int i){
        this.i = i;
    }
    @Override
    public void run() {
        new Thread(new LeftGenerator(i/2)).start();
        new Thread(new RightGenerator(i/2)).start();
    }
}
