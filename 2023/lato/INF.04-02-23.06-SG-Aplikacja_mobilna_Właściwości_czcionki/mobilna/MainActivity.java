package com.example.mobilna;

import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView rozmiarTekst;
    TextView cytatTekst;
    Button przycisk;
    SeekBar slider;

    String[] cytaty = {"Dzień dobry", "Good morning", "Buenos dias"};
    int aktualnyIndeks = 0;

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
        rozmiarTekst = findViewById(R.id.rozmiarTekst);
        cytatTekst = findViewById(R.id.cytatTekst);
        przycisk = findViewById(R.id.przycisk);
        slider = findViewById(R.id.slider);

        slider.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int rozmiar = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                rozmiar = i;
                rozmiarTekst.setText("Rozmiar: "+rozmiar);
                cytatTekst.setTextSize(rozmiar);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        przycisk.setOnClickListener(v->{
            aktualnyIndeks++;
            if(aktualnyIndeks == 3){
                aktualnyIndeks = 0;
            }
            cytatTekst.setText(cytaty[aktualnyIndeks]);
        });
    }
}