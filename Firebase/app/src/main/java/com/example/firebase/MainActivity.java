package com.example.firebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.net.HttpCookie;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    TextView txtSinhvien;

    DatabaseReference mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtSinhvien = (TextView) findViewById(R.id.txtSinhvien);
        mData = FirebaseDatabase.getInstance().getReference();
        mData.child("Ho Ten").setValue("Le Hoang Hien_2050531200141");

        Sinhvien sv = new Sinhvien("Le Hoang Hien", "Tp. Da Nang", 2002);
        mData.child("Sinh Vien").setValue(sv);

        Sinhvien sv2 = new Sinhvien("Le Hoang A", "Tp. Nha Trang", 1999);
        mData.child("Sinh Vien").push().setValue(sv2);


        Sinhvien sv3 = new Sinhvien("Le Van B", "Tp. Hue", 1998);
        mData.child("Sinh Vien").push().setValue(sv3);
        Sinhvien sv4 = new Sinhvien("Le Thi C", "Tp. Ho Chi Minh", 1997);
        mData.child("Sinh Vien").push().setValue(sv4);
        Sinhvien sv5 = new Sinhvien("Le Hoang D", "Tp. Dong Ha", 1996);
        mData.child("Sinh Vien").push().setValue(sv5);
        Sinhvien sv6 = new Sinhvien("Le Tien E", "Tp. Hoi An", 1995);
        mData.child("Sinh Vien").push().setValue(sv6);


        mData.child("Sinh Vien").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange( DataSnapshot dataSnapshot) {
                txtSinhvien.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled( DatabaseError databaseError) {

            }
        });
    }
}