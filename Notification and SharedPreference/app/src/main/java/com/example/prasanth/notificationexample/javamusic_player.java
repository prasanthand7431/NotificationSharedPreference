package com.example.prasanth.notificationexample;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class javamusic_player extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_player);
        mediaPlayer=MediaPlayer.create(javamusic_player.this,R.raw.abc);

    }
    public void stat(View view) {

        mediaPlayer.start();

    }

    public void pausee(View view) {

        mediaPlayer.pause();

        }

    public void stopp(View view) {

        mediaPlayer.stop();

        }

    public void goues(View view) {

        Intent intent=new Intent(javamusic_player.this,sharedpreference.class);
        startActivity(intent);
    }
}
