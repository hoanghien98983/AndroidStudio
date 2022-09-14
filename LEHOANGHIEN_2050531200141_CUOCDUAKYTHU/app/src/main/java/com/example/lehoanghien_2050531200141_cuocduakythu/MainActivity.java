    package com.example.lehoanghien_2050531200141_cuocduakythu;

    import android.os.Bundle;
    import android.os.CountDownTimer;
    import android.view.View;
    import android.widget.CheckBox;
    import android.widget.ImageButton;
    import android.widget.SeekBar;
    import android.widget.TextView;

    import androidx.appcompat.app.AppCompatActivity;

    import android.os.Bundle;
    import android.widget.Toast;

    import java.util.Random;

    public class MainActivity extends AppCompatActivity {

        TextView txtDiem;
        ImageButton ibtnPlay;
        CheckBox cbOne, cbTwo, cbThree;
        SeekBar skOne, skTwo, skThree;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Anhxa();
            final CountDownTimer countDownTimer = new CountDownTimer(60000, 300) {
                @Override
                public void onTick(long l) {
                    int number = 5;
                    Random random = new Random();
                    int one = random.nextInt(number);
                    int two = random.nextInt(number);
                    int three = random.nextInt(number);

                    //KIEM TRA CHIEN THANG
                    if (skOne.getProgress() >= skOne.getMax()){
                        this.cancel();
                        ibtnPlay.setVisibility(View.VISIBLE);
                        Toast.makeText(MainActivity.this, "ONE WIN", Toast.LENGTH_SHORT).show();
                    }
                    if (skTwo.getProgress() >= skTwo.getMax()){
                        this.cancel();
                        ibtnPlay.setVisibility(View.VISIBLE);
                        Toast.makeText(MainActivity.this, "TWO WIN", Toast.LENGTH_SHORT).show();
                    }
                    if (skThree.getProgress() >= skThree.getMax()){
                        this.cancel();
                        ibtnPlay.setVisibility(View.VISIBLE);
                        Toast.makeText(MainActivity.this, "THREE WIN", Toast.LENGTH_SHORT).show();
                    }

                    skOne.setProgress(skOne.getProgress() + one);
                    skTwo.setProgress(skTwo.getProgress() + two);
                    skThree.setProgress(skThree.getProgress() + three);
                }

                @Override
                public void onFinish() {

                }
            };
            ibtnPlay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    skOne.setProgress(0);
                    skTwo.setProgress(0);
                    skThree.setProgress(0);
                    ibtnPlay.setVisibility(View.INVISIBLE);
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

