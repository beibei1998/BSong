package com.example.bsong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class datongfang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datongfang);
        DatongSongs.setSongs();
        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ImageView blackwhiteImage=(ImageView) findViewById(R.id.choosing_blackwhite);
        blackwhiteImage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent playsong=new Intent(datongfang.this, com.example.bsong.playsongsofdatong.class);
                        playsong.putExtra("currentSongIndex",0);
                        startActivity(playsong);
                    }
                }
        );
        ImageView copymemoryImage=(ImageView) findViewById(R.id.choosing_copymemory);
        copymemoryImage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent playsong=new Intent(datongfang.this, com.example.bsong.playsongsofdatong.class);
                        playsong.putExtra("currentSongIndex",1);
                        startActivity(playsong);
                    }
                }
        );
        ImageView everycanImage=(ImageView) findViewById(R.id.choosing_everycan);
        everycanImage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent playsong=new Intent(datongfang.this, com.example.bsong.playsongsofdatong.class);
                        playsong.putExtra("currentSongIndex",2);
                        startActivity(playsong);
                    }
                }
        );
        ImageView hongdouImage=(ImageView) findViewById(R.id.choosing_hongdou);
        hongdouImage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent playsong=new Intent(datongfang.this, com.example.bsong.playsongsofdatong.class);
                        playsong.putExtra("currentSongIndex",3);
                        startActivity(playsong);
                    }
                }
        );
        ImageView loveloveloveImage=(ImageView) findViewById(R.id.choosing_lovelovelove);
        loveloveloveImage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent playsong=new Intent(datongfang.this, com.example.bsong.playsongsofdatong.class);
                        playsong.putExtra("currentSongIndex",4);
                        startActivity(playsong);
                    }
                }
        );
        ImageView loverofpoemImage=(ImageView) findViewById(R.id.choosing_loverofpoem);
        loverofpoemImage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent playsong=new Intent(datongfang.this, com.example.bsong.playsongsofdatong.class);
                        playsong.putExtra("currentSongIndex",5);
                        startActivity(playsong);
                    }
                }
        );
        ImageView singalongsongImage=(ImageView) findViewById(R.id.choosing_singalongsong);
        singalongsongImage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent playsong=new Intent(datongfang.this, com.example.bsong.playsongsofdatong.class);
                        playsong.putExtra("currentSongIndex",6);
                        startActivity(playsong);
                    }
                }
        );
        ImageView songforyouImage=(ImageView) findViewById(R.id.choosing_songforyou);
        songforyouImage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent playsong=new Intent(datongfang.this, com.example.bsong.playsongsofdatong.class);
                        playsong.putExtra("currentSongIndex",7);
                        startActivity(playsong);
                    }
                }
        );

    }


}
