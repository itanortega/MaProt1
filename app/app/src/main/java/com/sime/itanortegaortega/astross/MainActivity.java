package com.sime.itanortegaortega.astross;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener {
    private GestureDetector gDetector;
    SharedPreferences preferencias;

    TextView Txt_Nombre_Signo = null;
    TextView Txt_Fechas = null;
    ImageView ImgVCentral = null;
    int id=1;


    LinearLayout L_Aries = null;
    LinearLayout L_Tauro = null;
    LinearLayout L_Geminis = null;
    LinearLayout L_Cancer = null;
    LinearLayout L_Leo = null;
    LinearLayout L_Virgo = null;
    LinearLayout L_Libra = null;
    LinearLayout L_Escorpio = null;
    LinearLayout L_Sagitario = null;
    LinearLayout L_Capricornio = null;
    LinearLayout L_Acuario = null;
    LinearLayout L_Piscis = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Txt_Nombre_Signo = (TextView) this.findViewById(R.id.Txt_Nombre_Signo);
        Txt_Fechas = (TextView) this.findViewById(R.id.Txt_Fechas);
        ImgVCentral = (ImageView) this.findViewById(R.id.ImgVCentral);

        L_Aries = (LinearLayout) this.findViewById(R.id.L_Aries);
        L_Tauro = (LinearLayout) this.findViewById(R.id.L_Tauro);
        L_Geminis = (LinearLayout) this.findViewById(R.id.L_Geminis);
        L_Cancer = (LinearLayout) this.findViewById(R.id.L_Cancer);
        L_Leo = (LinearLayout) this.findViewById(R.id.L_Leo);
        L_Virgo = (LinearLayout) this.findViewById(R.id.L_Virgo);
        L_Libra = (LinearLayout) this.findViewById(R.id.L_Libra);
        L_Escorpio = (LinearLayout) this.findViewById(R.id.L_Escorpio);
        L_Sagitario = (LinearLayout) this.findViewById(R.id.L_Sagitario);
        L_Capricornio = (LinearLayout) this.findViewById(R.id.L_Capricornio);
        L_Acuario = (LinearLayout) this.findViewById(R.id.L_Acuario);
        L_Piscis = (LinearLayout) this.findViewById(R.id.L_Piscis);


        preferencias = getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);
        id = preferencias.getInt("id", 1);
        cambiarCentro(preferencias.getInt("id", 1));

        gDetector = new GestureDetector(this);
        //rotar("R",id*30);
    }


    @Override
    public boolean onTouchEvent(MotionEvent me) {
        return gDetector.onTouchEvent(me);
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
        SharedPreferences.Editor editor = preferencias.edit();
        editor.putInt("id", i);
        editor.commit();

        Txt_Nombre_Signo.setText(Utilidades.get_nombre_signo(this, i));
        Txt_Fechas.setText(Utilidades.get_fecha_signo(this, i));
        ImgVCentral.setImageDrawable((Drawable) Utilidades.get_imagen_signo(this, i));
    }

    public void toSigno(View view) {
        Intent intent = new Intent(this, SignoActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        try {
            float diffY = e2.getY() - e1.getY();
            float diffX = e2.getX() - e1.getX();
            if (Math.abs(diffX) > Math.abs(diffY)) {
                if (diffX > 0) {
                    rotar("R", 30);
                } else {
                    rotar("L", 30);
                }
            } else {
                if (diffY > 0) {
                    rotar("D", 30);
                } else {
                    rotar("U", 30);
                }
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return false;
    }

    private void rotar(String direccion, int grados) {
        ConstraintLayout.LayoutParams layoutParams;
        int valNewAngle = grados;

        if(direccion.equals("R") || direccion.equals("U")){
            valNewAngle = grados;
            if(id==12){
                id = 1;
            }else{
                id++;
            }
        }else{
            valNewAngle = -1 * grados;
            if(id==1){
                id = 12;
            }else{
                id--;
            }
        }

        layoutParams = (ConstraintLayout.LayoutParams) L_Aries.getLayoutParams();
        layoutParams.circleAngle = layoutParams.circleAngle + valNewAngle;
        L_Aries.setLayoutParams(layoutParams);

        layoutParams = (ConstraintLayout.LayoutParams) L_Tauro.getLayoutParams();
        layoutParams.circleAngle = layoutParams.circleAngle + valNewAngle;
        L_Tauro.setLayoutParams(layoutParams);

        layoutParams = (ConstraintLayout.LayoutParams) L_Geminis.getLayoutParams();
        layoutParams.circleAngle = layoutParams.circleAngle + valNewAngle;
        L_Geminis.setLayoutParams(layoutParams);

        layoutParams = (ConstraintLayout.LayoutParams) L_Cancer.getLayoutParams();
        layoutParams.circleAngle = layoutParams.circleAngle + valNewAngle;
        L_Cancer.setLayoutParams(layoutParams);

        layoutParams = (ConstraintLayout.LayoutParams) L_Leo.getLayoutParams();
        layoutParams.circleAngle = layoutParams.circleAngle + valNewAngle;
        L_Leo.setLayoutParams(layoutParams);

        layoutParams = (ConstraintLayout.LayoutParams) L_Virgo.getLayoutParams();
        layoutParams.circleAngle = layoutParams.circleAngle + valNewAngle;
        L_Virgo.setLayoutParams(layoutParams);

        layoutParams = (ConstraintLayout.LayoutParams) L_Libra.getLayoutParams();
        layoutParams.circleAngle = layoutParams.circleAngle + valNewAngle;
        L_Libra.setLayoutParams(layoutParams);

        layoutParams = (ConstraintLayout.LayoutParams) L_Escorpio.getLayoutParams();
        layoutParams.circleAngle = layoutParams.circleAngle + valNewAngle;
        L_Escorpio.setLayoutParams(layoutParams);

        layoutParams = (ConstraintLayout.LayoutParams) L_Sagitario.getLayoutParams();
        layoutParams.circleAngle = layoutParams.circleAngle + valNewAngle;
        L_Sagitario.setLayoutParams(layoutParams);

        layoutParams = (ConstraintLayout.LayoutParams) L_Capricornio.getLayoutParams();
        layoutParams.circleAngle = layoutParams.circleAngle + valNewAngle;
        L_Capricornio.setLayoutParams(layoutParams);

        layoutParams = (ConstraintLayout.LayoutParams) L_Acuario.getLayoutParams();
        layoutParams.circleAngle = layoutParams.circleAngle + valNewAngle;
        L_Acuario.setLayoutParams(layoutParams);

        layoutParams = (ConstraintLayout.LayoutParams) L_Piscis.getLayoutParams();
        layoutParams.circleAngle = layoutParams.circleAngle + valNewAngle;
        L_Piscis.setLayoutParams(layoutParams);

        cambiarCentro(id);
    }
}
