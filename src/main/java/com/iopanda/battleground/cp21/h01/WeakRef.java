package com.iopanda.battleground.cp21.h01;

import java.lang.ref.WeakReference;

public class WeakRef {
    public static void run(){
        Object obj = new Object();
        WeakReference wr = new WeakReference(obj);
        obj = null;
        System.gc();
        System.out.println("Weak Referenced Object: " + wr.get());
    }
}
