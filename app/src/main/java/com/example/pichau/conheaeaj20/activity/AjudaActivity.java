package com.example.pichau.conheaeaj20.activity;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.fabio.eaj.conheaeaj.R;


public class AjudaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajuda);

        ActionBar ab = getSupportActionBar();

        ab.setTitle("Ajuda");
        ab.setDisplayHomeAsUpEnabled(true);
    }
}
