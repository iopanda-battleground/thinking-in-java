package com.iopanda.battleground.cp21.h06;

public class Fucker implements Runnable{
    private Object obj;
    public Fucker(Object obj){
        this.obj = obj;
    }

    @Override
    public void run() {
        while(!Thread.interrupted()){
            synchronized (obj){
                try{
                    obj.wait();
                    System.out.println(this + " Got " + obj);
                    obj.notify();
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
