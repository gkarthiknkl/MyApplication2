package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("log", "changes 1 ");
        Log.d("log", "changes 2 ");
        Log.d("log", "changes 3 ");
        Log.d("log", "changes 4 master ");

    }
}
