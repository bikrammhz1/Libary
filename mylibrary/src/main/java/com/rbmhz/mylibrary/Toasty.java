package com.rbmhz.mylibrary;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class Toasty {

    public static void ToastShort(Context context,String msg){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();
    }

    public static void ToastLong(Context context,String msg){
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
    }
}
