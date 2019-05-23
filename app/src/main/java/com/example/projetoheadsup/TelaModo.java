package com.example.projetoheadsup;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class TelaModo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_modo);

        Button btnFacil = (Button) findViewById(R.id.btnFacil);
        Button btnNormal = (Button) findViewById(R.id.btnNormal);
        Button btnDificil = (Button) findViewById(R.id.btnDificil);
        Button btnPersonalizado = (Button) findViewById(R.id.btnPersonalizado);
        final ImageView img1 = (ImageView) findViewById(R.id.img1);
        final ImageView img2 = (ImageView) findViewById(R.id.img2);
        final ImageView img3 = (ImageView) findViewById(R.id.img3);

        btnFacil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img3.setVisibility(v.VISIBLE);
                //start a handler that will wait for 2000ms and then make the img invisible
                Handler handler3 = new Handler();
                handler3.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        img3.setVisibility(ImageView.INVISIBLE);
                    }
                }, 1000);
                img2.setVisibility(v.VISIBLE);
                //start a handler that will wait for 2000ms and then make the img invisible
                Handler handler2 = new Handler();
                handler2.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        img2.setVisibility(ImageView.INVISIBLE);
                    }
                }, 1000);
                img1.setVisibility(v.VISIBLE);
                //start a handler that will wait for 2000ms and then make the img invisible
                Handler handler1 = new Handler();
                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        img1.setVisibility(ImageView.INVISIBLE);
                    }
                }, 1000);

//                try {
//                    Thread.sleep(1000);
//                    img3.setVisibility(v.VISIBLE);
////                    img3.setVisibility(v.INVISIBLE);
////                    Thread.sleep(1000);
//                    Thread.sleep(1000);
//                    img2.setVisibility(v.VISIBLE);
////                    img2.setVisibility(v.INVISIBLE);
////                    Thread.sleep(1000);
//                    Thread.sleep(1000);
//                    img1.setVisibility(v.VISIBLE);
////                    img1.setVisibility(v.INVISIBLE);
//
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }

                Intent next = new Intent(TelaModo.this, TelaJogoFacil.class);
                startActivity(next);
            }
        });

        btnNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(TelaModo.this, TelaJogoNormal.class);
                startActivity(next);
            }
        });

        btnDificil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(TelaModo.this, TelaJogoDificil.class);
                startActivity(next);
            }
        });

        btnPersonalizado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(TelaModo.this, TelaJogoPersonalizado.class);
                startActivity(next);
            }
        });
    }
}
