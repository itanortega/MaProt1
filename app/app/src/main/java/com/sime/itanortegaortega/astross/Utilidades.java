package com.sime.itanortegaortega.astross;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * Created by itanortegaortega on 18/04/18.
 */

public class Utilidades {

    public static void redireccionar(AppCompatActivity act, MenuItem item, int i) {
        Intent intent;
        switch (item.getItemId()){
            case R.id.iteDiario:
                intent = new Intent(act,DiarioActivity.class);
                intent.putExtra("id", i);
                act.startActivity(intent);
                break;
            case R.id.iteSemanal:
                intent = new Intent(act,SemanalActivity.class);
                intent.putExtra("id", i);
                act.startActivity(intent);
                break;
            case R.id.iteComp:
                intent = new Intent(act,CompatibilidadActivity.class);
                intent.putExtra("id", i);
                act.startActivity(intent);
                break;
            case R.id.iteNum:
                intent = new Intent(act,NumerosActivity.class);
                intent.putExtra("id", i);
                act.startActivity(intent);
                break;
            case R.id.iteFon:
                intent = new Intent(act,FondosActivity.class);
                intent.putExtra("id", i);
                act.startActivity(intent);
                break;
            case R.id.itePNL:
                intent = new Intent(act,PnlActivity.class);
                intent.putExtra("id", i);
                act.startActivity(intent);
                break;
            case R.id.iteRecom:
                intent = new Intent(act,RecomendarActivity.class);
                intent.putExtra("id", i);
                act.startActivity(intent);
                break;
            case R.id.iteAbout:
                intent = new Intent(act,AboutActivity.class);
                intent.putExtra("id", i);
                act.startActivity(intent);
                break;
        }
    }

    public static String get_nombre_signo(Activity act, int id) {
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

    public static String get_fecha_signo(Activity act, int id) {
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

    public static Drawable get_imagen_signo(Activity act, int id) {
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

    public static String get_elemento(Activity act, int id) {
        String res = "";
        switch (id){
            case 1:
                res =  act.getResources().getString(R.string.aries_elemento);
                break;

            case 2:
                res = act.getResources().getString(R.string.tauro_elemento);
                break;

            case 3:
                res = act.getResources().getString(R.string.geminis_elemento);
                break;

            case 4:
                res = act.getResources().getString(R.string.cancer_elemento);
                break;

            case 5:
                res = act.getResources().getString(R.string.leo_elemento);
                break;

            case 6:
                res = act.getResources().getString(R.string.virgo_elemento);
                break;

            case 7:
                res = act.getResources().getString(R.string.libra_elemento);
                break;

            case 8:
                res = act.getResources().getString(R.string.escorpio_elemento);
                break;

            case 9:
                res = act.getResources().getString(R.string.sagitario_elemento);
                break;

            case 10:
                res = act.getResources().getString(R.string.capricornio_elemento);
                break;

            case 11:
                res = act.getResources().getString(R.string.acuario_elemento);
                break;

            case 12:
                res = act.getResources().getString(R.string.piscis_elemento);
                break;
        }
        return res;
    }

    public static String get_descripcion(Activity act, int id) {
        String res = "";
        switch (id){
            case 1:
                res =  act.getResources().getString(R.string.aries_descripcion);
                break;

            case 2:
                res = act.getResources().getString(R.string.tauro_descripcion);
                break;

            case 3:
                res = act.getResources().getString(R.string.geminis_descripcion);
                break;

            case 4:
                res = act.getResources().getString(R.string.cancer_descripcion);
                break;

            case 5:
                res = act.getResources().getString(R.string.leo_descripcion);
                break;

            case 6:
                res = act.getResources().getString(R.string.virgo_descripcion);
                break;

            case 7:
                res = act.getResources().getString(R.string.libra_descripcion);
                break;

            case 8:
                res = act.getResources().getString(R.string.escorpio_descripcion);
                break;

            case 9:
                res = act.getResources().getString(R.string.sagitario_descripcion);
                break;

            case 10:
                res = act.getResources().getString(R.string.capricornio_descripcion);
                break;

            case 11:
                res = act.getResources().getString(R.string.acuario_descripcion);
                break;

            case 12:
                res = act.getResources().getString(R.string.piscis_descripcion);
                break;
        }
        return res;
    }

    public static String get_virtudes(Activity act, int id) {
        String res = "";
        switch (id){
            case 1:
                res =  act.getResources().getString(R.string.aries_cualidades);
                break;

            case 2:
                res = act.getResources().getString(R.string.tauro_cualidades);
                break;

            case 3:
                res = act.getResources().getString(R.string.geminis_cualidades);
                break;

            case 4:
                res = act.getResources().getString(R.string.cancer_cualidades);
                break;

            case 5:
                res = act.getResources().getString(R.string.leo_cualidades);
                break;

            case 6:
                res = act.getResources().getString(R.string.virgo_cualidades);
                break;

            case 7:
                res = act.getResources().getString(R.string.libra_cualidades);
                break;

            case 8:
                res = act.getResources().getString(R.string.escorpio_cualidades);
                break;

            case 9:
                res = act.getResources().getString(R.string.sagitario_cualidades);
                break;

            case 10:
                res = act.getResources().getString(R.string.capricornio_cualidades);
                break;

            case 11:
                res = act.getResources().getString(R.string.acuario_cualidades);
                break;

            case 12:
                res = act.getResources().getString(R.string.piscis_cualidades);
                break;
        }
        return res;
    }

    public static String get_defectos(Activity act, int id) {
        String res = "";
        switch (id){
            case 1:
                res =  act.getResources().getString(R.string.aries_defectos);
                break;

            case 2:
                res = act.getResources().getString(R.string.tauro_defectos);
                break;

            case 3:
                res = act.getResources().getString(R.string.geminis_defectos);
                break;

            case 4:
                res = act.getResources().getString(R.string.cancer_defectos);
                break;

            case 5:
                res = act.getResources().getString(R.string.leo_defectos);
                break;

            case 6:
                res = act.getResources().getString(R.string.virgo_defectos);
                break;

            case 7:
                res = act.getResources().getString(R.string.libra_defectos);
                break;

            case 8:
                res = act.getResources().getString(R.string.escorpio_defectos);
                break;

            case 9:
                res = act.getResources().getString(R.string.sagitario_defectos);
                break;

            case 10:
                res = act.getResources().getString(R.string.capricornio_defectos);
                break;

            case 11:
                res = act.getResources().getString(R.string.acuario_defectos);
                break;

            case 12:
                res = act.getResources().getString(R.string.piscis_defectos);
                break;
        }
        return res;
    }

    public static String get_mes(Activity act, int id) {
        String res = "";
        switch (id){
            case 1:
                res =  act.getResources().getString(R.string.aries_defectos);
                break;

            case 2:
                res = act.getResources().getString(R.string.tauro_defectos);
                break;

            case 3:
                res = act.getResources().getString(R.string.geminis_defectos);
                break;

            case 4:
                res = act.getResources().getString(R.string.cancer_defectos);
                break;

            case 5:
                res = act.getResources().getString(R.string.leo_defectos);
                break;

            case 6:
                res = act.getResources().getString(R.string.virgo_defectos);
                break;

            case 7:
                res = act.getResources().getString(R.string.libra_defectos);
                break;

            case 8:
                res = act.getResources().getString(R.string.escorpio_defectos);
                break;

            case 9:
                res = act.getResources().getString(R.string.sagitario_defectos);
                break;

            case 10:
                res = act.getResources().getString(R.string.capricornio_defectos);
                break;

            case 11:
                res = act.getResources().getString(R.string.acuario_defectos);
                break;

            case 12:
                res = act.getResources().getString(R.string.piscis_defectos);
                break;
        }
        return res;
    }

    public static String get_diario(Activity act, int id) {
        String res = "";
        switch (id){
            case 1:
                res =  act.getResources().getString(R.string.aries_defectos);
                break;

            case 2:
                res = act.getResources().getString(R.string.tauro_defectos);
                break;

            case 3:
                res = act.getResources().getString(R.string.geminis_defectos);
                break;

            case 4:
                res = act.getResources().getString(R.string.cancer_defectos);
                break;

            case 5:
                res = act.getResources().getString(R.string.leo_defectos);
                break;

            case 6:
                res = act.getResources().getString(R.string.virgo_defectos);
                break;

            case 7:
                res = act.getResources().getString(R.string.libra_defectos);
                break;

            case 8:
                res = act.getResources().getString(R.string.escorpio_defectos);
                break;

            case 9:
                res = act.getResources().getString(R.string.sagitario_defectos);
                break;

            case 10:
                res = act.getResources().getString(R.string.capricornio_defectos);
                break;

            case 11:
                res = act.getResources().getString(R.string.acuario_defectos);
                break;

            case 12:
                res = act.getResources().getString(R.string.piscis_defectos);
                break;
        }
        return res;
    }

    public static String get_semana(Activity act, int id) {
        String res = "";
        switch (id){
            case 1:
                res =  act.getResources().getString(R.string.aries_defectos);
                break;

            case 2:
                res = act.getResources().getString(R.string.tauro_defectos);
                break;

            case 3:
                res = act.getResources().getString(R.string.geminis_defectos);
                break;

            case 4:
                res = act.getResources().getString(R.string.cancer_defectos);
                break;

            case 5:
                res = act.getResources().getString(R.string.leo_defectos);
                break;

            case 6:
                res = act.getResources().getString(R.string.virgo_defectos);
                break;

            case 7:
                res = act.getResources().getString(R.string.libra_defectos);
                break;

            case 8:
                res = act.getResources().getString(R.string.escorpio_defectos);
                break;

            case 9:
                res = act.getResources().getString(R.string.sagitario_defectos);
                break;

            case 10:
                res = act.getResources().getString(R.string.capricornio_defectos);
                break;

            case 11:
                res = act.getResources().getString(R.string.acuario_defectos);
                break;

            case 12:
                res = act.getResources().getString(R.string.piscis_defectos);
                break;
        }
        return res;
    }
}
