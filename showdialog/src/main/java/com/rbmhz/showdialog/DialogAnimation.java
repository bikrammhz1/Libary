package com.rbmhz.showdialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class DialogAnimation {

    public static void successDialog(Context c,  String  msg) {
        try {
            final Dialog dialog = new Dialog(c);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setCancelable(false);
            dialog.setContentView(R.layout.dialog_success_message);
            TextView text = dialog.findViewById(R.id.text_dialog);
            Button dialogButton = dialog.findViewById(R.id.btn_dialog);
            text.setText(msg);

            dialogButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();

                }
            });

            dialog.show();
        } catch (Exception e) {
            Log.d("Error==>", e.toString());
        }

    }

    public static void successDialog(Context c, String themeColor,  String  msg) {
        try {
            final Dialog dialog = new Dialog(c);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setCancelable(false);
            dialog.setContentView(R.layout.dialog_success_message);
            LinearLayout lnTitle = dialog.findViewById(R.id.ln_title);
            TextView text = dialog.findViewById(R.id.text_dialog);
            Button dialogButton = dialog.findViewById(R.id.btn_dialog);

            lnTitle.setBackgroundColor(Color.parseColor(themeColor));
            dialogButton.setBackgroundColor(Color.parseColor(themeColor));

            text.setText(msg);


            dialogButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();

                }
            });

            dialog.show();
        } catch (Exception e) {
            Log.d("Error==>", e.toString());
        }

    }

    public static void successDialog(Context c, String themeColor, String btnText, String  msg) {
        try {
            final Dialog dialog = new Dialog(c);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setCancelable(false);
            dialog.setContentView(R.layout.dialog_success_message);
            LinearLayout lnTitle = dialog.findViewById(R.id.ln_title);
            TextView text = dialog.findViewById(R.id.text_dialog);
            Button dialogButton = dialog.findViewById(R.id.btn_dialog);

            lnTitle.setBackgroundColor(Color.parseColor(themeColor));
            dialogButton.setBackgroundColor(Color.parseColor(themeColor));
            dialogButton.setText(btnText);

            text.setText(msg);


            dialogButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();

                }
            });

            dialog.show();
        } catch (Exception e) {
            Log.d("Error==>", e.toString());
        }

    }

    public static void successDialog(Context c,boolean dialogCancel, String themeColor, String btnText, String  msg) {
        try {
            final Dialog dialog = new Dialog(c);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setCancelable(dialogCancel);
            dialog.setContentView(R.layout.dialog_success_message);
            LinearLayout lnTitle = dialog.findViewById(R.id.ln_title);
            TextView text = dialog.findViewById(R.id.text_dialog);
            Button dialogButton = dialog.findViewById(R.id.btn_dialog);

            lnTitle.setBackgroundColor(Color.parseColor(themeColor));
            dialogButton.setBackgroundColor(Color.parseColor(themeColor));
            dialogButton.setText(btnText);

            text.setText(msg);


            dialogButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();

                }
            });

            dialog.show();
        } catch (Exception e) {
            Log.d("Error==>", e.toString());
        }

    }

    public static void successDialog(Context c,boolean dialogCancel, String themeColor, String btnText, String msg,Drawable drawable) {
        try {
            final Dialog dialog = new Dialog(c);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setCancelable(dialogCancel);
            dialog.setContentView(R.layout.dialog_success_message);
            LinearLayout lnTitle = dialog.findViewById(R.id.ln_title);
            TextView text = dialog.findViewById(R.id.text_dialog);
            Button dialogButton = dialog.findViewById(R.id.btn_dialog);
            ImageView ivTitleImage = dialog.findViewById(R.id.iv_title_image);
            LottieAnimationView lottieAnimationView = dialog.findViewById(R.id.animation_view);
            lottieAnimationView.setVisibility(View.GONE);

            ivTitleImage.setVisibility(View.VISIBLE);
            ivTitleImage.setImageDrawable(drawable);
            lnTitle.setBackgroundColor(Color.parseColor(themeColor));
            dialogButton.setBackgroundColor(Color.parseColor(themeColor));
            dialogButton.setText(btnText);
            text.setText(msg);

            dialogButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                }
            });

            dialog.show();
        } catch (Exception e) {
            Log.d("Error==>", e.toString());
        }

    }

    public static void successDialog(Context c,boolean dialogCancel, String themeColor, String btnText, String msg,int imageResoutce) {
        try {
            final Dialog dialog = new Dialog(c);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setCancelable(dialogCancel);
            dialog.setContentView(R.layout.dialog_success_message);
            LinearLayout lnTitle = dialog.findViewById(R.id.ln_title);
            TextView text = dialog.findViewById(R.id.text_dialog);
            Button dialogButton = dialog.findViewById(R.id.btn_dialog);
            ImageView ivTitleImage = dialog.findViewById(R.id.iv_title_image);
            LottieAnimationView lottieAnimationView = dialog.findViewById(R.id.animation_view);
            lottieAnimationView.setVisibility(View.GONE);


            ivTitleImage.setVisibility(View.VISIBLE);
            ivTitleImage.setImageResource(imageResoutce);

            lnTitle.setBackgroundColor(Color.parseColor(themeColor));
            dialogButton.setBackgroundColor(Color.parseColor(themeColor));
            dialogButton.setText(btnText);

            text.setText(msg);

            dialogButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();

                }
            });

            dialog.show();

        } catch (Exception e) {
            Log.d("Error==>", e.toString());
        }

    }

    public static void successDialog(Context c,boolean dialogCancel, String themeColor, String btnText, String msg,String lottieAssetName,boolean loopAnim) {
        try {
            final Dialog dialog = new Dialog(c);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setCancelable(dialogCancel);
            dialog.setContentView(R.layout.dialog_success_message);
            LinearLayout lnTitle = dialog.findViewById(R.id.ln_title);
            TextView text = dialog.findViewById(R.id.text_dialog);
            Button dialogButton = dialog.findViewById(R.id.btn_dialog);

            LottieAnimationView lottieAnimationView = dialog.findViewById(R.id.animation_view);
            lottieAnimationView.setAnimation(lottieAssetName);
            lottieAnimationView.loop(loopAnim);

            lnTitle.setBackgroundColor(Color.parseColor(themeColor));
            dialogButton.setBackgroundColor(Color.parseColor(themeColor));
            dialogButton.setText(btnText);

            text.setText(msg);

            dialogButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                }
            });

            dialog.show();

        } catch (Exception e) {
            Log.d("Error==>", e.toString());
        }

    }

    public static void errorDialog(Context c,  String  msg) {
        try {
            final Dialog dialog = new Dialog(c);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setCancelable(false);
            dialog.setContentView(R.layout.dialog_fail_message);
            TextView text = dialog.findViewById(R.id.text_dialog);
            Button dialogButton = dialog.findViewById(R.id.btn_dialog);
            text.setText(msg);

            dialogButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();

                }
            });

            dialog.show();
        } catch (Exception e) {
            Log.d("Error==>", e.toString());
        }

    }

    public static void errorDialog(Context c, String themeColor,  String  msg) {
        try {
            final Dialog dialog = new Dialog(c);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setCancelable(false);
            dialog.setContentView(R.layout.dialog_fail_message);
            LinearLayout lnTitle = dialog.findViewById(R.id.ln_title);
            TextView text = dialog.findViewById(R.id.text_dialog);
            Button dialogButton = dialog.findViewById(R.id.btn_dialog);

            lnTitle.setBackgroundColor(Color.parseColor(themeColor));
            dialogButton.setBackgroundColor(Color.parseColor(themeColor));

            text.setText(msg);


            dialogButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();

                }
            });

            dialog.show();
        } catch (Exception e) {
            Log.d("Error==>", e.toString());
        }

    }

    public static void errorDialog(Context c, String themeColor, String btnText, String  msg) {
        try {
            final Dialog dialog = new Dialog(c);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setCancelable(false);
            dialog.setContentView(R.layout.dialog_fail_message);
            LinearLayout lnTitle = dialog.findViewById(R.id.ln_title);
            TextView text = dialog.findViewById(R.id.text_dialog);
            Button dialogButton = dialog.findViewById(R.id.btn_dialog);

            lnTitle.setBackgroundColor(Color.parseColor(themeColor));
            dialogButton.setBackgroundColor(Color.parseColor(themeColor));
            dialogButton.setText(btnText);

            text.setText(msg);


            dialogButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();

                }
            });

            dialog.show();
        } catch (Exception e) {
            Log.d("Error==>", e.toString());
        }

    }

    public static void errorDialog(Context c,boolean dialogCancel, String themeColor, String btnText, String  msg) {
        try {
            final Dialog dialog = new Dialog(c);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setCancelable(dialogCancel);
            dialog.setContentView(R.layout.dialog_fail_message);
            LinearLayout lnTitle = dialog.findViewById(R.id.ln_title);
            TextView text = dialog.findViewById(R.id.text_dialog);
            Button dialogButton = dialog.findViewById(R.id.btn_dialog);

            lnTitle.setBackgroundColor(Color.parseColor(themeColor));
            dialogButton.setBackgroundColor(Color.parseColor(themeColor));
            dialogButton.setText(btnText);

            text.setText(msg);


            dialogButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();

                }
            });

            dialog.show();
        } catch (Exception e) {
            Log.d("Error==>", e.toString());
        }

    }

    public static void errorDialog(Context c,boolean dialogCancel, String themeColor, String btnText, String msg,Drawable drawable) {
        try {
            final Dialog dialog = new Dialog(c);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setCancelable(dialogCancel);
            dialog.setContentView(R.layout.dialog_fail_message);
            LinearLayout lnTitle = dialog.findViewById(R.id.ln_title);
            TextView text = dialog.findViewById(R.id.text_dialog);
            Button dialogButton = dialog.findViewById(R.id.btn_dialog);
            ImageView ivTitleImage = dialog.findViewById(R.id.iv_title_image);
            LottieAnimationView lottieAnimationView = dialog.findViewById(R.id.animation_view);
            lottieAnimationView.setVisibility(View.GONE);

            ivTitleImage.setVisibility(View.VISIBLE);
            ivTitleImage.setImageDrawable(drawable);
            lnTitle.setBackgroundColor(Color.parseColor(themeColor));
            dialogButton.setBackgroundColor(Color.parseColor(themeColor));
            dialogButton.setText(btnText);
            text.setText(msg);

            dialogButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                }
            });

            dialog.show();
        } catch (Exception e) {
            Log.d("Error==>", e.toString());
        }

    }

    public static void errorDialog(Context c,boolean dialogCancel, String themeColor, String btnText, String msg,int imageResoutce) {
        try {
            final Dialog dialog = new Dialog(c);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setCancelable(dialogCancel);
            dialog.setContentView(R.layout.dialog_fail_message);
            LinearLayout lnTitle = dialog.findViewById(R.id.ln_title);
            TextView text = dialog.findViewById(R.id.text_dialog);
            Button dialogButton = dialog.findViewById(R.id.btn_dialog);
            ImageView ivTitleImage = dialog.findViewById(R.id.iv_title_image);
            LottieAnimationView lottieAnimationView = dialog.findViewById(R.id.animation_view);
            lottieAnimationView.setVisibility(View.GONE);


            ivTitleImage.setVisibility(View.VISIBLE);
            ivTitleImage.setImageResource(imageResoutce);

            lnTitle.setBackgroundColor(Color.parseColor(themeColor));
            dialogButton.setBackgroundColor(Color.parseColor(themeColor));
            dialogButton.setText(btnText);

            text.setText(msg);

            dialogButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();

                }
            });

            dialog.show();

        } catch (Exception e) {
            Log.d("Error==>", e.toString());
        }

    }

    public static void errorDialog(Context c,boolean dialogCancel, String themeColor, String btnText, String msg,String lottieAssetName,boolean loopAnim) {
        try {
            final Dialog dialog = new Dialog(c);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setCancelable(dialogCancel);
            dialog.setContentView(R.layout.dialog_fail_message);
            LinearLayout lnTitle = dialog.findViewById(R.id.ln_title);
            TextView text = dialog.findViewById(R.id.text_dialog);
            Button dialogButton = dialog.findViewById(R.id.btn_dialog);

            LottieAnimationView lottieAnimationView = dialog.findViewById(R.id.animation_view);
            lottieAnimationView.setAnimation(lottieAssetName);
            lottieAnimationView.loop(loopAnim);

            lnTitle.setBackgroundColor(Color.parseColor(themeColor));
            dialogButton.setBackgroundColor(Color.parseColor(themeColor));
            dialogButton.setText(btnText);

            text.setText(msg);

            dialogButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                }
            });

            dialog.show();

        } catch (Exception e) {
            Log.d("Error==>", e.toString());
        }

    }

}
