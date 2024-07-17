package com.example.dam_examen_final_lopez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = findViewById(R.id.buttonLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Iniciar la actividad NotasActivity
                startActivity(new Intent(MainActivity.this, NotasActivity.class));

                // Mostrar un mensaje de sesión iniciada
                Toast.makeText(MainActivity.this, "Sesión iniciada", Toast.LENGTH_SHORT).show();
            }
        });
    }
}