package com.example.bsong;

import android.content.Intent;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

/**
 * Created by 张贝贝 on 2017/9/19.
 */

public class LeoYuSongs {
    public static ArrayList<String> songs=new ArrayList<String>();
    public static ArrayList<Integer> songsImage=new ArrayList<Integer>();
    public static ArrayList<Integer> songsWords=new ArrayList<Integer>();
    public static ArrayList<Integer> songsSource=new ArrayList<Integer>();
    public static int size=0;
    public static void setSongs(){
        songs.add("iwanna");
        songsImage.add(R.drawable.iwanna);
        songsWords.add(R.string.iwanna);
        songsSource.add(R.raw.iwanna);
        songs.add("withyou");
        songsImage.add(R.drawable.withyou);
        songsWords.add(R.string.withyou);
        songsSource.add(R.raw.withyou);
        songs.add("together");
        songsImage.add(R.drawable.together);
        songsWords.add(R.string.together);
        songsSource.add(R.raw.together);
        songs.add("lovewords");
        songsImage.add(R.drawable.lovewords);
        songsWords.add(R.string.lovewords);
        songsSource.add(R.raw.lovewords);
        songs.add("dream");
        songsImage.add(R.drawable.dream);
        songsWords.add(R.string.dream);
        songsSource.add(R.raw.dream);
        songs.add("mamasaid");
        songsImage.add(R.drawable.mamasaid);
        songsWords.add(R.string.mamasaid);
        songsSource.add(R.raw.mamasaid);
        songs.add("actor");
        songsImage.add(R.drawable.actor);
        songsWords.add(R.string.actor);
        songsSource.add(R.raw.actor);
        songs.add("solong");
        songsImage.add(R.drawable.solong);
        songsWords.add(R.string.solong);
        songsSource.add(R.raw.solong);
        songs.add("jiuchan");
        songsImage.add(R.drawable.jiuchan);
        songsWords.add(R.string.jiuchan);
        songsSource.add(R.raw.jiuchan);
        songs.add("xiaoming");
        songsImage.add(R.drawable.xiaoming);
        songsWords.add(R.string.xiaoming);
        songsSource.add(R.raw.xiaoming);
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
