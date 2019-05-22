package com.example.projetoheadsup;

import android.app.ListActivity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SimpleCursorAdapter;

import static com.example.projetoheadsup.MainActivity.banco;

public class Main2Activity extends ListActivity {

    private Banco mDbHelper;
    private SimpleCursorAdapter mAdapter;
    private Cursor mCursor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btnSair = (Button) findViewById(R.id.btnSair);

        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(Main2Activity.this, TelaConfig.class);
                startActivity(next);
            }
        });

        // Create a new DatabaseHelper
        mDbHelper = new Banco(this);


        // Insert records
        insertArtists();

        // Create a cursor
        mCursor = readArtists();
        mAdapter = new SimpleCursorAdapter(this, R.layout.list_layout, mCursor,
                Banco.columns, new int[] { R.id._id, R.id.name },
                0);

        setListAdapter(mAdapter);

    }

    public void onClick(@SuppressWarnings("unused") View v) {

        // Redisplay data
        mCursor = readArtists();
        mAdapter.changeCursor(mCursor);
    }

    // Insert several artist records
    private void insertArtists() {

        ContentValues values = new ContentValues();

        values.put(Banco.WORD, "Abelha");
        mDbHelper.getWritableDatabase().insert(Banco.TABLE_NAME0, null, values);

        values.clear();

        values.put(Banco.WORD, "Baleia");
        mDbHelper.getWritableDatabase().insert(Banco.TABLE_NAME0, null, values);

        values.clear();

        values.put(Banco.WORD, "Borboleta");
        mDbHelper.getWritableDatabase().insert(Banco.TABLE_NAME0, null, values);

        values.clear();

        values.put(Banco.WORD, "Burro");
        mDbHelper.getWritableDatabase().insert(Banco.TABLE_NAME0, null, values);

        values.put(Banco.WORD, "Cachorro");
        mDbHelper.getWritableDatabase().insert(Banco.TABLE_NAME0, null, values);

        values.clear();
    }

    // Returns all artist records in the database
    private Cursor readArtists() {
        return mDbHelper.getWritableDatabase().query(Banco.TABLE_NAME0,
                Banco.columns, null, new String[] {}, null, null,
                null);
    }



    // Close database
    @Override
    protected void onDestroy() {

        mDbHelper.getWritableDatabase().close();
        //mDbHelper.deleteDatabase();

        super.onDestroy();

    }
}