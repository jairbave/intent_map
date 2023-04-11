package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PotenciaActivity extends AppCompatActivity {

    private EditText etNumero1, etNumero2;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potencia);

        etNumero1 = findViewById(R.id.etNumero1);
        etNumero2 = findViewById(R.id.etNumero2);
        tvResultado = findViewById(R.id.tvResultado);

        Button btnCalcular = findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener los números ingresados por el usuario
                int num1 = Integer.parseInt(etNumero1.getText().toString());
                int num2 = Integer.parseInt(etNumero2.getText().toString());

                // Calcular la potencia
                double resultado = Math.pow(num1, num2);

                // Mostrar el resultado en pantalla
                tvResultado.setText("El resultado es: " + resultado);
            }
        });
    }
}