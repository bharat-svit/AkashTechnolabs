package com.example.implicitint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button button;
CheckBox checkBox , checkBox2 , checkBox3 , checkBox4 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);


        button =findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = "YOU SELECTED ";
                if (checkBox.isChecked()){
                    str += "\nETF's";
                }
                if (checkBox2.isChecked()){
                    str += "\nSIP's";
                }
                if (checkBox3.isChecked()){
                    str += "\nMUTUAL FUNDS";
                }
                if (checkBox4.isChecked()){
                    str += "\nSTOCKS";
                }

                Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
            }
        });
    }
}