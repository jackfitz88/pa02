package com.example;

import java.util.ArrayList;

public class Album implements Comparable<Album> {
    protected int numID;
    protected int numSongs;
    protected String title;
    protected ArrayList<String> artistNames;

    public Album(int numID, int numSongs, String title, ArrayList<String> artistNames){
        this.numID = numID;
        this.numSongs = numSongs;
        this.title = title;
        this.artistNames = new ArrayList<>();
    }

    @Override
    public String toString() {
        return this.numID + ": " + this.numSongs + " -- " + "[ " + this.artistNames + " ]";
    }

    @Override
    public int compareTo(Album j){
        if(this.numSongs < j.numSongs){
            return -1;
        }
        else if(this.numSongs > j.numSongs){
            return 1;
        }
        else{
            return 0;
        }
            
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

    public ArrayList<String> getArtistNames() {
        return artistNames;
    }

    public void setArtistNames(ArrayList<String> artistNames) {
        this.artistNames = artistNames;
    }

    

    
    
}
