package com.iopanda.battleground.cp21.t2_8;

public class Daemon implements Runnable{
    private Thread[] t = new Thread[10];
    @Override
    public void run(){
        for(int i=0; i<t.length; i++){
            t[i] = new Thread(new DaemonSpawn());
            t[i].start();
            System.out.println("DaemonSpawn " + i + " started, ");
        }
        for(int i=0; i<t.length; i++){
            System.out.println("t["+i+"].isDaemon() = " + t[i].isDaemon() + ", ");
        }
        Thread.yield();
    }
}
