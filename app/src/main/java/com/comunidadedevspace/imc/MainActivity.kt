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
            val altura = edtaltura.text

            println("ação botao altura" + altura)
        }

    }
}