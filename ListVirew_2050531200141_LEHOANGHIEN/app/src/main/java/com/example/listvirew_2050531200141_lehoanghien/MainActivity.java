package com.example.listvirew_2050531200141_lehoanghien;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int items = 0;
        ArrayAdapter<String> myArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
//        // Gắn myArrayAdapter vào cho ListView có sẵn
        setListAdapter(myArrayAdapter);
    }

    private void setListAdapter(ArrayAdapter<String> myArrayAdapter) {
    }
}