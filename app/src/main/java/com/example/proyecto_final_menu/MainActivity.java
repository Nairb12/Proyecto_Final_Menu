package com.example.proyecto_final_menu;

<<<<<<< HEAD
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText etus, etpass;
    Button btnAcceder, btnRegistro;
=======
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

>>>>>>> 1eb7f6ba84a2ee05a1caec9eb0ee355095f3771d
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
        etus = findViewById(R.id.etus);
        etpass = findViewById(R.id.etpass);
        btnAcceder = findViewById(R.id.btnAcceder);
        btnRegistro = findViewById(R.id.btnRegistro);
        btnAcceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = etus.getText().toString();
                String contrasena = etpass.getText().toString();

                if (usuario.equals("admin") && contrasena.equals("admin")) {
                    Intent intent = new Intent(MainActivity.this, Interfaces.class);
                    startActivity(intent);
                    finish(); // Opcional: si deseas finalizar el Activity actual después de ir al Activity de destino
                } else {
                    Toast.makeText(MainActivity.this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
                }
            }
        });

=======
>>>>>>> 1eb7f6ba84a2ee05a1caec9eb0ee355095f3771d
    }
}