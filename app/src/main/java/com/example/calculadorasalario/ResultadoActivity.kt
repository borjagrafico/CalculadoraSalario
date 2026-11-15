package com.example.calculadorasalario

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val bruto = intent.getDoubleExtra("bruto", 0.0)
        val neto = intent.getDoubleExtra("neto", 0.0)
        val irpf = intent.getDoubleExtra("irpf", 0.0)
        val deducciones = intent.getDoubleExtra("deducciones", 0.0)

        val resultadoBruto = findViewById<TextView>(R.id.resultadoBruto)
        val resultadoNeto = findViewById<TextView>(R.id.resultadoNeto)
        val resultadoIrpf = findViewById<TextView>(R.id.resultadoIrpf)
        val resultadoDeducciones = findViewById<TextView>(R.id.resultadoDeducciones)

        resultadoBruto.text = "Salario bruto: $bruto €"
        resultadoNeto.text = "Salario neto: $neto €"
        resultadoIrpf.text = "Retención IRPF: $irpf €"
        resultadoDeducciones.text = "Deducciones: $deducciones €"
    }
}
