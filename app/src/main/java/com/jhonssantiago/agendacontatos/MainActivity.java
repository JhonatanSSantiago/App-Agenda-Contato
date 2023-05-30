package com.jhonssantiago.agendacontatos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView listaContatos;
    private Button btnNewContact;
    private AdapterListContact adapterListContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaContatos = findViewById(R.id.listView);
        btnNewContact = findViewById(R.id.btnNewContact);

    }
}