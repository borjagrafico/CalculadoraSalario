package com.example.calculadorasalario

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val salario = findViewById<EditText>(R.id.salario)
        val pagas = findViewById<EditText>(R.id.pagas)
        val edad = findViewById<EditText>(R.id.edad)
        val grupo = findViewById<EditText>(R.id.grupo)
        val discapacidad = findViewById<EditText>(R.id.discapacidad)
        val estadoCivil = findViewById<EditText>(R.id.estadoCivil)
        val hijos = findViewById<EditText>(R.id.hijos)

        val boton = findViewById<Button>(R.id.botonCalcular)



        boton.setOnClickListener {

            val bruto = salario.text.toString().toDoubleOrNull() ?: 0.0

            val irpf = bruto * 0.15
            val deducciones = bruto * 0.05
            val neto = bruto - irpf - deducciones

            val intent = Intent(this, ResultadoActivity::class.java)
            intent.putExtra("bruto", bruto)
            intent.putExtra("neto", neto)
            intent.putExtra("irpf", irpf)
            intent.putExtra("deducciones", deducciones)

            startActivity(intent)
        }



    }
}
