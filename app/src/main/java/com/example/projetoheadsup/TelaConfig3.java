package com.example.projetoheadsup;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SimpleCursorAdapter;

import static com.example.projetoheadsup.MainActivity.banco;

public class TelaConfig3 extends AppCompatActivity {

    private SimpleCursorAdapter mAdapter;
    private Cursor mCursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_config3);

        Button btnSair = (Button) findViewById(R.id.btnSair);

        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(TelaConfig3.this, TelaConfig.class);
                startActivity(next);
            }
        });

        mCursor = readArtists();
        mAdapter = new SimpleCursorAdapter(this, R.layout.list_layout, mCursor,
                Banco.columns, new int[] { R.id._id, R.id.name },
                0);

//        setListAdapter(mAdapter);


    }

    private Cursor readArtists() {
        return banco.getWritableDatabase().query(Banco.TABLE_NAME0,
                Banco.columns, null, new String[] {}, null, null,
                null);
    }
}
