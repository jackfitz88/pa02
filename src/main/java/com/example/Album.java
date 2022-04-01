package com.example;

import java.util.ArrayList;

public class Album implements Comparable<Album> {
    //change ints to Integers
    protected Integer numID;
    protected Integer numSongs;
    protected String title;
    protected ArrayList<String> artistNames;

    public Album(int numID, int numSongs, String title, ArrayList<String> artistNames){
        this.numID = numID;
        this.numSongs = numSongs;
        this.title = title;
        this.artistNames = new ArrayList<>();
    }

    public int getNumID() {
        return numID;
    }

    public void setNumID(int numID) {
        this.numID = numID;
    }

    public int getNumSongs() {
        return numSongs;
    }

    public void setNumSongs(int numSongs) {
        this.numSongs = numSongs;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtistNames(ArrayList<String> artistNames) {
        String i = "";
        for(String j : artistNames){
            i = j;
            System.out.println(i + ", ");
        }

        return i;
    }

    public void setArtistNames(ArrayList<String> artistNames) {
        this.artistNames = artistNames;
    }

    @Override
    public String toString() {
        return this.numID + ": " + this.numSongs + " -- " + "[ " + getArtistNames(this.artistNames) + " ]";
    }

    @Override
    public int compareTo(Album j){
        return this.numSongs.compareTo(j.numSongs);
        // if(this.numSongs < j.numSongs){
        //     return -1;
        // }
        // else if(this.numSongs > j.numSongs){
        //     return 1;
        // }
        // else{
        //     return 0;
        // }
            
    }

    

    

    
    
}
