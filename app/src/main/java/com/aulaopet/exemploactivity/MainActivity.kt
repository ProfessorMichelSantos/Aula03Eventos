package com.aulaopet.exemploactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val caixatexto: TextView = findViewById(R.id.txtnome)

        val botao = findViewById(R.id.botao2) as Button

        botao.setOnClickListener {
            caixatexto.text = "Clicado pelo botão 2, listener"
            Toast.makeText(this@MainActivity, "Google recomenda Listener.", Toast.LENGTH_SHORT).show()
        }

        botao.setOnLongClickListener{
            caixatexto.text = "Clicado pelo botão 2, listener"

            Toast.makeText(this, "Clique Longo", Toast.LENGTH_SHORT).show()
            return@setOnLongClickListener true
        }




    }


    fun setatexto(view: View) {

        val textview: TextView = findViewById(R.id.txtnome)
        textview.text = "Clicado pelo botão 1, evento no XML"
    }




}