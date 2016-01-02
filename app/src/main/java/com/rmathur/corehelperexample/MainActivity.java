package com.rmathur.corehelperexample;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.rmathur.corehelper.Helper;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences prefs;
    private SharedPreferences.Editor editor;
    private int openCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Helper.toastShortAndLog(this, "Shorter toast");
        Helper.toastLongAndLog(this, "Longer toast");
        Helper.vibrate(this);
        prefs = getPreferences(Context.MODE_PRIVATE);
        editor = prefs.edit();
        increment();
        if(openCount % 100 == 0) Helper.toastLongAndLog(this, "FuckRo");
    }


    private void increment() {
        openCount = prefs.getInt("counter", 0);
        openCount++;
        editor.putInt("counter", openCount);
        editor.commit();
    }
}