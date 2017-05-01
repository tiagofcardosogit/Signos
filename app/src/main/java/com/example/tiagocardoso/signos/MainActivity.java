package com.example.tiagocardoso.signos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listaDeSignos;
    private String[] signos = {
            "Aries", "Touro", "Gemeos", "Cancer", "Leao", "Virgem",
            "Libra", "Escorpiao", "Sargitario", "Capricornio", "Aquario", "Peixes"
    };

    private String[] perfil = {
            "Gente boa", "Malucasso", "Diboassa", "doente", "Briguento", "Cabaço",
            "Só pensa em grana", "Venenoso", "Se acha o cupido", "Corno", "The best", "Sabe nadar"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDeSignos = (ListView) findViewById(R.id.listViewID);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_expandable_list_item_1,
                android.R.id.text1,
                signos
        );

        listaDeSignos.setAdapter(adapter);

        listaDeSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int codPosition = position;

                Toast.makeText(getApplicationContext(),perfil[codPosition], Toast.LENGTH_SHORT).show();


            }
        });
    }
}
