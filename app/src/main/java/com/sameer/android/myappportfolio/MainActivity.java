package com.sameer.android.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void showToast(String message) {
        String textMsg = "This button will launch my " + message + " app!";
        Toast.makeText(MainActivity.this, textMsg, Toast.LENGTH_SHORT).show();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_spotify: showToast("Spotify Streamer");
                break;
            case R.id.button_scores: showToast("Scores");
                break;
            case R.id.button_library: showToast("Library");
                break;
            case R.id.button_build_it: showToast("Build It Bigger");
                break;
            case R.id.button_xyz_reader: showToast("XYZ Reader");
                break;
            case R.id.button_capstone: showToast("Capstone");
                break;
        }
    }
}
