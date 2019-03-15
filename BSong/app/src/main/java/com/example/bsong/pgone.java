package com.example.bsong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class pgone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pgone);
        PgoneSongs.setSongs();
        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ImageView comicacheImage=(ImageView) findViewById(R.id.choosing_comicache);
        comicacheImage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent playsong=new Intent(pgone.this, com.example.bsong.playsongsofpgone.class);
                        playsong.putExtra("currentSongIndex",0);
                        startActivity(playsong);
                    }
                }
        );
        ImageView heImage=(ImageView) findViewById(R.id.choosing_he);
        heImage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent playsong=new Intent(pgone.this, com.example.bsong.playsongsofpgone.class);
                        playsong.putExtra("currentSongIndex",1);
                        startActivity(playsong);
                    }
                }
        );
        ImageView hmeImage=(ImageView) findViewById(R.id.choosing_hme);
        hmeImage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent playsong=new Intent(pgone.this, com.example.bsong.playsongsofpgone.class);
                        playsong.putExtra("currentSongIndex",2);
                        startActivity(playsong);
                    }
                }
        );


    }


}
