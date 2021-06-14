package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Listviewi2 extends AppCompatActivity {
    ListView listView;
    String name[] = {"Laptop" , "mobile" ,"camera" , "Watch" , "TV's" , "PC's" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listviewi2);

        listView = findViewById(R.id.listview);
        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(Listviewi2.this , android.R.layout.activity_list_item, name);
        listView.setAdapter(arrayAdapter);
    }
}