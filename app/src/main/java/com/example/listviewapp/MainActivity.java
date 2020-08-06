package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.zip.DataFormatException;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView ;
    String[] number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
        number = new String[]{"1" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this , android.R.layout.simple_list_item_1 , number);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String numbers = number[i];
        Toast.makeText(this, "Clicked" + numbers, Toast.LENGTH_SHORT).show();
    }
}