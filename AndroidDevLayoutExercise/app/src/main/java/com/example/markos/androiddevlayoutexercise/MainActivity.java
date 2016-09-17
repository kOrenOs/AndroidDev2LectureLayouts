package com.example.markos.androiddevlayoutexercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = (ListView) findViewById(R.id.listView);

        final String[] phones = new String[]{"Android", "iPhone", "WindowsMobile", "Blackberry", "WebOS", "Ubuntu",
                "Android", "iPhone", "WindowsMobile", "Blackberry", "WebOS", "Ubuntu",
                "Android", "iPhone", "WindowsMobile", "Blackberry", "WebOS", "Ubuntu"};

        final ArrayList<String> arrayPhones = new ArrayList<>();
        for(String phone : phones){
            arrayPhones.add(phone);
        }

        PhoneArrayAdapter arrayAdapter = new PhoneArrayAdapter(this, arrayPhones);

        lv.setAdapter(arrayAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String phone = arrayPhones.get(position);
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("phone", phone);
                startActivity(intent);
            }
        });
    }
}
