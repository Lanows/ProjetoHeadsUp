package com.example.projetoheadsup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaConfig2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_config2);

        Button btnInserir = (Button) findViewById(R.id.btnInserir);
        Button btnSair = (Button) findViewById(R.id.btnSair);


        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(TelaConfig2.this, TelaConfig.class);
                startActivity(next);
            }
        });
    }
}
