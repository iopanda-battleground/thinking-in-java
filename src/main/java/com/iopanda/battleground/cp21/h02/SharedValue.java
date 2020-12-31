package com.iopanda.battleground.cp21.h02;

public class SharedValue{
    private static volatile int val = 0;

    public static synchronized int getValue(){
        return val;
    }

    public static synchronized void setValue(int val){
        int before = SharedValue.val;
        SharedValue.val = val;
        System.out.println(Thread.currentThread() + " Before: "+ before + ", After: " + val);
    }

    public static synchronized void addon(){
        int before = SharedValue.val;
        SharedValue.val ++;
        System.out.println(Thread.currentThread() + " Before: "+ before + ", After: " + SharedValue.val);
    }
}
