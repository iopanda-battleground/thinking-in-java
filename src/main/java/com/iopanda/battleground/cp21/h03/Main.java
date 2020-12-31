package com.iopanda.battleground.cp21.h03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i=0; i<10; i++){
            exec.execute(new Locker());
            exec.execute(new Maker());
        }
    }
}
