package com.iopanda.battleground.cp21.t2_8;

public class DaemonSpawn implements Runnable{
    @Override
    public void run() {
        while(true){
            Thread.yield();
        }
    }
}
