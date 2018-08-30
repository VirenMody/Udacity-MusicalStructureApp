package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Retrieve the TextView for Now Playing Activity and attach an onClicklistener to it
        TextView nowPlaying = (TextView) findViewById(R.id.now_playing);
        nowPlaying.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        // Retrieve the TextView for All Music List Shuffled Activity and attach an onClicklistener to it
        TextView musicShuffled = (TextView) findViewById(R.id.music_library);
        musicShuffled.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent allMusicShuffledIntent = new Intent(MainActivity.this, MusicLibraryActivity.class);
                startActivity(allMusicShuffledIntent);
            }
        });

    }
}
