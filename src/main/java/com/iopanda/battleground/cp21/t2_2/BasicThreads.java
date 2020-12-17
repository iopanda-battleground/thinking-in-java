package com.iopanda.battleground.cp21.t2_2;

import com.iopanda.battleground.cp21.t2_1.LiftOff;

public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for Liftoff!");
    }
}
