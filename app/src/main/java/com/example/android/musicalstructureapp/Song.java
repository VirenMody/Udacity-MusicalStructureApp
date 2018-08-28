package com.example.android.musicalstructureapp;

/**
 * The Song class represents a song in the user's music app.
 * It contains 2 fields: song name and artist name
 */
public class Song {

    private String mSongName;
    private String mArtistName;

    /**
     * Constructor for Song objects
     *
     * @param songName is the name of the song
     * @param artistName is the name of the artist who wrote/sings the song
     */
    public Song (String songName, String artistName) {
        mSongName = songName;
        mArtistName = artistName;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getArtistName() {
        return mArtistName;
    }
}
