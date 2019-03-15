package com.example.bsong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class jonyj extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jonyj);
        JonyJSongs.setSongs();
        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ImageView callmelaterImage=(ImageView) findViewById(R.id.choosing_callmelater);
        callmelaterImage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent playsong=new Intent(jonyj.this, com.example.bsong.playsongsofjonyj.class);
                        playsong.putExtra("currentSongIndex",0);
                        startActivity(playsong);
                    }
                }
        );
        ImageView cannotleaveImage=(ImageView) findViewById(R.id.choosing_cannotleave);
        cannotleaveImage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent playsong=new Intent(jonyj.this, com.example.bsong.playsongsofjonyj.class);
                        playsong.putExtra("currentSongIndex",1);
                        startActivity(playsong);
                    }
                }
        );
        ImageView fantasyImage=(ImageView) findViewById(R.id.choosing_fantasy);
        fantasyImage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent playsong=new Intent(jonyj.this, com.example.bsong.playsongsofjonyj.class);
                        playsong.putExtra("currentSongIndex",2);
                        startActivity(playsong);
                    }
                }
        );
        ImageView firelineImage=(ImageView) findViewById(R.id.choosing_fireline);
        firelineImage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent playsong=new Intent(jonyj.this, com.example.bsong.playsongsofjonyj.class);
                        playsong.putExtra("currentSongIndex",3);
                        startActivity(playsong);
                    }
                }
        );
        ImageView inyourearImage=(ImageView) findViewById(R.id.choosing_inyourear);
        inyourearImage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent playsong=new Intent(jonyj.this, com.example.bsong.playsongsofjonyj.class);
                        playsong.putExtra("currentSongIndex",4);
                        startActivity(playsong);
                    }
                }
        );
        ImageView lostImage=(ImageView) findViewById(R.id.choosing_lost);
        lostImage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent playsong=new Intent(jonyj.this, com.example.bsong.playsongsofjonyj.class);
                        playsong.putExtra("currentSongIndex",5);
                        startActivity(playsong);
                    }
                }
        );
        ImageView mycityImage=(ImageView) findViewById(R.id.choosing_mycity);
        mycityImage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent playsong=new Intent(jonyj.this, com.example.bsong.playsongsofjonyj.class);
                        playsong.putExtra("currentSongIndex",6);
                        startActivity(playsong);
                    }
                }
        );
        ImageView notguessImage=(ImageView) findViewById(R.id.choosing_notguess);
        notguessImage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent playsong=new Intent(jonyj.this, com.example.bsong.playsongsofjonyj.class);
                        playsong.putExtra("currentSongIndex",7);
                        startActivity(playsong);
                    }
                }
        );
        ImageView playerImage=(ImageView) findViewById(R.id.choosing_player);
        playerImage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent playsong=new Intent(jonyj.this, com.example.bsong.playsongsofjonyj.class);
                        playsong.putExtra("currentSongIndex",8);
                        startActivity(playsong);
                    }
                }
        );
        ImageView winterImage=(ImageView) findViewById(R.id.choosing_winter);
        winterImage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent playsong=new Intent(jonyj.this, com.example.bsong.playsongsofjonyj.class);
                        playsong.putExtra("currentSongIndex",9);
                        startActivity(playsong);
                    }
                }
        );

    }


}
