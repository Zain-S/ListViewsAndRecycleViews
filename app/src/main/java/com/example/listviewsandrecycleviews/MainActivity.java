package com.example.listviewsandrecycleviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView1;
    String arr[] = {"raffay", "zain", "zubair", "zubair", "zubair", "zubair", "zubair", "zubair", "zubair", "zubair", "zubair", "zubair", "zubair", "zubair", "zubair", "zubair", "zubair"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView1 = findViewById(R.id.listView1);
        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arr);
        listView1.setAdapter(ad);

        
    }
}