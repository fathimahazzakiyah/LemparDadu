package com.zakiyah.fathimah.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //deklarasi atribut dr xml
    private Button btn_Acak;
    private TextView txt_view;
    private ImageView img_View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //inisialisasi berdasarkan id
        btn_Acak = findViewById(R.id.btnAcak);
        txt_view = findViewById(R.id.txtView);
        img_View = findViewById(R.id.imgView);

        //membreikan listener pd button
        btn_Acak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //isi perintah untuk Button
                //toast();
                melemparDadu();
                gantiGambar();
            }
        });
    }

    private void gantiGambar() {
        Random acak = new Random();
        //membuat array drawable (gambar) dadu
        int[]gambar = new int[6];
        gambar[0] = R.drawable.dice_1;
        gambar[1] = R.drawable.dice_2;
        gambar[2] = R.drawable.dice_3;
        gambar[3] = R.drawable.dice_4;
        gambar[4] = R.drawable.dice_5;
        gambar[5] = R.drawable.dice_6;
        //mengeset gambar dg drawable baru + acak
        img_View.setImageResource(gambar[acak.nextInt(5)]);

    }

    private void melemparDadu() {
        //memanggil fungsi acak
        Random acak = new Random();
        //membuat variable angka
        String angka = String.valueOf(1+ acak.nextInt(6));
        txt_view.setText(angka);
    }

    private void toast() {
        Toast.makeText(MainActivity.this, "Hello Javatpoint", Toast.LENGTH_SHORT).show();

    }
    }
