package com.example.projetoheadsup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TelaConfig2 extends AppCompatActivity {

    public static List<String> personalizado = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_config2);

        Button btnInserir = (Button) findViewById(R.id.btnInserir);
        Button btnSair = (Button) findViewById(R.id.btnSair);
        final TextView editTextPalavras = (TextView) findViewById(R.id.editTextPalavras);

        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnInserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item = editTextPalavras.getText().toString();
                personalizado.add(item);
                editTextPalavras.setText("");
            }
        });
    }
}
