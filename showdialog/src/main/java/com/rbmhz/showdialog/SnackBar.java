package com.rbmhz.showdialog;

import android.app.Activity;
import android.support.design.widget.Snackbar;
import android.view.View;

public class SnackBar {

    public static void show(Activity c, String msg, Duration anDuration) {

        View view = c.findViewById(android.R.id.content);
        final Snackbar snackbar;

        if (anDuration.equals(Duration.LENGTH_SHORT)) {
            snackbar = Snackbar.make(view, msg, Snackbar.LENGTH_SHORT);

        } else if (anDuration.equals(Duration.LENGTH_LONG)) {
            snackbar = Snackbar.make(view, msg, Snackbar.LENGTH_LONG);

        } else {
            snackbar = Snackbar.make(view, msg, Snackbar.LENGTH_INDEFINITE);
            snackbar.setAction("Dismiss", new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    snackbar.dismiss();
                }
            });
        }

        snackbar.show();

    }

}
