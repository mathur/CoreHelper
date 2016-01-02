package com.rmathur.corehelper;

import android.content.Context;
import android.os.Vibrator;
import android.util.Log;
import android.widget.Toast;

public class Helper {

    public static void toastShortAndLog(Context context, String message) {
        // toast short
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.show();

        // log
        Log.e("Helper", message);
    }

    public static void toastLongAndLog(Context context, String message) {
        // toast long
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_LONG);
        toast.show();

        // log
        Log.e("Helper", message);
    }

    public static void vibrate(Context context) {
        Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(500);
    }
}