package com.example.quanlycayxanh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        TextView textView9 = findViewById(R.id.txt16);
        TextView textView10 = findViewById(R.id.txt17);
        TextView textView11 = findViewById(R.id.txt18);
        Button button = findViewById(R.id.btnout4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}