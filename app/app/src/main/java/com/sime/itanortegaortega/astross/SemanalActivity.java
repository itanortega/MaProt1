package com.sime.itanortegaortega.astross;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.CalendarView;
import android.widget.TextView;

import java.util.Calendar;

public class SemanalActivity extends AppCompatActivity {

    SharedPreferences preferencias;
    Toolbar toolbar;
    int id;
    TextView Txt_FechaHoy_Semanal;
    TextView Txt_Semanal;
    CalendarView Calendario_crl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semanal);

        preferencias = getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);
        id = preferencias.getInt("id", 1);

        toolbar = (Toolbar) findViewById(R.id.id_tb_toolbar);
        showToolbar(getResources().getString(R.string.ssemanal), true);

        Txt_FechaHoy_Semanal = (TextView) this.findViewById(R.id.Txt_FechaHoy_Semanal);
        Txt_Semanal = (TextView) this.findViewById(R.id.Txt_Semanal);
        Calendario_crl = (CalendarView) this.findViewById(R.id.Calendario_crl);

        Calendar c = Calendar.getInstance();
        String dia1 = Integer.toString(c.get(Calendar.DATE));
        String mes1 = Integer.toString(c.get(Calendar.MONTH));
        String annio1 = Integer.toString(c.get(Calendar.YEAR));
        String dia2 = Integer.toString(c.get(Calendar.DATE));
        String mes2 = Integer.toString(c.get(Calendar.MONTH));
        String annio2 = Integer.toString(c.get(Calendar.YEAR));

        long milliTime = c.getTimeInMillis();
        Calendario_crl.setDate(milliTime);

        Txt_FechaHoy_Semanal.setText(getResources().getString(R.string.delD) + " " + dia1 + " " + getResources().getString(R.string.de) + " " + Utilidades.get_mes(this, Integer.parseInt(mes1)) + " " + getResources().getString(R.string.de) + " " + annio1 + " " + getResources().getString(R.string.al) + " " + dia2 + " " + getResources().getString(R.string.de) + " " + Utilidades.get_mes(this, Integer.parseInt(mes2)) + " " + getResources().getString(R.string.de) + " " + annio2);
        Txt_Semanal.setText(Utilidades.get_semana(this, id));
    }

    public void showToolbar(String title, boolean upButton){
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }
}