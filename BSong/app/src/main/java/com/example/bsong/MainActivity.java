package com.example.bsong;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class  MainActivity extends AppCompatActivity {
    protected static MediaPlayer myplayer=new MediaPlayer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter);}
    protected void onStart(){
        super.onStart();
        FloatingActionButton Go_fab=(FloatingActionButton) findViewById(R.id.fab_Go);
        Go_fab.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,choosingsinger.class);
                startActivity(intent);
            }
        });
    }
    public void onBackPressed(){
        super.onBackPressed();
        if(myplayer!=null) {
            myplayer.stop();
            myplayer.release();
        }
        }
    }


