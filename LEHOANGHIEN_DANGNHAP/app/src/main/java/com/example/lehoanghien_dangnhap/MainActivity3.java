package com.example.lehoanghien_dangnhap;

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

public class MainActivity3 extends AppCompatActivity {
    ListView lvNhac;
    ArrayList<Nhac> arrayNhac;
    NhacAdapter adapter;
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
        setContentView(R.layout.activity_main3);

        AnhXa();
        adapter = new NhacAdapter(this, R.layout.dong_nhac, arrayNhac);
        lvNhac.setAdapter(adapter);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        lvNhac.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity3.this,MainActivity4.class);
                    startActivity(intent);
                }
                if(position==1){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity3.this,MainActivity5.class);
                    startActivity(intent);
                }
                if(position==2){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity3.this,MainActivity6.class);
                    startActivity(intent);
                }
                if(position==3){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity3.this,MainActivity7.class);
                    startActivity(intent);
                }
                if(position==4){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity3.this,MainActivity8.class);
                    startActivity(intent);
                }
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_demo, menu);
        return super.onCreateOptionsMenu(menu);

    }


    private void AnhXa() {
        lvNhac = (ListView) findViewById(R.id.listviewnhac);
        arrayNhac = new ArrayList<>();

        arrayNhac.add(new Nhac("Mắt đen", "Bức Tường", R.drawable.nhac));
        arrayNhac.add(new Nhac("Mơ hồ", "Bùi Anh Tuấn", R.drawable.nhac));
        arrayNhac.add(new Nhac("Con cò", "Tùng Dương", R.drawable.nhac));
        arrayNhac.add(new Nhac("Dấu mưa", "Trung Quân", R.drawable.nhac));
        arrayNhac.add(new Nhac("Có khi", "Hoài Lâm", R.drawable.nhac));
    }
}