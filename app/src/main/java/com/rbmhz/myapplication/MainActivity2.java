package com.rbmhz.myapplication;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.rbmhz.mylibrary.DialogAnimation;
import com.rbmhz.mylibrary.Duration;
import com.rbmhz.mylibrary.Loading;
import com.rbmhz.mylibrary.LogDeb;
import com.rbmhz.mylibrary.SnackBar;
import com.rbmhz.mylibrary.Toasty;
import com.rbmhz.mylibrary.Type;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogDeb.d(this,"nepal");
        Toasty.ToastShort(this,"hello");

        SnackBar.show(this,"LENGTH_LONG", Duration.LENGTH_LONG);
        SnackBar.show(this,"LENGTH_SHORT", Duration.LENGTH_SHORT);
        SnackBar.show(this,"LENGTH_INDEFINITE", Duration.LENGTH_INDEFINITE);

//        Drawable myDrawable = getResources().getDrawable(R.drawable.download);
//        DialogAnimation.successDialog(this,true,"#3d3123","OKS", "ASDf");
//        DialogAnimation.successDialog(this,true,"#3d3123","OKS", "ASDf",R.drawable.download);
//        DialogAnimation.successDialog(this,true,"#3d3123","OKS", "successDialogLottie","rocket-loading.json",false);
//        DialogAnimation.errorDialog(this,true,"#3d3123","OKS", "errorDialogLottie");

//        Loading.show(this,false,"Asdfasdf", Type.HORIZONTAL);

//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Loading.hide();
//            }
//        },2000);

    }
}
