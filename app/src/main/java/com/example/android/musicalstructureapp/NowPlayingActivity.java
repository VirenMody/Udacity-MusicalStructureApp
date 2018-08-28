package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if(null == extras) {
            Toast.makeText(this, "Please go back and select a song first!", Toast.LENGTH_SHORT).show();
        }
        else {
            String songName = extras.getString("SONG_NAME");
            String artistName = extras.getString("ARTIST_NAME");

            ((TextView) findViewById(R.id.song_name)).setText(songName);
            ((TextView) findViewById(R.id.artist_name)).setText(artistName);
        }
    }
}
