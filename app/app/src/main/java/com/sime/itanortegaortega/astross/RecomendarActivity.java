package com.sime.itanortegaortega.astross;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Patterns;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class RecomendarActivity extends AppCompatActivity {

    SharedPreferences preferencias;
    Toolbar toolbar;
    int id;
    TextView Txt_Nombre_Signo_B = null;
    TextView Txt_Fechas_B = null;
    ImageView ImgBanner = null;
    TextView Txt_Email = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recomendar);

        preferencias = getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);
        id = preferencias.getInt("id", 1);

        toolbar = (Toolbar) findViewById(R.id.id_tb_toolbar);
        showToolbar(getResources().getString(R.string.srecom), true);

        Txt_Nombre_Signo_B = (TextView) this.findViewById(R.id.Txt_Nombre_Signo_Banner);
        Txt_Fechas_B = (TextView) this.findViewById(R.id.Txt_Fechas_Banner);
        ImgBanner = (ImageView) this.findViewById(R.id.ImgBanner);
        Txt_Email = (TextView) this.findViewById(R.id.Txt_Email);

        Txt_Nombre_Signo_B.setText(Utilidades.get_nombre_signo(this, id));
        Txt_Fechas_B.setText(Utilidades.get_fecha_signo(this, id));
        ImgBanner.setImageDrawable(Utilidades.get_imagen_signo(this, id));
    }

    public void showToolbar(String title, boolean upButton){
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

    public void recomendarApp(View view) {
        String text = getResources().getString(R.string.enviado) + " " + Txt_Email.getText();
        int duration = Toast.LENGTH_SHORT;
        Pattern pattern = Patterns.EMAIL_ADDRESS;

        if(Txt_Email.getText().toString().trim().isEmpty()){
            Toast toast = Toast.makeText(this, getResources().getString(R.string.vacio), duration);
            toast.show();
        }if(!pattern.matcher(Txt_Email.getText()).matches()){
            Toast toast = Toast.makeText(this, getResources().getString(R.string.correonovalido), duration);
            toast.show();
        }else{
            Toast toast = Toast.makeText(this, text, duration);
            toast.show();
            Txt_Email.setText("");
        }

    }
}