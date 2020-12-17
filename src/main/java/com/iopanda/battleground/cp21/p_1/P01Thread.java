package com.iopanda.battleground.cp21.p_1;

import java.sql.SQLOutput;

public class P01Thread implements Runnable{
    protected int tid = 0;
    public P01Thread(int tid){
        this.tid = tid;
        System.out.println("Thread "+ tid + " is starting..");
    }
    public void run() {
        for(int i=0; i<3; i++){
            System.out.println("tid: " + tid + ", msg:"+i);
            Thread.yield();
        }
        System.out.println("Thread " + tid + " completed;");
    }
}
