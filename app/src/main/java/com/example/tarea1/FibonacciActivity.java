package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FibonacciActivity extends AppCompatActivity {

    private Button btnCalcular;
    private EditText etNumero;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);

        etNumero = findViewById(R.id.editTextNumber);
        tvResultado = findViewById(R.id.result);
        btnCalcular = findViewById(R.id.button);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero = Integer.parseInt(etNumero.getText().toString());
                int resultado = fibonacci(numero);
                tvResultado.setText("El número Fibonacci de " + numero + " es: " + resultado);
            }
        });
    }

    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
