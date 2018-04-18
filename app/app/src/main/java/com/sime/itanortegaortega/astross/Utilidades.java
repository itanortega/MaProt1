package com.sime.itanortegaortega.astross;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

class Utilidades {


    public String get_nombre_signo(Activity act, int id) {
        String res;
        res = act.getResources().getString(R.string.aries);
        switch (id){
            case 1:
                res =  act.getResources().getString(R.string.aries);
                break;

            case 2:
                res = act.getResources().getString(R.string.tauro);
                break;

            case 3:
                res = act.getResources().getString(R.string.geminis);
                break;

            case 4:
                res = act.getResources().getString(R.string.cancer);
                break;

            case 5:
                res = act.getResources().getString(R.string.leo);
                break;

            case 6:
                res = act.getResources().getString(R.string.virgo);
                break;

            case 7:
                res = act.getResources().getString(R.string.libra);
                break;

            case 8:
                res = act.getResources().getString(R.string.escorpio);
                break;

            case 9:
                res = act.getResources().getString(R.string.sagitario);
                break;

            case 10:
                res = act.getResources().getString(R.string.capricornio);
                break;

            case 11:
                res = act.getResources().getString(R.string.acuario);
                break;

            case 12:
                res = act.getResources().getString(R.string.piscis);
                break;
        }
        return res;
    }

    public String get_fecha_signo(Activity act, int id) {
        String res = "";
        switch (id){
            case 1:
                res =  act.getResources().getString(R.string.aries_f);
                break;

            case 2:
                res = act.getResources().getString(R.string.tauro_f);
                break;

            case 3:
                res = act.getResources().getString(R.string.geminis_f);
                break;

            case 4:
                res = act.getResources().getString(R.string.cancer_f);
                break;

            case 5:
                res = act.getResources().getString(R.string.leo_f);
                break;

            case 6:
                res = act.getResources().getString(R.string.virgo_f);
                break;

            case 7:
                res = act.getResources().getString(R.string.libra_f);
                break;

            case 8:
                res = act.getResources().getString(R.string.escorpio_f);
                break;

            case 9:
                res = act.getResources().getString(R.string.sagitario_f);
                break;

            case 10:
                res = act.getResources().getString(R.string.capricornio_f);
                break;

            case 11:
                res = act.getResources().getString(R.string.acuario_f);
                break;

            case 12:
                res = act.getResources().getString(R.string.piscis_f);
                break;
        }
        return res;
    }

    public Drawable get_imagen_signo(Activity act, int id) {
        Drawable res = act.getResources().getDrawable(R.drawable.aries);;
        switch (id){
            case 1:
                res =  act.getResources().getDrawable(R.drawable.aries);
                break;

            case 2:
                res =  act.getResources().getDrawable(R.drawable.tauro);
                break;

            case 3:
                res =  act.getResources().getDrawable(R.drawable.geminis);
                break;

            case 4:
                res =  act.getResources().getDrawable(R.drawable.cancer);
                break;

            case 5:
                res =  act.getResources().getDrawable(R.drawable.leo);
                break;

            case 6:
                res =  act.getResources().getDrawable(R.drawable.virgo);
                break;

            case 7:
                res =  act.getResources().getDrawable(R.drawable.libra);
                break;

            case 8:
                res =  act.getResources().getDrawable(R.drawable.escorpio);
                break;

            case 9:
                res =  act.getResources().getDrawable(R.drawable.sagitario);
                break;

            case 10:
                res =  act.getResources().getDrawable(R.drawable.capricornio);
                break;

            case 11:
                res =  act.getResources().getDrawable(R.drawable.acuario);
                break;

            case 12:
                res =  act.getResources().getDrawable(R.drawable.piscis);
                break;
        }
        return res;
    }

    public void redireccionar(Activity act, MenuItem item, int id) {


        Class destino = null;
        switch (item.getItemId()){
            case R.id.iteDiario:
                destino = DiarioActivity.class;
                break;
            case R.id.iteSemanal:
                destino = SemanalActivity.class;
                break;
            case R.id.iteComp:
                destino = CompatibilidadActivity.class;
                break;
            case R.id.iteNum:
                destino = NumerosActivity.class;
                break;
            case R.id.iteFon:
                destino = FondosActivity.class;
                break;
            case R.id.itePNL:
                destino = PnlActivity.class;
                break;
            case R.id.iteRecom:
                destino = RecomendarActivity.class;
                break;
            case R.id.iteAbout:
                destino = AboutActivity.class;
                break;
        }

        Intent intent = new Intent(act, destino);
        act.startActivity(intent);
    }
}
