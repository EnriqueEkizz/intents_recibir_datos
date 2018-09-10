package com.example.enrique.intents_recibir_datos;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getIntent().getSerializableExtra("listaMenu") != null) {
            //Crear listview
            ListView listView = findViewById(R.id.lv_pedidos);

            //Recibiendo arraylist
            ArrayList<String> listaMenu = (ArrayList<String>) getIntent().getSerializableExtra("listaMenu");

            //Llenando adaptador
            ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this, R.layout.ly_item, R.id.tv_item_menu, listaMenu);
            listView.setAdapter(itemsAdapter);
        } else {
            Context context = getApplicationContext();
            CharSequence text = "No existen pedidos por ahora...";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }

    }
}
