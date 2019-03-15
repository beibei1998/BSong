package com.example.bsong;

/**
 * Created by 张贝贝 on 2017/9/18.
 */

public class CurrentSong {
    public static String currentSong=" ";
    public static void setCurrentSong(String name){
        currentSong=name;
    }
    public static String getCurrentSong(){
        return currentSong;
    }
}
