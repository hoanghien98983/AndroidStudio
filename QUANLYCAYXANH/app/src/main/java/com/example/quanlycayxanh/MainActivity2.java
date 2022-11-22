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

        arrayCay.add(new cay("Cây Kim Ngân", "Một loại cây thân dẻo dai, bền chắc.", R.drawable.cay11));
        arrayCay.add(new cay("Cây Kim Tiền", "Biểu tượng của sự thịnh vượng.", R.drawable.cay2));
        arrayCay.add(new cay("Cây Bạch Mã Hoàng Tử", "Cây bạch mã hoàng tử là loại cây chịu bóng tốt.", R.drawable.cay3));
        arrayCay.add(new cay("Cây Thiết Mộc Lan", "Nó sẽ mang đến may mắn cho gia chủ.", R.drawable.cay4));
        arrayCay.add(new cay("Cây Phú Qúy", "Loại cây có ý nghĩa phong thủy.", R.drawable.cay5));
    }
}