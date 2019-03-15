package com.example.bsong;

import android.content.Intent;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

/**
 * Created by 张贝贝 on 2017/9/20.
 */

public class DatongSongs {
    public static ArrayList<String> songs=new ArrayList<String>();
    public static ArrayList<Integer> songsImage=new ArrayList<Integer>();
    public static ArrayList<Integer> songsWords=new ArrayList<Integer>();
    public static ArrayList<Integer> songsSource=new ArrayList<Integer>();
    public static int size=0;
    public static void setSongs(){
        songs.add("blackwhite");
        songsImage.add(R.drawable.blackwhite);
        songsWords.add(R.string.blackwhite);
        songsSource.add(R.raw.blackwhite);
        songs.add("copymemory");
        songsImage.add(R.drawable.copymemory);
        songsWords.add(R.string.copymemory);
        songsSource.add(R.raw.copymemory);
        songs.add("everycan");
        songsImage.add(R.drawable.everycan);
        songsWords.add(R.string.everycan);
        songsSource.add(R.raw.everycan);
        songs.add("hongdou");
        songsImage.add(R.drawable.hongdou);
        songsWords.add(R.string.hongdou);
        songsSource.add(R.raw.hongdou);
        songs.add("lovelovelove");
        songsImage.add(R.drawable.lovelovelove);
        songsWords.add(R.string.lovelovelove);
        songsSource.add(R.raw.lovelovelove);
        songs.add("loverofpoem");
        songsImage.add(R.drawable.loverofpoem);
        songsWords.add(R.string.loverofpoem);
        songsSource.add(R.raw.loverofpoem);
        songs.add("singalongsong");
        songsImage.add(R.drawable.singalongsong);
        songsWords.add(R.string.singalongsong);
        songsSource.add(R.raw.singalongsong);
        songs.add("songforyou");
        songsImage.add(R.drawable.songforyou);
        songsWords.add(R.string.songforyou);
        songsSource.add(R.raw.songforyou);
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
