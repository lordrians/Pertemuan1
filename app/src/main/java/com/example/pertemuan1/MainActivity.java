package com.example.pertemuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnTambah, btnKurang, btnReset;
    TextView tvAngka;
    int angka = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTambah = findViewById(R.id.btn_tambah);
        btnKurang = findViewById(R.id.btn_kurang);
        btnReset = findViewById(R.id.btn_reset);
        tvAngka = findViewById(R.id.tv_angka);

        btnTambah.setOnClickListener(this);
        btnKurang.setOnClickListener(this);
        btnReset.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btn_tambah:
                angka++;
                tvAngka.setText(String.valueOf(angka));
                break;

            case R.id.btn_kurang:
                if (angka > 0){
                    angka--;
                    tvAngka.setText(String.valueOf(angka));
                }
                break;

            case R.id.btn_reset:
                angka = 0;
                tvAngka.setText(String.valueOf(angka));
                break;

        }

    }
}
