package com.rmathur.corehelperexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rmathur.corehelper.Helper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Helper.toastShortAndLog(this, "Shorter toast");
        Helper.toastLongAndLog(this, "Longer toast");
        Helper.vibrate(this);
    }
}