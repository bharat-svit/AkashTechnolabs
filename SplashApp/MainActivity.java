package com.example.splashapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // supportActionBar.hide();
        setContentView(R.layout.activity_main);
        Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(9000);
                }catch(Exception e ){
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent(MainActivity.this , second.class);
                            startActivity(intent);
                }
            }
        };
        thread.start();
    }
}