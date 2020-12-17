package com.iopanda.battleground.cp21.t2_3;

import com.iopanda.battleground.cp21.t2_1.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
    public static void main(String[] args) {

        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i=0; i<5; i++){
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
