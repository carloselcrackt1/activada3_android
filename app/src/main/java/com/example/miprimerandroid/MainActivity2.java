package com.example.miprimerandroid;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    EditText etNombre, etEmail;
    Button btnGuardar, btnVerUsuarios;
    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = findViewById(R.id.id_name);
        etEmail = findViewById(R.id.id_mail);
        btnGuardar = findViewById(R.id.button);
        btnVerUsuarios = findViewById(R.id.button3);

        dbHelper = new DBHelper(this);


        btnGuardar.setOnClickListener(v -> {
            String nombre = etNombre.getText().toString();
            String email = etEmail.getText().toString();
            guardarUsuario(nombre, email);
        });

        btnVerUsuarios.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity2.this, ListaUsuarios.class));
        });

    }

    private void guardarUsuario(String nombre, String email){
        SQLiteDatabase db= dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("nombre",nombre);
        values.put("email",email);
        db.insert("usuarios",null,values);
        Toast.makeText(this,"usuario guardado",Toast.LENGTH_SHORT).show();
        etNombre.setText("");
        etEmail.setText("");
    }

}