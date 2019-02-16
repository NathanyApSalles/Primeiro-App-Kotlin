package com.example.nathany.alcoolougasolina

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var alcool: String
    lateinit var gasolina: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun calcularPreco(view: View) {

        //  alcool = findViewById(R.id.precoAlcool) as EditText;
        alcool = precoAlcool.text.toString()
        gasolina = precoGasolina.text.toString()

        if (!alcool.equals("") && !gasolina.equals("")){
            melhorPreco(alcool, gasolina)
        }else{
            Toast.makeText(this, "INFORME OS PREÇOS!", Toast.LENGTH_LONG).show()

        }


    }

    fun melhorPreco(alcool: String, gasolina: String){

        var valorAlcool = alcool.toDouble()
        var valorGasolina = gasolina.toDouble()

        textResponse.visibility = View.VISIBLE

        var preco = valorAlcool / valorGasolina
        if ( preco >= 0.7){
            textResponse.text = "Melhor usar gasolina!"
        }else{
            textResponse.text = "Melhor usar alcool!"
        }
    }
}
