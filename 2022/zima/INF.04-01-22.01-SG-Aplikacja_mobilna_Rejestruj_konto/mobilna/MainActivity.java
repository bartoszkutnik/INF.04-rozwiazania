package com.example.inf04_01_2106_sg;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText emailEditText;
    EditText hasloEditText;
    EditText hasloEditText2;
    TextView wynikText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        button = findViewById(R.id.button);
        emailEditText = findViewById(R.id.emailEditText);
        hasloEditText = findViewById(R.id.hasloEditText);
        hasloEditText2 = findViewById(R.id.haslo2EditText);
        wynikText = findViewById(R.id.wynik);
        wynikText.setText("Autor: 00000000000");

        button.setOnClickListener(view -> {
            boolean czyEmailPoprawny = false;
            boolean czyHaslaRowne = false;
            String email = String.valueOf(emailEditText.getText());
            String haslo1 = String.valueOf(hasloEditText.getText());
            String haslo2 = String.valueOf(hasloEditText2.getText());

            if(email.contains("@")) czyEmailPoprawny = true;
            if(haslo1.equals(haslo2)) czyHaslaRowne = true;

            if(czyEmailPoprawny == false){
                wynikText.setText("Nieprawidlowy adres e-mail");
            }else if(czyHaslaRowne == false){
                wynikText.setText("Hasła się różnią");
            }else {
                wynikText.setText("Witaj " + email);
            }
        });
    }
}