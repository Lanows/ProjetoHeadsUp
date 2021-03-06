package com.example.projetoheadsup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TelaInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_info);

        ImageButton btnWordpress = (ImageButton) findViewById(R.id.btnWordpress);
        ImageButton btnYoutube = (ImageButton) findViewById(R.id.btnYoutube);
        ImageButton btnInstagram = (ImageButton) findViewById(R.id.btnInstagram);

        btnWordpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(TelaInfo.this, TelaInfo2.class);
                startActivity(next);
            }
        });

        btnYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(TelaInfo.this, TelaInfo3.class);
                startActivity(next);
            }
        });

        btnInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(TelaInfo.this, TelaInfo4.class);
                startActivity(next);
            }
        });
    }
}
