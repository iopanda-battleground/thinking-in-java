package com.iopanda.battleground.cp21.h01;

public class StrongRef {
    public static void run(){
        Object obj = new Object();
        System.gc();
        System.out.println("Strong Referenced Object: " + obj);
    }
}
