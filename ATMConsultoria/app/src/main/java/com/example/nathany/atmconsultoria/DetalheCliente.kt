package com.example.nathany.atmconsultoria

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.nathany.atmconsultoria.R.id.textView_cliente
import kotlinx.android.synthetic.main.activity_main.view.*

class DetalheCliente : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_cliente)

        val dados: Bundle = intent.extras
        val textView_cliente = findViewById(R.id.textView_cliente) as TextView
        textView_cliente.text = dados.getString("cliente")




    }
}
