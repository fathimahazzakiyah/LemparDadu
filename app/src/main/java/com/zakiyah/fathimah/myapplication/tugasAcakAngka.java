package com.zakiyah.fathimah.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class tugasAcakAngka extends AppCompatActivity {

    private Button buttonAcak;
    private TextView textAngka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas_acak_angka);

        buttonAcak = findViewById(R.id.btn_button);
        textAngka = findViewById(R.id.tv_text);

        buttonAcak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                acakAngka();
            }
        });
    }

    private void acakAngka() {
        Random acak = new Random();
        String angka = String.valueOf(1 + acak.nextInt(6));
        textAngka.setText(angka);
        if(angka.equals("6")){
            Toast.makeText(this, "Sudah Maksimal", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        textAngka.setText("Hello Word");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
