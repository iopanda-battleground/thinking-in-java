package com.iopanda.battleground.cp21.t2_9;

import java.util.concurrent.TimeUnit;

public class InnerRunnable2 {
    private int countDown = 5;
    private Thread t;
    public InnerRunnable2(String name){
        t = new Thread(new Runnable() {
            @Override
            public void run(){
                try{
                    while(true){
                        System.out.println(this);
                        if(--countDown == 0){
                            return;
                        }
                        TimeUnit.MILLISECONDS.sleep(10);
                    }
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            @Override
            public String toString(){
                return Thread.currentThread() + "(" + countDown + "), ";
            }
        }, name);
        t.start();
    }
}
