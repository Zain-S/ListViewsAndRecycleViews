package com.example.listviewsandrecycleviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView1;
    String arr[] = {"raffay", "zain", "zubair", "zubair", "zubair", "zubair", "zubair", "zubair", "zubair", "zubair", "zubair", "zubair", "zubair", "zubair", "zubair", "zubair", "zubair"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView1 = findViewById(R.id.listView1);
//        Using built in array adapter
//        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arr);
//        listView1.setAdapter(ad);

//      Using myAdapter
      MyAddapter ad = new MyAddapter(this, R.layout.my_layout, arr);
      listView1.setAdapter(ad);

      //Listner for myaddapter is in adapter file:


//        Listener for builtin adapter;
//        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, "You clicked on: " + position, Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}