package com.example.bsong;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.annotation.StringDef;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.xml.sax.DTDHandler;

public class playsongsofdatong extends AppCompatActivity {
    //////////////////////////////
    private boolean order=false;
    private int currentSongIndex=0;
    private String currentSong=" ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playsong);
        //////////////////////////////////////////////////
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    protected void onStart(){
        super.onStart();
        Intent intent=getIntent();
        order=intent.getBooleanExtra("order",false);
        currentSongIndex=intent.getIntExtra("currentSongIndex",0);
        currentSong= DatongSongs.getSong(currentSongIndex);
        LinearLayout background=(LinearLayout) findViewById(R.id.background);
        background.setBackgroundResource(DatongSongs.getBackImage(currentSongIndex));
        TextView text=(TextView)findViewById(R.id.songwords);
        text.setText(DatongSongs.getText(currentSongIndex));
        if(MainActivity.myplayer.isPlaying()){
            if(CurrentSong.getCurrentSong().equals(currentSong)){
////////////////////////////////////////
            }else{
                startsong();
                /////////////////////////////////////
            }
        }else{
            startsong();
            //////////////////////////////////
        }
        Button playleftButton=(Button) findViewById(R.id.left);
        playleftButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                order=false;
                Intent intent=new Intent(playsongsofdatong.this,playsongsofdatong.class);
                if(currentSongIndex==0){
                    intent.putExtra("currentSongIndex",DatongSongs.size-1);
                }else{
                    intent.putExtra("currentSongIndex",currentSongIndex-1);
                }
                //////////////////////////////////////////////////
                startActivity(intent);
            }
        });
        final Button playandpauseButton=(Button) findViewById(R.id.play);
        final Drawable playImage=getDrawable(R.drawable.play);
        final Drawable pauseImage=getDrawable(R.drawable.pause);
        playandpauseButton.setBackground(playImage);
        playandpauseButton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                if(MainActivity.myplayer.isPlaying()){
                    MainActivity.myplayer.pause();
                    playandpauseButton.setBackground(pauseImage);
                }else{
                    MainActivity.myplayer.start();
                    playandpauseButton.setBackground(playImage);
                }
            }
        });
        Button playrightButton=(Button) findViewById(R.id.right);
        playrightButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                order=false;
                Intent intent=new Intent(playsongsofdatong.this,playsongsofdatong.class);
                if(currentSongIndex==(DatongSongs.size-1)){
                    intent.putExtra("currentSongIndex",0);
                }else{
                    intent.putExtra("currentSongIndex",currentSongIndex+1);
                }
                ////////////////////////////////////////////////
                startActivity(intent);
            }
        });
        Button circleButton=(Button) findViewById(R.id.circle);
        circleButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                order=false;
                MainActivity.myplayer.setLooping(true);
            }
        });
        Button orderButton=(Button) findViewById(R.id.order);
        orderButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                MainActivity.myplayer.setLooping(false);
                order=true;
            }
        });
        Button resetButton=(Button) findViewById(R.id.reset);
        resetButton.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               resetplayer();
                                           }
                                       }
        );
        MainActivity.myplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                if(order){
                    Intent intent=new Intent(playsongsofdatong.this,playsongsofdatong.class);
                    if(currentSongIndex==(DatongSongs.size-1)){
                        intent.putExtra("currentSongIndex",0);
                    }else{
                        intent.putExtra("currentSongIndex",currentSongIndex+1);
                    }
                    /////////////////////////////////////////////////////
                    intent.putExtra("order",order);
                    startActivity(intent);
                }
                else{
                    if(MainActivity.myplayer.isPlaying()){
                        playandpauseButton.setBackground(playImage);
                    }else{
                        playandpauseButton.setBackground(pauseImage);

                    }
                }
            }
        });
    }
    private void startsong(){
        /////////////////////////////////////////
        try {
            MainActivity.myplayer.reset();
            MainActivity.myplayer = MediaPlayer.create(playsongsofdatong.this, DatongSongs.getSongSource(currentSongIndex));
            //////////////////////////////////////////////
            CurrentSong.setCurrentSong(currentSong);
            //////////////////////////////////////////////
            MainActivity.myplayer.start();
        }catch (Exception e){
            Toast.makeText(playsongsofdatong.this,"wrong",Toast.LENGTH_SHORT).show();
        }
    }
    private void resetplayer() {
        startsong();
        ///////////////////////////////////////////////
    }
    public void onBackPressed(){
        Intent intent=new Intent(playsongsofdatong.this,datongfang.class);
        startActivity(intent);
    }

}



