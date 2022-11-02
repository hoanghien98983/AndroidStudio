package com.example.lehoanghien_dangnhap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        TextView textView = findViewById(R.id.txt7);
        TextView textView1 = findViewById(R.id.txt8);
        TextView textView2 = findViewById(R.id.txt9);
        Button button = findViewById(R.id.btnout1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}