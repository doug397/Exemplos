package br.edu.ifba.sqlite

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import br.edu.ifba.sqlite.database.BD
import br.edu.ifba.sqlite.dominio.User

import kotlinx.android.synthetic.main.activity_cadastro.*
import kotlinx.android.synthetic.main.content_cadastro.*

class CadastroActivity : AppCompatActivity() {
    var user: User? = null
    var bd: BD?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
        setSupportActionBar(toolbar)

        btn_cadastrar.setOnClickListener {
           cadastroUser()
        }

    }
    // o armazenamento seria tipo isso...

    fun cadastroUser(){
        bd= BD(this)
        user=User(cadastrar_edt_nome.text.toString(),cadastrar_edt_email.text.toString(),cadastrar_edt_senha.text.toString())
        bd!!.create(user!!)

        Toast.makeText(this,"Cadastrado Com Sucesso",Toast.LENGTH_LONG).show()
        finish()

    }

}
