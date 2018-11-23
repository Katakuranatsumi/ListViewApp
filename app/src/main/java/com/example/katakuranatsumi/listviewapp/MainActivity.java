package com.example.katakuranatsumi.listviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = (ListView) findViewById(R.id.myListView);

//        データを準備
        ArrayList<String> items = new ArrayList<>();
        for (int i = 0; i < 30; i++){
            items.add("item-" + i);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
             this,
             R.layout.list_view,
             items
        );

//        ListViewに表示
        myListView.setEmptyView(findViewById(R.id.emptyView));
        myListView.setAdapter(adapter);
    }
}