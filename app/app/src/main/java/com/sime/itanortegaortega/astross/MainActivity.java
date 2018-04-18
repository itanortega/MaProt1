package com.sime.itanortegaortega.astross;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Txt_Nombre_Signo = null;
    TextView Txt_Fechas = null;
    ImageView ImgVCentral = null;
    int id=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Txt_Nombre_Signo = (TextView) this.findViewById(R.id.Txt_Nombre_Signo);
        Txt_Fechas = (TextView) this.findViewById(R.id.Txt_Fechas);
        ImgVCentral = (ImageView) this.findViewById(R.id.ImgVCentral);
        cambiarCentro(1);
    }

    public void setAries(View view) {
        cambiarCentro(1);
    }

    public void setTauro(View view) {
        cambiarCentro(2);
    }

    public void setGeminis(View view) {
        cambiarCentro(3);
    }

    public void setCancer(View view) {
        cambiarCentro(4);
    }

    public void setLeo(View view) {
        cambiarCentro(5);
    }

    public void setVirgo(View view) {
        cambiarCentro(6);
    }

    public void setLibra(View view) {
        cambiarCentro(7);
    }

    public void setEscorpio(View view) {
        cambiarCentro(8);
    }

    public void setSagitario(View view) {
        cambiarCentro(9);
    }

    public void setCapricornio(View view) {
        cambiarCentro(10);
    }

    public void setAcuario(View view) {
        cambiarCentro(11);
    }

    public void setPiscis(View view) {
        cambiarCentro(12);
    }

    private void cambiarCentro(int i) {
        id = i;
        Txt_Nombre_Signo.setText(Utilidades.get_nombre_signo(this, i));
        Txt_Fechas.setText(Utilidades.get_fecha_signo(this, i));
        ImgVCentral.setImageDrawable((Drawable) Utilidades.get_imagen_signo(this, i));
    }

    public void toSigno(View view) {
        Intent intent = new Intent(this, SignoActivity.class);
        intent.putExtra("id", id);
        startActivity(intent);
    }
}
