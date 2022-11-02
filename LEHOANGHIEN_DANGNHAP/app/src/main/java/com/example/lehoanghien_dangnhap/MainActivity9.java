package com.example.lehoanghien_dangnhap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.lehoanghien_dangnhap.adapterbonus.Songadapter;
import com.example.lehoanghien_dangnhap.model.Employee;
import com.example.lehoanghien_dangnhap.sqlite.EmployeeDao;

import java.util.ArrayList;
import java.util.List;

public class MainActivity9 extends AppCompatActivity implements View.OnClickListener {
    private Songadapter songadapter;
    ListView lvbaihat;
    Button butnedit;
    Button butnxoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        Anhxa();
        ControlButton();
        EmployeeDao dao = new EmployeeDao(this);
        List<Employee> list = dao.getAll();
        songadapter = new Songadapter(this, list);
        lvbaihat.setAdapter(songadapter);
    }

    private void ControlButton() {
        butnedit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity9.this,ThemvasuaActivity.class);
                startActivity(intent);
            }
        });
    }

    private void Anhxa() {
        butnedit = (Button) findViewById(R.id.btnedit) ;
        butnxoa = (Button) findViewById(R.id.btnxoa);
        lvbaihat = (ListView) findViewById(R.id.lvbaihat);

    }


    @Override
    public void onClick(View view) {

    }
}