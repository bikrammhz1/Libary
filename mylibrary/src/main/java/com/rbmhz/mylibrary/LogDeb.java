package com.rbmhz.mylibrary;

import android.content.Context;
import android.util.Log;

public class LogDeb {

    public static void d(Context c,String msg){
        Log.d(String.valueOf(c),msg);
    }
    public static void d(String c,String msg){
        Log.d(c,msg);
    }
}
