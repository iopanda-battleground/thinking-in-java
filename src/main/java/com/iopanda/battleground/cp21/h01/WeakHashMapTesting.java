package com.iopanda.battleground.cp21.h01;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapTesting {
    public static void run(){
        Map map = new WeakHashMap();
        for (int i=0; i<10000; i++){
            map.put("k"+i, new byte[i]);
        }
    }
}
