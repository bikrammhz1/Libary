package com.rbmhz.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.rbmhz.mylibrary.LogDeb;
import com.rbmhz.mylibrary.SnackBar;
import com.rbmhz.mylibrary.Toasty;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogDeb.d(this,"nepal");
        Toasty.ToastLong(this,"hello");
        SnackBar.show("ASDfasdf",this);
    }
}
