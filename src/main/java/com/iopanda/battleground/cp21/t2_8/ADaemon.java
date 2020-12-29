package com.iopanda.battleground.cp21.t2_8;

import java.util.concurrent.TimeUnit;

public class ADaemon implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println("Starting ADaemon");
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println(e);
            e.printStackTrace();
        } finally {
            System.out.println("This should always run?");
        }

    }
}
