package br.edu.ifba.sqlite.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

/**
 * Created by douglas on 03/12/2017.
 */

// classe com o construtor inicializado
class BdHelper(context:Context) :SQLiteOpenHelper(context,BdHelper.NOME_BD,null,BdHelper.VERSAO_DB) {

    // inicializando os components do objetos
    companion object {
        val NOME_BD = "Postagens.db"
        val VERSAO_DB=1;
    }

    //Função Upgrade da versao do Database
    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        db?.execSQL("DROP TABLE usuario")
        onCreate(db)
    }
// Funcao OnCreate DataBase
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE if not exists" +
                "usuario(" +
                "_token integer primary key autoincrement," +
                "nome text," +
                "email text," +
                "senha text")
    }
}