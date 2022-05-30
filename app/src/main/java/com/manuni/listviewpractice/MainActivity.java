package com.manuni.listviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
     int[] birianiPic = {R.drawable.biriani1,R.drawable.biriani2,R.drawable.biriani3,R.drawable.biriani5,
    R.drawable.biriani6,R.drawable.biriani7,R.drawable.biriani8,R.drawable.biriani9,R.drawable.biriani10};
     String[] birianiNames;
     String[] subNames;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        birianiNames = getResources().getStringArray(R.array.biriani_names);
        subNames =  getResources().getStringArray(R.array.biriani_sub_name);

        listView = findViewById(R.id.listView);
        CustomAdapter adapter = new CustomAdapter(MainActivity.this,birianiNames,subNames,birianiPic);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String message = birianiNames[i];
                Toast.makeText(MainActivity.this, "You have clicked "+message, Toast.LENGTH_SHORT).show();
            }
        });

    }
}