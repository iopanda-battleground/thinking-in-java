package com.iopanda.battleground.cp21.h03;

public class Maker implements Runnable{
    @Override
    public void run() {
        try {
            synchronized (Main.lock2) {
                Main.lock2.wait();
                System.out.println("lock1 proceed");
                Main.lock1.notify();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
