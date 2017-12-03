package br.edu.ifba.sqlite.database

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import br.edu.ifba.sqlite.dominio.User

/**
 * Created by douglas on 03/12/2017.
 */
class BD {

    var db: SQLiteDatabase?

    constructor(context: Context){
        val auxBd:BdHelper= BdHelper(context)
        db= auxBd.writableDatabase
    }

    fun create(user : User){
        var valores:ContentValues= ContentValues()
        valores.put("nome",user.nome)
        valores.put("email",user.email)
        valores.put("senha",user.senha)
        db?.insert("usuario",null,valores)

    }

    fun update (user:User){
        var valores:ContentValues= ContentValues()
        valores.put("nome",user.nome)
        valores.put("senha",user.senha)

        db!!.update("user",valores,"_token=?",   arrayOf(user.token))
    }
    fun delete(user:User){
        db!!.delete("user","email"+"="+"'"+user.email+"'",null)
    }

}