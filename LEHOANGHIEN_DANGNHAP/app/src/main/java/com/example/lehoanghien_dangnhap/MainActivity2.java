package com.example.lehoanghien_dangnhap;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    private ImageView emailImageview, phoneImageview, videoImageview, webImageview;
    private Button btnnthoat;
    Button btndanhsach;
    MenuItem menuItem;
    Button btnchinhsua;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return true;

            default:break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Anhxa();
        ControlButton();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_demo, menu);

        return super.onCreateOptionsMenu(menu);
    }

    private void ControlButton() {
        btndanhsach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });
        btnchinhsua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MainActivity9.class);
                startActivity(intent);
            }
        });
        btnnthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity2.this,android.R.style.Theme_DeviceDefault_Light_Dialog_Alert);
                builder.setTitle("B???n c?? ch???c mu???n tho??t kh???i app");
                builder.setMessage("H??y l???a ch???n b??n d?????i ????? x??c nh???n");
                builder.setIcon(android.R.drawable.ic_dialog_alert);
                builder.setPositiveButton("C??", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        onBackPressed();
                    }
                });
                builder.setNegativeButton("Kh??ng", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                builder.show();
            }
        });
    }

    private void Anhxa() {
        btnnthoat = (Button) findViewById(R.id.buttonthoat) ;
        btndanhsach = (Button) findViewById(R.id.buttondanhsach);
        btnchinhsua = (Button) findViewById(R.id.buttonchinhsua);
        emailImageview = (ImageView) findViewById(R.id.email_imagview);
        phoneImageview = (ImageView) findViewById(R.id.phone_imagview);
        videoImageview = (ImageView) findViewById(R.id.video_imagview);
        webImageview = (ImageView) findViewById(R.id.web_imagview);
    }
}