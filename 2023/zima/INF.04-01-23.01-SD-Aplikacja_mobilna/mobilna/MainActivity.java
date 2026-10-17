package com.example.mobilna;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    Button dodajButton;
    EditText input;
    ArrayList<String> notatki = new ArrayList<>(Arrays.asList("Zakupy: chleb, masło, ser", "Do zrobienia: obiad, umyć podłogi", "weekend: kino, spacer z psem"));

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
        listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, notatki);
        listView.setAdapter(adapter);
        dodajButton = findViewById(R.id.dodajButton);
        input = findViewById(R.id.input);

        dodajButton.setOnClickListener(v->{
            String notatka = String.valueOf(input.getText());
            notatki.add(notatka);
            adapter.notifyDataSetChanged();
        });
    }
}