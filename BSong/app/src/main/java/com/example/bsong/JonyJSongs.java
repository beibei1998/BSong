package com.example.bsong;

import android.content.Intent;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

/**
 * Created by 张贝贝 on 2017/9/20.
 */

public class JonyJSongs {
    public static ArrayList<String> songs=new ArrayList<String>();
    public static ArrayList<Integer> songsImage=new ArrayList<Integer>();
    public static ArrayList<Integer> songsWords=new ArrayList<Integer>();
    public static ArrayList<Integer> songsSource=new ArrayList<Integer>();
    public static int size=0;
    public static void setSongs(){
        songs.add("callmelater");
        songsImage.add(R.drawable.callmelater);
        songsWords.add(R.string.callmelater);
        songsSource.add(R.raw.callmelater);
        songs.add("cannotleave");
        songsImage.add(R.drawable.cannotleave);
        songsWords.add(R.string.cannotleave);
        songsSource.add(R.raw.cannotleave);
        songs.add("fantasy");
        songsImage.add(R.drawable.fantasy);
        songsWords.add(R.string.fantasy);
        songsSource.add(R.raw.fantasy);
        songs.add("fireline");
        songsImage.add(R.drawable.fireline);
        songsWords.add(R.string.fireline);
        songsSource.add(R.raw.fireline);
        songs.add("inyourear");
        songsImage.add(R.drawable.inyourear);
        songsWords.add(R.string.inyourear);
        songsSource.add(R.raw.inyourear);
        songs.add("lost");
        songsImage.add(R.drawable.lost);
        songsWords.add(R.string.lost);
        songsSource.add(R.raw.lost);
        songs.add("mycity");
        songsImage.add(R.drawable.mycity);
        songsWords.add(R.string.mycity);
        songsSource.add(R.raw.mycity);
        songs.add("notguess");
        songsImage.add(R.drawable.notguess);
        songsWords.add(R.string.notguess);
        songsSource.add(R.raw.notguess);
        songs.add("player");
        songsImage.add(R.drawable.player);
        songsWords.add(R.string.player);
        songsSource.add(R.raw.player);
        songs.add("winter");
        songsImage.add(R.drawable.winter);
        songsWords.add(R.string.winter);
        songsSource.add(R.raw.winter);
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
