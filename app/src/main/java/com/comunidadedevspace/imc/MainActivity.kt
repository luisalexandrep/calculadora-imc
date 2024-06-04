package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edtaltura = findViewById<TextInputEditText>(R.id.edit_altura)
        var edtpeso = findViewById<TextInputEditText>(R.id.edit_peso)
        var btnCalcular = findViewById<Button>(R.id.calcular)

        btnCalcular.setOnClickListener(){
            val altura: Float = edtaltura.text.toString().toFloat()
            val peso: Float = edtpeso.text.toString().toFloat()

            val alturaQ2 = altura * altura
            val resultado = peso / alturaQ2

            println("ação botao altura" + resultado)
        }

    }
}