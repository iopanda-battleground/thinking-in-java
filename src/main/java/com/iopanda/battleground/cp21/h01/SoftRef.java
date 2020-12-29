package com.iopanda.battleground.cp21.h01;

import java.lang.ref.SoftReference;

public class SoftRef {
    public static void run(){
        Object obj = new Object();
        SoftReference sr = new SoftReference(obj);
        obj = null;
        System.gc();
        System.out.println("Soft Referenced Object: " + sr.get());
    }
}
