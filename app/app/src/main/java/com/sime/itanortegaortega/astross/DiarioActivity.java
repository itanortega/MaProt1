package com.sime.itanortegaortega.astross;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import java.util.Calendar;

public class DiarioActivity extends AppCompatActivity {

    SharedPreferences preferencias;
    Toolbar toolbar;
    int id;
    TextView Txt_FechaHoy;
    TextView Txt_Diario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diario);

        preferencias = getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);
        id = preferencias.getInt("id", 1);

        toolbar = (Toolbar) findViewById(R.id.id_tb_toolbar);
        showToolbar(getResources().getString(R.string.sdiario), true);

        Txt_FechaHoy = (TextView) this.findViewById(R.id.Txt_FechaHoy);
        Txt_Diario = (TextView) this.findViewById(R.id.Txt_Diario);

        Calendar c = Calendar.getInstance();
        String dia = Integer.toString(c.get(Calendar.DATE));
        String mes = Integer.toString(c.get(Calendar.MONTH));
        String annio = Integer.toString(c.get(Calendar.YEAR));

        Txt_FechaHoy.setText(dia + " de " + mes + " del " + annio);
        Txt_Diario.setText(Utilidades.get_elemento(this, id));
    }

    public void showToolbar(String title, boolean upButton){
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }
}