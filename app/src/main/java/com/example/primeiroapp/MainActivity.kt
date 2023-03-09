package com.example.primeiroapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtNome: EditText = findViewById(R.id.edtNome)
        val edtEnd: EditText = findViewById(R.id.edtEnd)
        val edtBair: EditText = findViewById(R.id.edtBair)
        val edtCep: EditText = findViewById(R.id.edtCep)
        val edtCida: EditText = findViewById(R.id.edtCida)
        val edtEstd: EditText = findViewById(R.id.edtEstd)
        val btnCadastrar: Button = findViewById(R.id.btnCadastrar)
        btnCadastrar.setOnClickListener{
            val toast = Toast.makeText(this, edtNome.text.toString() + edtEnd.text.toString(), Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}