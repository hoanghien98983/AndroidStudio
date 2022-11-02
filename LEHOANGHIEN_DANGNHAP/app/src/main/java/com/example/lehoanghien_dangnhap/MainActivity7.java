package com.example.lehoanghien_dangnhap;

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

        TextView textView6 = findViewById(R.id.txt13);
        TextView textView7 = findViewById(R.id.txt14);
        TextView textView8 = findViewById(R.id.txt15);
        Button button = findViewById(R.id.btnout3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}