package com.iopanda.battleground.cp21.t2_2;

import com.iopanda.battleground.cp21.t2_1.LiftOff;

public class MoreBasicThreads {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            new Thread(new LiftOff()).start();
        }
        System.out.println("Waiting for LiftOff");
    }
}
