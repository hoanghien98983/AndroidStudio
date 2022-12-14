package com.example.quanlycayxanh;

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
    ListView lvcay;
    ArrayList<cay> arrayCay;
    cayadapter adapter;
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
        adapter = new cayadapter(this, R.layout.dong_cay, arrayCay);
        lvcay.setAdapter(adapter);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        lvcay.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity2.this,MainActivity3.class);
                    startActivity(intent);
                }
                if(position==1){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity2.this,MainActivity4.class);
                    startActivity(intent);
                }
                if(position==2){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity2.this,MainActivity5.class);
                    startActivity(intent);
                }
                if(position==3){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity2.this,MainActivity6.class);
                    startActivity(intent);
                }
                if(position==4){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity2.this,MainActivity7.class);
                    startActivity(intent);
                }
            }
        });
    }

    private void AnhXa() {
        lvcay = (ListView) findViewById(R.id.listviewcay);
        arrayCay = new ArrayList<>();

        arrayCay.add(new cay("C??y Kim Ng??n", "M???t lo???i c??y th??n d???o dai, b???n ch???c.", R.drawable.cay11));
        arrayCay.add(new cay("C??y Kim Ti???n", "Bi???u t?????ng c???a s??? th???nh v?????ng.", R.drawable.cay2));
        arrayCay.add(new cay("C??y B???ch M?? Ho??ng T???", "C??y b???ch m?? ho??ng t??? l?? lo???i c??y ch???u b??ng t???t.", R.drawable.cay3));
        arrayCay.add(new cay("C??y Thi???t M???c Lan", "N?? s??? mang ?????n may m???n cho gia ch???.", R.drawable.cay4));
        arrayCay.add(new cay("C??y Ph?? Q??y", "Lo???i c??y c?? ?? ngh??a phong th???y.", R.drawable.cay5));
    }
}