package com.iuea.lifecycledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("logname","oncreate ");
        Toast.makeText(this,"on create activity",Toast.LENGTH_LONG).show();

    }
    protected void onStart() {
        super.onStart();
        Log.d("logname","onStart ");
        Toast.makeText(this,"on start activity",Toast.LENGTH_LONG).show();
    }
    protected void onResume() {
        super.onResume();
        Log.d("logname", "onResume ");
        Toast.makeText(this, "on Resume activity", Toast.LENGTH_LONG).show();
    }
    protected void onPause() {
        super.onPause();
        Log.d("logname", "onpause ");
        Toast.makeText(this, "on Pause activity", Toast.LENGTH_LONG).show();
    }
    protected void onStop() {
        super.onStop();
        Log.d("logname", "onstop ");
        Toast.makeText(this, "on stop activity", Toast.LENGTH_LONG).show();
    }
    protected void onDestroy() {
        super.onDestroy();
        Log.d("logname", "ondestroy ");
        Toast.makeText(this, "on destroy activity", Toast.LENGTH_LONG).show();
    }
    protected void onRestart() {
        super.onRestart();
        Log.d("logname", "onRestart ");
        Toast.makeText(this, "on Restart activity", Toast.LENGTH_LONG).show();
    }
}