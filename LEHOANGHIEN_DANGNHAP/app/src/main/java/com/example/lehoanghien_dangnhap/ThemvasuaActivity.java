package com.example.lehoanghien_dangnhap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lehoanghien_dangnhap.model.Employee;
import com.example.lehoanghien_dangnhap.sqlite.EmployeeDao;

public class ThemvasuaActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edid, edname, edsalary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themvasua);

        edid = findViewById(R.id.edtid);
        edname = findViewById(R.id.edtten);
        edsalary = findViewById(R.id.edtgia);

        findViewById(R.id.btnluu).setOnClickListener(this);
        findViewById(R.id.btnds).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnluu:
                EmployeeDao dao = new EmployeeDao(this);
                Employee emp = new Employee();
                emp.setId(edid.getText().toString());
                emp.setName(edname.getText().toString());
                emp.setSalary(Float.parseFloat(edsalary.getText().toString()));

                dao.insert(emp);
                Toast.makeText(this,"Lưu thông tin thành công!",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}