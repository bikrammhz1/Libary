package com.rbmhz.mylibrary;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class Loading {
    public static Dialog loading;

    public static void show(Context c) {
        loading = new Dialog(c);
        try {
            loading = new Dialog(c);
            loading.requestWindowFeature(Window.FEATURE_NO_TITLE);
            loading.setCancelable(false);
            loading.setContentView(R.layout.dialog_loading_message);
            loading.show();

        } catch (Exception e) {
            Log.d("Error==>", e.toString());
        }
    }

    public static void show(Context c, boolean setCancel) {
        loading = new Dialog(c);
        try {
            loading = new Dialog(c);
            loading.requestWindowFeature(Window.FEATURE_NO_TITLE);
            loading.setCancelable(setCancel);
            loading.setContentView(R.layout.dialog_loading_message);
            loading.show();

        } catch (Exception e) {
            Log.d("Error==>", e.toString());
        }
    }


    public static void show(Context c, boolean setCancel, String text, Type type) {
        loading = new Dialog(c);
        try {
            loading = new Dialog(c);
            loading.requestWindowFeature(Window.FEATURE_NO_TITLE);
            loading.setCancelable(setCancel);
            loading.setContentView(R.layout.dialog_loading_message);

            TextView show = loading.findViewById(R.id.tv_text);
            LottieAnimationView lottieAnimationView = loading.findViewById(R.id.animation_view);

            show.setText(text);

            if (type.equals(Type.HORIZONTAL)) {
                LogDeb.d(c,"horiz");

                ProgressBar progressBarHor = loading.findViewById(R.id.pb_hor);
                progressBarHor.setVisibility(View.VISIBLE);

            } else  if (type.equals(Type.SPINNER)){
                LogDeb.d(c,"spi");

                ProgressBar progressBar = loading.findViewById(R.id.pb);
                progressBar.setVisibility(View.VISIBLE);

            }

            lottieAnimationView.setVisibility(View.GONE);


            loading.show();

        } catch (Exception e) {
            Log.d("Error==>", e.toString());
        }
    }

    public static void show(Context c, boolean setCancel, String text) {
        loading = new Dialog(c);
        try {
            loading = new Dialog(c);
            loading.requestWindowFeature(Window.FEATURE_NO_TITLE);
            loading.setCancelable(setCancel);
            loading.setContentView(R.layout.dialog_loading_message);

            TextView show = loading.findViewById(R.id.tv_text);
            show.setText(text);

            loading.show();

        } catch (Exception e) {
            Log.d("Error==>", e.toString());
        }
    }


    public static void show(Context c, boolean setCancel, String text, int imageResoutce) {
        loading = new Dialog(c);
        try {
            loading = new Dialog(c);
            loading.requestWindowFeature(Window.FEATURE_NO_TITLE);
            loading.setCancelable(setCancel);
            loading.setContentView(R.layout.dialog_loading_message);

            TextView show = loading.findViewById(R.id.tv_text);
            ImageView imageView = loading.findViewById(R.id.iv_loading);
            LottieAnimationView lottieAnimationView = loading.findViewById(R.id.animation_view);
            imageView.setVisibility(View.VISIBLE);
            lottieAnimationView.setVisibility(View.GONE);
            imageView.setImageResource(imageResoutce);
            show.setText(text);

            loading.show();

        } catch (Exception e) {
            Log.d("Error==>", e.toString());
        }
    }

    public static void show(Context c, boolean setCancel, String text, Drawable imageResoutce) {
        loading = new Dialog(c);
        try {
            loading = new Dialog(c);
            loading.requestWindowFeature(Window.FEATURE_NO_TITLE);
            loading.setCancelable(setCancel);
            loading.setContentView(R.layout.dialog_loading_message);


            TextView show = loading.findViewById(R.id.tv_text);
            LottieAnimationView lottieAnimationView = loading.findViewById(R.id.animation_view);
            ImageView imageView = loading.findViewById(R.id.iv_loading);
            imageView.setVisibility(View.VISIBLE);
            lottieAnimationView.setVisibility(View.GONE);
            imageView.setImageDrawable(imageResoutce);
            show.setText(text);

            loading.show();

        } catch (Exception e) {
            Log.d("Error==>", e.toString());
        }
    }

    public static void show(Context c, boolean setCancel, String text, String lottieAssetName, boolean loopAnim) {
        loading = new Dialog(c);
        try {
            loading = new Dialog(c);
            loading.requestWindowFeature(Window.FEATURE_NO_TITLE);
            loading.setCancelable(setCancel);
            loading.setContentView(R.layout.dialog_loading_message);

            TextView show = loading.findViewById(R.id.tv_text);
            LottieAnimationView lottieAnimationView = loading.findViewById(R.id.animation_view);

            lottieAnimationView.setAnimation(lottieAssetName);
            lottieAnimationView.loop(loopAnim);
            show.setText(text);

            loading.show();

        } catch (Exception e) {
            Log.d("Error==>", e.toString());
        }
    }


    public static void hide() {
        if (loading != null && loading.isShowing()) {
            loading.dismiss();
        }
    }

}
