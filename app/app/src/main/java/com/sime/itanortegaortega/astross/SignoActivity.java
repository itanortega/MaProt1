package com.sime.itanortegaortega.astross;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SignoActivity extends AppCompatActivity {

    int id;
    TextView Txt_Nombre_Signo_B = null;
    TextView Txt_Fechas_B = null;
    ImageView ImgBanner = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signo);
        Intent intent = getIntent();
        Txt_Nombre_Signo_B = (TextView) this.findViewById(R.id.Txt_Nombre_Signo_Banner);
        Txt_Fechas_B = (TextView) this.findViewById(R.id.Txt_Fechas_Banner);
        ImgBanner = (ImageView) this.findViewById(R.id.ImgBanner);
        id = (int) intent.getIntExtra("id", 1);
        cambiarBanner(id);
    }

    private void cambiarBanner(int i) {
        id = i;
        switch (i){
            case 1:
                Txt_Nombre_Signo_B.setText(getResources().getString(R.string.aries));
                Txt_Fechas_B.setText(getResources().getString(R.string.aries_f));
                ImgBanner.setImageDrawable(getResources().getDrawable(R.drawable.aries));
                break;

            case 2:
                Txt_Nombre_Signo_B.setText(getResources().getString(R.string.tauro));
                Txt_Fechas_B.setText(getResources().getString(R.string.tauro_f));
                ImgBanner.setImageDrawable(getResources().getDrawable(R.drawable.tauro));
                break;

            case 3:
                Txt_Nombre_Signo_B.setText(getResources().getString(R.string.geminis));
                Txt_Fechas_B.setText(getResources().getString(R.string.geminis_f));
                ImgBanner.setImageDrawable(getResources().getDrawable(R.drawable.geminis));
                break;

            case 4:
                Txt_Nombre_Signo_B.setText(getResources().getString(R.string.cancer));
                Txt_Fechas_B.setText(getResources().getString(R.string.cancer_f));
                ImgBanner.setImageDrawable(getResources().getDrawable(R.drawable.cancer));
                break;

            case 5:
                Txt_Nombre_Signo_B.setText(getResources().getString(R.string.leo));
                Txt_Fechas_B.setText(getResources().getString(R.string.leo_f));
                ImgBanner.setImageDrawable(getResources().getDrawable(R.drawable.leo));
                break;

            case 6:
                Txt_Nombre_Signo_B.setText(getResources().getString(R.string.virgo));
                Txt_Fechas_B.setText(getResources().getString(R.string.virgo_f));
                ImgBanner.setImageDrawable(getResources().getDrawable(R.drawable.virgo));
                break;

            case 7:
                Txt_Nombre_Signo_B.setText(getResources().getString(R.string.libra));
                Txt_Fechas_B.setText(getResources().getString(R.string.libra_f));
                ImgBanner.setImageDrawable(getResources().getDrawable(R.drawable.libra));
                break;

            case 8:
                Txt_Nombre_Signo_B.setText(getResources().getString(R.string.escorpio));
                Txt_Fechas_B.setText(getResources().getString(R.string.escorpio_f));
                ImgBanner.setImageDrawable(getResources().getDrawable(R.drawable.escorpio));
                break;

            case 9:
                Txt_Nombre_Signo_B.setText(getResources().getString(R.string.sagitario));
                Txt_Fechas_B.setText(getResources().getString(R.string.sagitario_f));
                ImgBanner.setImageDrawable(getResources().getDrawable(R.drawable.sagitario));
                break;

            case 10:
                Txt_Nombre_Signo_B.setText(getResources().getString(R.string.carpicornio));
                Txt_Fechas_B.setText(getResources().getString(R.string.capricornio_f));
                ImgBanner.setImageDrawable(getResources().getDrawable(R.drawable.capricornio));
                break;

            case 11:
                Txt_Nombre_Signo_B.setText(getResources().getString(R.string.acuario));
                Txt_Fechas_B.setText(getResources().getString(R.string.acuario_f));
                ImgBanner.setImageDrawable(getResources().getDrawable(R.drawable.acuario));
                break;

            case 12:
                Txt_Nombre_Signo_B.setText(getResources().getString(R.string.piscis));
                Txt_Fechas_B.setText(getResources().getString(R.string.piscis_f));
                ImgBanner.setImageDrawable(getResources().getDrawable(R.drawable.piscis));
                break;
        }
    }
}
