package com.example.eric.selfdefinedadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = ((ListView) findViewById(R.id.lv));

        List<String> strings = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            strings.add(""+i);
        }
        MyAdapter myAdapter = new MyAdapter(strings,R.layout.item,getApplicationContext());
        listView.setAdapter(myAdapter);
    }
}
