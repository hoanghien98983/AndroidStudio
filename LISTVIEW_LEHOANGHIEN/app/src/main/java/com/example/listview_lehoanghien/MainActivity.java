package com.example.listview_lehoanghien;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvTraiCay;
    ArrayList<Traicay> arrayTraiCay;
    TraicayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        adapter = new TraicayAdapter(this, R.layout.dong_traicay, arrayTraiCay);
        lvTraiCay.setAdapter(adapter);
    }

    private void AnhXa() {
        lvTraiCay = (ListView) findViewById(R.id.listviewtraicay);
        arrayTraiCay = new ArrayList<>();

        arrayTraiCay.add(new Traicay("Cam", "Cam Trung Quốc", R.drawable.cam));
        arrayTraiCay.add(new Traicay("Cherry", "Cherry Mỹ", R.drawable.cherry));
        arrayTraiCay.add(new Traicay("Dâu", "Dâu Canada", R.drawable.dau));
        arrayTraiCay.add(new Traicay("Kiwi", "Kiwi Hàn Quốc", R.drawable.kiwi));
        arrayTraiCay.add(new Traicay("Xoài", "Xoài Việt nam", R.drawable.xoai));


    }
}