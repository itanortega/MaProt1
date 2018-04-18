package com.sime.itanortegaortega.astross;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class RecomendarActivity extends AppCompatActivity {

    int id;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recomendar);
        Intent intent = getIntent();
        id = (int) intent.getIntExtra("id", 1);
        toolbar = (Toolbar) findViewById(R.id.id_tb_toolbar);

        showToolbar("titulo", true);
    }

    public void showToolbar(String title, boolean upButton){
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(getResources().getString(R.string.srecom));
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
}