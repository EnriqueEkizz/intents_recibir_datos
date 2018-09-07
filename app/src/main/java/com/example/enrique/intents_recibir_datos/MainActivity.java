package com.example.enrique.intents_recibir_datos;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Crear listview
        ListView listView = findViewById(R.id.lv_pedidos);

        //Recibiendo arraylist
        ArrayList<String> listaMenu = (ArrayList<String>) getIntent().getSerializableExtra("listaMenu");

        //Llenando adaptador
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, R.layout.ly_item, R.id.tv_item_menu, listaMenu);
        listView.setAdapter(itemsAdapter);
    }
}
