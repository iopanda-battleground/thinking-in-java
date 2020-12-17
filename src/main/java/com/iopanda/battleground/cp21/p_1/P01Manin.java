package com.iopanda.battleground.cp21.p_1;

public class P01Manin {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            new Thread(new P01Thread(i)).start();
        }
    }
}
