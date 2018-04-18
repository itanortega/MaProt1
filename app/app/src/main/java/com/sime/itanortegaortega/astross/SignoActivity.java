package com.sime.itanortegaortega.astross;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class SignoActivity extends AppCompatActivity {

    Toolbar toolbar;
    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signo);

        Intent intent = getIntent();
        this.id = (int) intent.getIntExtra("id", 1);

        toolbar = (Toolbar) findViewById(R.id.id_tb_toolbar);
        showToolbar(Utilidades.get_nombre_signo(this, id), true);
    }

    public void showToolbar(String title, boolean upButton){
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Utilidades.redireccionar(this, item, 1);
        return super.onOptionsItemSelected(item);
    }
}
