package com.iopanda.battleground.cp21.h06;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NotifyAndWait {

    public static void main(String[] args) throws InterruptedException {
        Object obj = new Object();
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new Fucker(obj));
        exec.execute(new Fucker(obj));
    }
}
