package com.dkhai.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle", "onCreate invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("dkhai", "onStart invoked");

        // Bundle extras = getIntent().getExtras();
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras == null) {
            Log.d("dkhai", "extras = null");
        } else {
            String qString = extras.getString("qString");
            Log.d("dkhai", qString);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("dkhai", "onResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("dkhai", "onPause invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("dkhai", "onStop invoked");

        Intent intent = getIntent();
        intent.removeExtra("triggerBRC");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("dkhai", "onRestart invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("dkhai", "onDestroy invoked");
    }
    
}