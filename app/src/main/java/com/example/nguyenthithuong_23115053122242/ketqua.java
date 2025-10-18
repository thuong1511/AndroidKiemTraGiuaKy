package com.example.nguyenthithuong_23115053122242;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ketqua extends AppCompatActivity {

    TextView txtdiem, txtloai;
    Button btnQuayLai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ketqua);

        txtdiem = findViewById(R.id.txtdiem);
        txtloai = findViewById(R.id.txtloai);
        btnQuayLai = findViewById(R.id.btnQuayLai);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            double diem1 = bundle.getDouble("diem");
            String loai;
            if (diem1 >= 8.5) {
                loai = "Giỏi";
            } else if (diem1 >= 7.5) {
                loai = "Khá";
            } else if (diem1 >= 6.5) {
                loai = "Trung bình";
            } else {
                loai = "Yếu";
            }

            txtdiem.setText("Điểm trung bình của bạn là: " + diem1);
            txtloai.setText("Xếp loại: " + loai);
        }

        btnQuayLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
