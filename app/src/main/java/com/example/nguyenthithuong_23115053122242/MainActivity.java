package com.example.nguyenthithuong_23115053122242;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnTinhDiem;
    EditText txtChuyenCan, txtGiuaKy, txtCuoiKy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCuoiKy = findViewById(R.id.txtCuoiKy);
        txtGiuaKy = findViewById(R.id.txtGiuaKy);
        txtChuyenCan = findViewById(R.id.txtChuyenCan);
        btnTinhDiem = findViewById(R.id.btnTinhDiem);

        btnTinhDiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double cc = Double.parseDouble(txtChuyenCan.getText().toString());
                    double gk = Double.parseDouble(txtGiuaKy.getText().toString());
                    double ck = Double.parseDouble(txtCuoiKy.getText().toString());
                    double diem = cc * 0.2 + gk * 0.3 + ck * 0.5;

                    Bundle bundle = new Bundle();
                    bundle.putDouble("diem", diem);

                    Intent intent = new Intent(MainActivity.this, ketqua.class);
                    intent.putExtras(bundle);
                    startActivity(intent);
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập đủ điểm", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
