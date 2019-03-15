package com.example.bsong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class leoyu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leoyu);
        LeoYuSongs.setSongs();
        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ImageView iwannaImage=(ImageView) findViewById(R.id.choosing_iwanna);
        iwannaImage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent playsong=new Intent(leoyu.this, com.example.bsong.playsongsofleoyu.class);
                        playsong.putExtra("currentSongIndex",0);
                        startActivity(playsong);
                    }
                }
        );
        ImageView withyouImage=(ImageView) findViewById(R.id.choosing_bewithyou);
        withyouImage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent playsong=new Intent(leoyu.this, com.example.bsong.playsongsofleoyu.class);
                        playsong.putExtra("currentSongIndex",1);
                        startActivity(playsong);
                    }
                }
        );
        ImageView togetherImage=(ImageView) findViewById(R.id.choosing_together);
        togetherImage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent playsong=new Intent(leoyu.this, com.example.bsong.playsongsofleoyu.class);
                        playsong.putExtra("currentSongIndex",2);
                        startActivity(playsong);
                    }
                }
        );
        ImageView lovewordsImage=(ImageView) findViewById(R.id.choosing_lovewords);
        lovewordsImage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent playsong=new Intent(leoyu.this, com.example.bsong.playsongsofleoyu.class);
                        playsong.putExtra("currentSongIndex",3);
                        startActivity(playsong);
                    }
                }
        );
        ImageView dreamImage=(ImageView) findViewById(R.id.choosing_dream);
        dreamImage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent playsong=new Intent(leoyu.this, com.example.bsong.playsongsofleoyu.class);
                        playsong.putExtra("currentSongIndex",4);
                        startActivity(playsong);
                    }
                }
        );
        ImageView mamasaidImage=(ImageView) findViewById(R.id.choosing_mamasaid);
        mamasaidImage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent playsong=new Intent(leoyu.this, com.example.bsong.playsongsofleoyu.class);
                        playsong.putExtra("currentSongIndex",5);
                        startActivity(playsong);
                    }
                }
        );
        ImageView actorImage=(ImageView) findViewById(R.id.choosing_actor);
        actorImage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent playsong=new Intent(leoyu.this, com.example.bsong.playsongsofleoyu.class);
                        playsong.putExtra("currentSongIndex",6);
                        startActivity(playsong);
                    }
                }
        );
        ImageView solongImage=(ImageView) findViewById(R.id.choosing_solong);
        solongImage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent playsong=new Intent(leoyu.this, com.example.bsong.playsongsofleoyu.class);
                        playsong.putExtra("currentSongIndex",7);
                        startActivity(playsong);
                    }
                }
        );
        ImageView jiuchanImage=(ImageView) findViewById(R.id.choosing_jiuchan);
       jiuchanImage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent playsong=new Intent(leoyu.this, com.example.bsong.playsongsofleoyu.class);
                        playsong.putExtra("currentSongIndex",8);
                        startActivity(playsong);
                    }
                }
        );
        ImageView xiaomingImage=(ImageView) findViewById(R.id.choosing_xiaoming);
        xiaomingImage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent playsong=new Intent(leoyu.this, com.example.bsong.playsongsofleoyu.class);
                        playsong.putExtra("currentSongIndex",9);
                        startActivity(playsong);
                    }
                }
        );

    }


}
