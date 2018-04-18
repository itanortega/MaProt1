package com.sime.itanortegaortega.astross;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class SignoActivity extends AppCompatActivity {

    int id;
    TextView Txt_Nombre_Signo_B = null;
    TextView Txt_Fechas_B = null;
    ImageView ImgBanner = null;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signo);
        Intent intent = getIntent();
        Txt_Nombre_Signo_B = (TextView) this.findViewById(R.id.Txt_Nombre_Signo_Banner);
        Txt_Fechas_B = (TextView) this.findViewById(R.id.Txt_Fechas_Banner);
        ImgBanner = (ImageView) this.findViewById(R.id.ImgBanner);
        id = (int) intent.getIntExtra("id", 1);
        cambiarBanner();
        toolbar = (Toolbar) findViewById(R.id.id_tb_toolbar);

        showToolbar("titulo", true);
    }

    public void showToolbar(String title, boolean upButton){
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(getResources().getString(R.string.aries));
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Utilidades md = new Utilidades();
        md.redireccionar(this, item, id);
        return true;
    }

    private void cambiarBanner() {
        /*Utilidades utilidades = new Utilidades();
        Txt_Nombre_Signo_B.setText(utilidades.getNombreSigno(id));
        Txt_Fechas_B.setText(utilidades.getFechasSigno(id));
        ImgBanner.setImageDrawable(utilidades.getImagenSigno(id));*/
    }
}
