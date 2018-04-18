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
        switch (i){
            case 1:
                Txt_Nombre_Signo.setText(getResources().getString(R.string.aries));
                Txt_Fechas.setText(getResources().getString(R.string.aries_f));
                ImgVCentral.setImageDrawable(getResources().getDrawable(R.drawable.aries));
                break;

            case 2:
                Txt_Nombre_Signo.setText(getResources().getString(R.string.tauro));
                Txt_Fechas.setText(getResources().getString(R.string.tauro_f));
                ImgVCentral.setImageDrawable(getResources().getDrawable(R.drawable.tauro));
                break;

            case 3:
                Txt_Nombre_Signo.setText(getResources().getString(R.string.geminis));
                Txt_Fechas.setText(getResources().getString(R.string.geminis_f));
                ImgVCentral.setImageDrawable(getResources().getDrawable(R.drawable.geminis));
                break;

            case 4:
                Txt_Nombre_Signo.setText(getResources().getString(R.string.cancer));
                Txt_Fechas.setText(getResources().getString(R.string.cancer_f));
                ImgVCentral.setImageDrawable(getResources().getDrawable(R.drawable.cancer));
                break;

            case 5:
                Txt_Nombre_Signo.setText(getResources().getString(R.string.leo));
                Txt_Fechas.setText(getResources().getString(R.string.leo_f));
                ImgVCentral.setImageDrawable(getResources().getDrawable(R.drawable.leo));
                break;

            case 6:
                Txt_Nombre_Signo.setText(getResources().getString(R.string.virgo));
                Txt_Fechas.setText(getResources().getString(R.string.virgo_f));
                ImgVCentral.setImageDrawable(getResources().getDrawable(R.drawable.virgo));
                break;

            case 7:
                Txt_Nombre_Signo.setText(getResources().getString(R.string.libra));
                Txt_Fechas.setText(getResources().getString(R.string.libra_f));
                ImgVCentral.setImageDrawable(getResources().getDrawable(R.drawable.libra));
                break;

            case 8:
                Txt_Nombre_Signo.setText(getResources().getString(R.string.escorpio));
                Txt_Fechas.setText(getResources().getString(R.string.escorpio_f));
                ImgVCentral.setImageDrawable(getResources().getDrawable(R.drawable.escorpio));
                break;

            case 9:
                Txt_Nombre_Signo.setText(getResources().getString(R.string.sagitario));
                Txt_Fechas.setText(getResources().getString(R.string.sagitario_f));
                ImgVCentral.setImageDrawable(getResources().getDrawable(R.drawable.sagitario));
                break;

            case 10:
                Txt_Nombre_Signo.setText(getResources().getString(R.string.carpicornio));
                Txt_Fechas.setText(getResources().getString(R.string.capricornio_f));
                ImgVCentral.setImageDrawable(getResources().getDrawable(R.drawable.capricornio));
                break;

            case 11:
                Txt_Nombre_Signo.setText(getResources().getString(R.string.acuario));
                Txt_Fechas.setText(getResources().getString(R.string.acuario_f));
                ImgVCentral.setImageDrawable(getResources().getDrawable(R.drawable.acuario));
                break;

            case 12:
                Txt_Nombre_Signo.setText(getResources().getString(R.string.piscis));
                Txt_Fechas.setText(getResources().getString(R.string.piscis_f));
                ImgVCentral.setImageDrawable(getResources().getDrawable(R.drawable.piscis));
                break;
        }
    }

    public void toSigno(View view) {
        Intent intent = new Intent(this, SignoActivity.class);
        intent.putExtra("id", id);
        startActivity(intent);
    }
}
