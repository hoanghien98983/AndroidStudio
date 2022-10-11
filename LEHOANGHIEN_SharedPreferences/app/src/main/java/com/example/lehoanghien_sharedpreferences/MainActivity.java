package com.example.lehoanghien_sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.service.controls.templates.ControlButton;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtuser,edtpassword;
    Button btndangky,btndangnhap,btnthoat;
    String ten,mk;
    CheckBox chbremember;
    SharedPreferences sharedPreference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        sharedPreference = getSharedPreferences("datalogin", MODE_PRIVATE);
        edtuser.setText(sharedPreference.getString("taikhoan",""));
        edtpassword.setText(sharedPreference.getString("matkhau",""));
        chbremember.setChecked(sharedPreference.getBoolean("Checked", false));

        ControlButton();

    }
    private void ControlButton() {
        btnthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this,android.R.style.Theme_DeviceDefault_Light_Dialog_Alert);
                builder.setTitle("Bạn có chắc muốn thoát khỏi app");
                builder.setMessage("Hãy lựa chọn bên dưới để xác nhận");
                builder.setIcon(android.R.drawable.ic_dialog_alert);
                builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        onBackPressed();
                    }
                });
                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                builder.show();
            }
        });

        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtuser.getText().length() != 0 && edtpassword.getText().length() !=0){
                    if (edtuser.getText().toString().equals(ten)&& edtpassword.getText().toString().equals(mk)){
                        Toast.makeText(MainActivity.this,"Bạn đã đăng nhập thành công", Toast.LENGTH_SHORT). show();

                    }else if(edtuser.getText().toString().equals("hien") && edtpassword.getText().toString() .equals("123")){
                        Toast.makeText(MainActivity.this,"Bạn đã đăng nhập thành công", Toast.LENGTH_SHORT). show();
                        if(chbremember.isChecked()){
                            SharedPreferences.Editor editor = sharedPreference.edit();
                            editor.putString("taikhoan", ten);
                            editor.putString("matkhau", mk);
                            editor.putBoolean("checked", true);
                            editor.commit();
                        }else {
                            SharedPreferences.Editor editor = sharedPreference.edit();
                            editor.remove("taikhoan");
                            editor.remove("matkhau");
                            editor.remove("checked");
                            editor.commit();
                        }
                    }else {
                        Toast.makeText(MainActivity.this,"Bạn đã đăng nhập thất bại", Toast.LENGTH_SHORT). show();
                    }
                }else {
                    Toast.makeText(MainActivity.this,"Mời bạn nhập đầy đủ thông tin", Toast.LENGTH_SHORT). show();
                }
            }
        });
    }
    private void Anhxa() {
        edtuser = (EditText) findViewById(R.id.edittextuser);
        edtpassword = (EditText) findViewById(R.id.edittextpassword);
        btndangnhap = (Button) findViewById(R.id.buttondangnhap);
        btnthoat = (Button) findViewById(R.id.buttonthoat);
        chbremember = (CheckBox) findViewById(R.id.checkBoxRemember);


    }

}