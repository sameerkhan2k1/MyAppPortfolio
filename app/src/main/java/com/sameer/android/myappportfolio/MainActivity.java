package com.sameer.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
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
        String message = ((Button) view).getText().toString();
        showToast(message);
    }
}