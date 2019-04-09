package com.rbmhz.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rbmhz.mylibrary.LogDeb;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogDeb.d("nepal");
        LogDeb.ToastLong(this,"HI");
    }
}
