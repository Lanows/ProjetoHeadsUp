package com.example.projetoheadsup;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Banco extends SQLiteOpenHelper {

    final private static String NOMES = "lista_db";
    final private static Integer VERSION = 1;
    final private Context mContext;

    public Banco(Context context) {
        super(context, NOMES, null, VERSION);
        this.mContext = context;
    }

    final static String TABLE_NAME0 = "facil";
    final static String TABLE_NAME1 = "medio";
    final static String TABLE_NAME2 = "dificil";
    final static String TABLE_NAME3 = "personalizado";
    final static String WORD = "name";

    private final static String _ID = "_id";
    final static String[] columns = { _ID, WORD };

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(criarTabela(TABLE_NAME0));
        db.execSQL(criarTabela(TABLE_NAME1));
        db.execSQL(criarTabela(TABLE_NAME2));
        db.execSQL(criarTabela(TABLE_NAME3));

        clearAll();

        inserirTabelaFacil();
        inserirTabelaMedio();
        inserirTabelaDificil();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    String criarTabela(String nomeTabela){
        return             "CREATE TABLE " + nomeTabela + "(" + _ID
                + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + WORD + " TEXT NOT NULL)";
    }

    void deleteDatabase() {
        mContext.deleteDatabase(NOMES);
    }

    private void inserirTabelaFacil() {

        ContentValues values = new ContentValues();

        values.put(Banco.WORD, "Abelha");
        this.getWritableDatabase().insert(Banco.TABLE_NAME0, null, values);

        values.clear();

        values.put(Banco.WORD, "Baleia");
        this.getWritableDatabase().insert(Banco.TABLE_NAME0, null, values);

        values.clear();

        values.put(Banco.WORD, "Borboleta");
        this.getWritableDatabase().insert(Banco.TABLE_NAME0, null, values);

        values.clear();

        values.put(Banco.WORD, "Burro");
        this.getWritableDatabase().insert(Banco.TABLE_NAME0, null, values);

        values.put(Banco.WORD, "Cachorro");
        this.getWritableDatabase().insert(Banco.TABLE_NAME0, null, values);

        values.clear();

        values.put(Banco.WORD, "Caranguejo");
        this.getWritableDatabase().insert(Banco.TABLE_NAME0, null, values);

        values.clear();

        values.put(Banco.WORD, "Cobra");
        this.getWritableDatabase().insert(Banco.TABLE_NAME0, null, values);

        values.clear();

        values.put(Banco.WORD, "Coelho");
        this.getWritableDatabase().insert(Banco.TABLE_NAME0, null, values);

        values.put(Banco.WORD, "Elefante");
        this.getWritableDatabase().insert(Banco.TABLE_NAME0, null, values);

        values.clear();

        values.put(Banco.WORD, "Galinha");
        this.getWritableDatabase().insert(Banco.TABLE_NAME0, null, values);

        values.clear();

        values.put(Banco.WORD, "Gato");
        this.getWritableDatabase().insert(Banco.TABLE_NAME0, null, values);

        values.clear();

        values.put(Banco.WORD, "Leão");
        this.getWritableDatabase().insert(Banco.TABLE_NAME0, null, values);

        values.put(Banco.WORD, "Macaco");
        this.getWritableDatabase().insert(Banco.TABLE_NAME0, null, values);

        values.clear();

        values.put(Banco.WORD, "Morcego");
        this.getWritableDatabase().insert(Banco.TABLE_NAME0, null, values);

        values.clear();

        values.put(Banco.WORD, "Pato");
        this.getWritableDatabase().insert(Banco.TABLE_NAME0, null, values);

        values.clear();

        values.put(Banco.WORD, "Porco");
        this.getWritableDatabase().insert(Banco.TABLE_NAME0, null, values);

        values.put(Banco.WORD, "Sapo");
        this.getWritableDatabase().insert(Banco.TABLE_NAME0, null, values);

        values.clear();

        values.put(Banco.WORD, "Tartaruga");
        this.getWritableDatabase().insert(Banco.TABLE_NAME0, null, values);

        values.clear();

        values.put(Banco.WORD, "Urso");
        this.getWritableDatabase().insert(Banco.TABLE_NAME0, null, values);

        values.clear();
    }

    private void inserirTabelaMedio() {

        ContentValues values = new ContentValues();

        values.put(Banco.WORD, "Arya stark");
        this.getWritableDatabase().insert(Banco.TABLE_NAME1, null, values);

        values.clear();

        values.put(Banco.WORD, "Bart Simpsons");
        this.getWritableDatabase().insert(Banco.TABLE_NAME1, null, values);

        values.clear();

        values.put(Banco.WORD, "Bulma");
        this.getWritableDatabase().insert(Banco.TABLE_NAME1, null, values);

        values.clear();

        values.put(Banco.WORD, "Capitã Marvel");
        this.getWritableDatabase().insert(Banco.TABLE_NAME1, null, values);

        values.put(Banco.WORD, "Capitão América");
        this.getWritableDatabase().insert(Banco.TABLE_NAME1, null, values);

        values.clear();

        values.put(Banco.WORD, "Daenerys");
        this.getWritableDatabase().insert(Banco.TABLE_NAME1, null, values);

        values.clear();

        values.put(Banco.WORD, "Dean Winchester");
        this.getWritableDatabase().insert(Banco.TABLE_NAME1, null, values);

        values.clear();

        values.put(Banco.WORD, "Dr. Estranho");
        this.getWritableDatabase().insert(Banco.TABLE_NAME1, null, values);

        values.put(Banco.WORD, "Goku");
        this.getWritableDatabase().insert(Banco.TABLE_NAME1, null, values);

        values.clear();

        values.put(Banco.WORD, "Gon");
        this.getWritableDatabase().insert(Banco.TABLE_NAME1, null, values);

        values.clear();

        values.put(Banco.WORD, "Harry Potter");
        this.getWritableDatabase().insert(Banco.TABLE_NAME1, null, values);

        values.clear();

        values.put(Banco.WORD, "Hisoka");
        this.getWritableDatabase().insert(Banco.TABLE_NAME1, null, values);

        values.put(Banco.WORD, "Homem Aranha");
        this.getWritableDatabase().insert(Banco.TABLE_NAME1, null, values);

        values.clear();

        values.put(Banco.WORD, "Homem de Ferro");
        this.getWritableDatabase().insert(Banco.TABLE_NAME1, null, values);

        values.clear();

        values.put(Banco.WORD, "Homer Simpsons");
        this.getWritableDatabase().insert(Banco.TABLE_NAME1, null, values);

        values.clear();

        values.put(Banco.WORD, "Hulk");
        this.getWritableDatabase().insert(Banco.TABLE_NAME1, null, values);

        values.put(Banco.WORD, "Jon snow");
        this.getWritableDatabase().insert(Banco.TABLE_NAME1, null, values);

        values.clear();

        values.put(Banco.WORD, "Killua");
        this.getWritableDatabase().insert(Banco.TABLE_NAME1, null, values);

        values.clear();

        values.put(Banco.WORD, "Kuririn");
        this.getWritableDatabase().insert(Banco.TABLE_NAME1, null, values);

        values.clear();

        values.put(Banco.WORD, "Lisa Simpsons");
        this.getWritableDatabase().insert(Banco.TABLE_NAME1, null, values);

        values.clear();

        values.put(Banco.WORD, "Naruto");
        this.getWritableDatabase().insert(Banco.TABLE_NAME1, null, values);

        values.clear();

        values.put(Banco.WORD, "Orochimaru");
        this.getWritableDatabase().insert(Banco.TABLE_NAME1, null, values);

        values.clear();

        values.put(Banco.WORD, "Sam Winchester");
        this.getWritableDatabase().insert(Banco.TABLE_NAME1, null, values);

        values.clear();

        values.put(Banco.WORD, "Sasuke");
        this.getWritableDatabase().insert(Banco.TABLE_NAME1, null, values);

        values.clear();

        values.put(Banco.WORD, "Shazam");
        this.getWritableDatabase().insert(Banco.TABLE_NAME1, null, values);

        values.clear();

        values.put(Banco.WORD, "Thor");
        this.getWritableDatabase().insert(Banco.TABLE_NAME1, null, values);

        values.clear();

        values.put(Banco.WORD, "Vegetta");
        this.getWritableDatabase().insert(Banco.TABLE_NAME1, null, values);

        values.clear();

        values.put(Banco.WORD, "Voldemort");
        this.getWritableDatabase().insert(Banco.TABLE_NAME1, null, values);

        values.clear();
        
    }

    private void inserirTabelaDificil() {

        ContentValues values = new ContentValues();

        values.put(Banco.WORD, "Abelha");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Baleia");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Borboleta");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Burro");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.put(Banco.WORD, "Cachorro");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Caranguejo");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Cobra");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Coelho");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.put(Banco.WORD, "Elefante");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Galinha");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Gato");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Leão");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.put(Banco.WORD, "Macaco");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Morcego");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Pato");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Porco");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.put(Banco.WORD, "Sapo");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Tartaruga");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Urso");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Arya stark");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Bart Simpsons");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Bulma");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Capitã Marvel");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.put(Banco.WORD, "Capitão América");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Daenerys");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Dean Winchester");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Dr. Estranho");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.put(Banco.WORD, "Goku");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Gon");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Harry Potter");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Hisoka");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.put(Banco.WORD, "Homem Aranha");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Homem de Ferro");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Homer Simpsons");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Hulk");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.put(Banco.WORD, "Jon snow");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Killua");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Kuririn");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Lisa Simpsons");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Naruto");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Orochimaru");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Sam Winchester");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Sasuke");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Shazam");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Thor");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Vegetta");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

        values.put(Banco.WORD, "Voldemort");
        this.getWritableDatabase().insert(Banco.TABLE_NAME2, null, values);

        values.clear();

    }


    private void clearAll() {

        this.getWritableDatabase().delete(Banco.TABLE_NAME0, null, null);
        this.getWritableDatabase().delete(Banco.TABLE_NAME1, null, null);
        this.getWritableDatabase().delete(Banco.TABLE_NAME2, null, null);

    }

}
