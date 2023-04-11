package com.example.tarea1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText edtNumero;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumero = findViewById(R.id.edt_numero);
        btnEnviar = findViewById(R.id.btn_enviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero = Integer.parseInt(edtNumero.getText().toString());
                Intent intent;

                switch(numero) {
                    case 1:
                        intent = new Intent(MainActivity.this, MultiplicacionActivity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(MainActivity.this, PotenciaActivity.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(MainActivity.this, FibonacciActivity.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(MainActivity.this, MyMap.class);
                        startActivity(intent);
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "Ingresa un número válido", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}