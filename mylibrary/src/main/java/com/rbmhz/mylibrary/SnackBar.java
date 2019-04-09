package com.rbmhz.mylibrary;

import android.app.Activity;
import android.support.design.widget.Snackbar;
import android.view.View;

public class SnackBar {

    public static void show(String msg,  Activity c) {

        View view = c.findViewById(android.R.id.content);
        Snackbar snackbar = Snackbar
                .make(view, msg, Snackbar.LENGTH_SHORT);
//                .setAction("UNDO", new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Snackbar snackbar1 = Snackbar.make(coordinatorLayout,
//                                "Message is restored!", Snackbar.LENGTH_SHORT);
//                        snackbar1.show();
//                    }
//                });

        snackbar.show();

    }

}
