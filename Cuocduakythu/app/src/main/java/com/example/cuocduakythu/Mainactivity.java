package com.example.cuocduakythu;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Mainactivity extends AppCompatActivity {
    TextView txtDiem;
    ImageButton ibtnPlay;
    CheckBox cbOne, cbTwo, cbThree;
    SeekBar skOne, skTwo, skThree;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((R.layout.activity_main));

        Anhxa();
        CountDownTimer countDownTimer = new CountDownTimer(60000, 300) {
            @Override
            public void onTick(long l) {
                skOne.setProgress(skOne.getProgress()+5);
                skTwo.setProgress(skTwo.getProgress()+5);
                skThree.setProgress(skThree.getProgress()+5);
            }

            @Override
            public void onFinish() {

            }
        };

        ibtnPlay.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                countDownTimer.start();
            }
        });
    }

    private void Anhxa(){
        txtDiem     = (TextView) findViewById(R.id.textviewDiemSo);
        ibtnPlay    = (ImageButton) findViewById(R.id.buttonPlay);
        cbOne       = (CheckBox) findViewById(R.id.checkboxOne);
        cbTwo       = (CheckBox) findViewById(R.id.checkboxTwo);
        cbThree     = (CheckBox) findViewById(R.id.checkboxThree);
        skOne       = (SeekBar) findViewById(R.id.seekbarOne);
        skTwo       = (SeekBar) findViewById(R.id.seekbarTwo);
        skThree     = (SeekBar) findViewById(R.id.seekbarThree);
    }
}
