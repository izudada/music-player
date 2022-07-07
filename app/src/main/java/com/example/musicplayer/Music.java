package com.example.musicplayer;

public class Music {
    /**   Song variable*/
    private String mSong;

    /**  Artist variable*/
    private String mArtist;

    public  Music(String song, String artist) {
        mSong = song;
        mArtist = artist;
    }

    /** Get the artist for a particular song */
    public String getArtist() {
        return mArtist;
    }

    /** Get the song by a particular artist*/
    public String getSong() {
        return mSong;
    }
}
