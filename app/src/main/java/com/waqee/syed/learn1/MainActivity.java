package com.waqee.syed.learn1;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Syed","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Syed","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Syed", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Syed", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Syed", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Syed", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Syed", "onDestroy");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE){
            Log.d("Syed", "Orientation Changed to Landscape");
        }
        else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            Log.d("Syed", "Orientation Changed to Portrait");
        }
    }
}
