package com.example.tae.activitylifecycle;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("LifeCycle", "OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("lifeCycle","OnStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("lifeCycle","OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LifeCycle","OnDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LifeCycle","OnPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LifeCycle","OnResume");
    }
}
