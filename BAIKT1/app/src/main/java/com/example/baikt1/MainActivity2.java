package com.example.baikt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ListView lvCongan;
    ArrayList<congan> arrayCongan;
    conganadapter adapter;
    MenuItem menuItem;


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return true;

            default:break;
        }

        //       if(item.getItemId() == R.id.menu)
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        AnhXa();
        adapter = new conganadapter(this, R.layout.dong_congan, arrayCongan);
        lvCongan.setAdapter(adapter);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    
    private void AnhXa() {
        lvCongan = (ListView) findViewById(R.id.listviewcongan);
        arrayCongan = new ArrayList<>();

        arrayCongan.add(new congan("LÊ VĂN A", "SĨ QUAN - HÀ GIANG - 3 SAO", R.drawable.ca1));
        arrayCongan.add(new congan("LÊ VĂN B", "HẠ SĨ QUAN - ĐÀ NẴNG - 3 SAO", R.drawable.ca2));
        arrayCongan.add(new congan("NGUYỄN VĂN A", "HẠ SĨ QUAN - QUẢNG TRỊ - 3 SAO", R.drawable.ca3));
        arrayCongan.add(new congan("NGUYỄN VĂN B", "SĨ QUAN - QUẢNG NAM - 3 SAO", R.drawable.ca4));
        arrayCongan.add(new congan("NGUYỄN VĂN C", "SĨ QUAN - QUẢNG NGÃI - 3 SAO", R.drawable.ca5));
    }
}