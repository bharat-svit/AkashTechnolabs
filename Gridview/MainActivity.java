package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView listView;
String name[] = {"Laptop" , "mobile" ,"camera" , "Watch" , "TV's" , "PC's" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);
        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(MainActivity.this , android.R.layout.simple_list_item_1, name);
        listView.setAdapter(arrayAdapter);

         listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 Toast.makeText(MainActivity.this , "You select " + name[position] , Toast.LENGTH_SHORT).show();
             }
         });

    }
}