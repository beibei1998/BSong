package com.example.bsong;

import android.content.Intent;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

/**
 * Created by 张贝贝 on 2017/9/20.
 */

public class PgoneSongs {
    public static ArrayList<String> songs=new ArrayList<String>();
    public static ArrayList<Integer> songsImage=new ArrayList<Integer>();
    public static ArrayList<Integer> songsWords=new ArrayList<Integer>();
    public static ArrayList<Integer> songsSource=new ArrayList<Integer>();
    public static int size=0;
    public static void setSongs(){
        songs.add("comicache");
        songsImage.add(R.drawable.comicache);
        songsWords.add(R.string.comicache);
        songsSource.add(R.raw.comicache);
        songs.add("he");
        songsImage.add(R.drawable.he);
        songsWords.add(R.string.he);
        songsSource.add(R.raw.he);
        songs.add("hme");
        songsImage.add(R.drawable.hme);
        songsWords.add(R.string.hme);
        songsSource.add(R.raw.hme);
        size=songs.size();
    }
    public static String getSong(int index){
        String currentSong=songs.get(index);
        return currentSong;
    }
    public static int getBackImage(int index){
        return songsImage.get(index);
    }
    public static int getText(int index){
        return songsWords.get(index);
    }
    public static int getSongSource(int index){
        return songsSource.get(index);
    }
}
