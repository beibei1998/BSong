package com.example.bsong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class choosingsinger extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosingsinger);}
    protected void onStart() {
        super.onStart();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final ImageView leoyu = (ImageView) findViewById(R.id.iamge_leoYu);
        leoyu.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent leoyusongs = new Intent(choosingsinger.this, leoyu.class);
                        startActivity(leoyusongs);
                    }
                }
        );
        final ImageView jonyj=(ImageView) findViewById(R.id.image_jonyj);
        jonyj.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent jonyjsongs=new Intent(choosingsinger.this,jonyj.class);
                        startActivity(jonyjsongs);
                    }
                }
        );
        final ImageView datong=(ImageView) findViewById(R.id.image_khalilfong);
        datong.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent datongsongs=new Intent(choosingsinger.this,datongfang.class);
                        startActivity(datongsongs);
                    }
                }
        );
        final ImageView pgone=(ImageView) findViewById(R.id.image_pgone);
        pgone.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent pgonesongs=new Intent(choosingsinger.this,pgone.class);
                        startActivity(pgonesongs);
                    }
                }
        );

    }
}
