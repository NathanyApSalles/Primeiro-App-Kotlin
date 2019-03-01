package com.example.nathany.atmconsultoria

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun contato(view: View){
        val intent = Intent(this, DetalheContato::class.java)

        startActivity(intent)
    }

    fun empresa(view: View){
        val intent = Intent(this, DetalheEmpresa::class.java)
        startActivity(intent)
    }

    fun servico(view: View){
        val intent = Intent(this, DetalheServico::class.java)
        startActivity(intent)
    }

    fun cliente(view: View){
        val intent = Intent(this, DetalheCliente::class.java)
        intent.putExtra("cliente", "Cliente 1")
        startActivity(intent)
    }


}
