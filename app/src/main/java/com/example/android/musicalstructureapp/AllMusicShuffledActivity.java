package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

import java.util.ArrayList;

public class AllMusicShuffledActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_music_shuffled);

        // Populate the list of songs and their artists
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Everything", "Lifehouse"));
        songs.add(new Song("Dirty Pop", "NSYNC"));
        songs.add(new Song("Baby Beluga", "Raffi"));
        songs.add(new Song("Slide", "Goo Goo Dolls"));
        songs.add(new Song("Jumper", "Third Eye Blind"));
        songs.add(new Song("Better Together", "Jack Johnson"));
        songs.add(new Song("Thriller", "Michael Jackson"));
        songs.add(new Song("What a Wonderful World", "Louis Armstrong"));
        songs.add(new Song("Uptown Funk", "Bruno Mars"));
        songs.add(new Song("Viva La Vida", "Cold Play"));

        SongAdapter songAdapter = new SongAdapter(this, songs);
        ListView songListView = (ListView) findViewById(R.id.song_list);
        songListView.setAdapter(songAdapter);

        songListView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long arg) {

                Song songData = (Song)adapter.getItemAtPosition(position);

                Bundle extras = new Bundle();
                extras.putString("SONG_NAME", songData.getSongName());
                extras.putString("ARTIST_NAME", songData.getArtistName());

                Intent nowPlayingIntent = new Intent(AllMusicShuffledActivity.this, NowPlayingActivity.class);
                nowPlayingIntent.putExtras(extras);
                startActivity(nowPlayingIntent);
            }
        });
    }
}
