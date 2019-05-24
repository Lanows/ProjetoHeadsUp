package com.example.projetoheadsup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TelaResu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_resu);

        TextView pontuacao = (TextView) findViewById(R.id.pontuacao);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null){
            String valor = bundle.getString("valor");
            pontuacao.setText(valor);
        }

    }
}
