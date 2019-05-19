package com.example.projetoheadsup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaConfig extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_config);

        Button btnInserir = (Button) findViewById(R.id.btnInserir);
        Button btnFacil = (Button) findViewById(R.id.btnFacil);
        Button btnNormal = (Button) findViewById(R.id.btnNormal);
        Button btnDificil = (Button) findViewById(R.id.btnDificil);
        Button btnPersonalizado = (Button) findViewById(R.id.btnPersonalizado);


        btnInserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(TelaConfig.this, TelaConfig2.class);
                startActivity(next);
            }
        });

        btnFacil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(TelaConfig.this, TelaConfig3.class);
                startActivity(next);
            }
        });

        btnNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(TelaConfig.this, TelaConfig4.class);
                startActivity(next);
            }
        });

        btnDificil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(TelaConfig.this, TelaConfig5.class);
                startActivity(next);
            }
        });

        btnPersonalizado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(TelaConfig.this, TelaConfig6.class);
                startActivity(next);
            }
        });




    }
}
