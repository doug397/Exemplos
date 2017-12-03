package br.edu.ifba.sqlite.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

/**
 * Created by douglas on 03/12/2017.
 */

// classe com o construtor inicializado
class BdHelper :SQLiteOpenHelper {

    // inicializando os components do objetos
    companion object {
        val NOME_BD = "user.db"
        val VERSAO_DB=1;
    }
    constructor(context: Context):super(context,NOME_BD,null,VERSAO_DB){

    }

    //Função Upgrade da versao do Database
    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        db?.execSQL("DROP TABLE usuario")
        onCreate(db)
    }
// Funcao OnCreate DataBase
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("create table " +
                "usuario(" +
                "_token integer primary key autoincrement," +
                "nome text," +
                "email text," +
                "senha text);")
    }
}