package com.iopanda.battleground.cp21.h01;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class VirtualRef {
    public static void run(){
        Object obj = new Object();
        ReferenceQueue rq = new ReferenceQueue();
        PhantomReference pr = new PhantomReference(obj, rq);
        obj = null;
        System.out.println("Virtual Referenced Object before GC: " + pr.get());
        System.gc();
        System.out.println("Virtual Referenced Object after GC: " + pr.get());
    }
}
