package com.iopanda.battleground.cp21.h02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i=0; i<100; i++){
            exec.execute(new MyThread());
        }
    }
}
