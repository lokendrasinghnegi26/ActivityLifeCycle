package com.lokendrasingh.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreateFinished", Toast.LENGTH_SHORT).show();
        Log.i("main","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStartFinished", Toast.LENGTH_SHORT).show();
        Log.i("main","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResumeFinished", Toast.LENGTH_SHORT).show();
        Log.i("main","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPausedFinished", Toast.LENGTH_SHORT).show();
        Log.i("main","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStopFinished", Toast.LENGTH_SHORT).show();
        Log.i("main","onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestartFinished", Toast.LENGTH_SHORT).show();
        Log.i("main","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroyFinished", Toast.LENGTH_SHORT).show();
        Log.i("main","onDestroy");
    }
}