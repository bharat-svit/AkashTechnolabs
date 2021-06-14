package com.example.welcomescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {
TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        //Intent intent = getIntent();
        textView2 = (TextView)findViewById(R.id.textView2);
        Intent intent = getIntent();
        String name = intent.getStringExtra( "NAME");
        textView2.setText("Welcome" +" " + name );
    }
}