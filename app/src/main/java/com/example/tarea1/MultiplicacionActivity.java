package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MultiplicacionActivity extends AppCompatActivity {

    private EditText etNumero1, etNumero2;
    private Button btnMultiplicar;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicacion);

        etNumero1 = findViewById(R.id.etNumero1);
        etNumero2 = findViewById(R.id.etNumero2);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        tvResultado = findViewById(R.id.tvResultado);

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero1 = Integer.parseInt(etNumero1.getText().toString());
                int numero2 = Integer.parseInt(etNumero2.getText().toString());
                int resultado = numero1 * numero2;
                tvResultado.setText("El resultado de la multiplicación es: " + resultado);
            }
        });
    }
}