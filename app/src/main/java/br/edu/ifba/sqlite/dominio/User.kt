package br.edu.ifba.sqlite.dominio

/**
 * Created by douglas on 03/12/2017.
 */

// classe usuario  construtor primário.
class User {
    var token:String = ""
    var nome: String=""
    var email:String=""
    var senha: String=""

    constructor(nome:String,email:String,senha:String){
        this.nome=nome
        this.email=email
        this.senha=senha
    }
}


