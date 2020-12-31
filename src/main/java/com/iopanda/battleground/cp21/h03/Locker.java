package com.iopanda.battleground.cp21.h03;

public class Locker implements Runnable{
    @Override
    public void run() {
        try {
            synchronized (Main.lock1) {
                Main.lock1.wait();
                System.out.println("lock1 proceed");
                Main.lock2.notify();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
