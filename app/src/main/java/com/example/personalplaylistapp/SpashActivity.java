package com.example.personalplaylistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class SpashActivity extends AppCompatActivity {
    int playing;
    MediaPlayer mpSong1, mpSong2, mpSong3;
    Button btnPlaySong1, btnPlaySong2, btnPlaySong3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spash);

            btnPlaySong1 = (Button) findViewById(R.id.btnPlaySongOne);
            btnPlaySong2 = (Button) findViewById(R.id.btnPlaySongTwo);
            btnPlaySong3 = (Button) findViewById(R.id.btnPlaySongThree);

            mpSong1 = new MediaPlayer();
            mpSong1 = MediaPlayer.create(this, R.raw.antonvlasov_dubstep);
            mpSong2 = new MediaPlayer();
            mpSong2 = MediaPlayer.create(this, R.raw.elenamiv_once_again);
            mpSong3 = new MediaPlayer();
            mpSong3 = MediaPlayer.create(this, R.raw.romanstriga_popdance);
            playing = 0;

            btnPlaySong1.setOnClickListener(bSong1);
            btnPlaySong2.setOnClickListener(bSong2);
            btnPlaySong3.setOnClickListener(bSong3);
        }

        Button.OnClickListener bSong1 = new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                switch (playing) {
                    case 0:
                        mpSong1.start();
                        playing = 1;
                        btnPlaySong1.setText("Pause Dubstep");
                        btnPlaySong2.setVisibility(View.INVISIBLE);
                        btnPlaySong3.setVisibility(View.INVISIBLE);
                        break;
                    case 1:
                        mpSong1.pause();
                        playing = 0;
                        btnPlaySong1.setText("Play Dubstep");
                        btnPlaySong2.setVisibility(View.VISIBLE);
                        btnPlaySong3.setVisibility(View.VISIBLE);
                        break;
                }
            }
        };
        Button.OnClickListener bSong2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (playing) {
                    case 0:
                        mpSong2.start();
                        playing = 1;
                        btnPlaySong2.setText("Pause "+"Once Again");
                        btnPlaySong1.setVisibility(View.INVISIBLE);
                        btnPlaySong3.setVisibility(View.INVISIBLE);
                        break;
                    case 1:
                        mpSong2.pause();
                        playing = 0;
                        btnPlaySong2.setText("Play "+"Once Again");
                        btnPlaySong1.setVisibility(View.VISIBLE);
                        btnPlaySong3.setVisibility(View.VISIBLE);
                        break;
                }
            }
        };
        Button.OnClickListener bSong3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(playing) {
                    case 0:
                        mpSong3.start();
                        playing = 1;
                        btnPlaySong3.setText("Pause Popdance");
                        btnPlaySong1.setVisibility(View.INVISIBLE);
                        btnPlaySong2.setVisibility(View.INVISIBLE);
                        break;
                    case 1:
                        mpSong3.pause();
                        playing = 0;
                        btnPlaySong3.setText("Play Popdance");
                        btnPlaySong1.setVisibility(View.VISIBLE);
                        btnPlaySong2.setVisibility(View.VISIBLE);
                        break;
                }
            }
        };





        /*
        TimerTask task = new TimerTask(){

            @Override
            public void run() {
                finish();
                startActivity(new Intent(SpashActivity.this,MainActivity.class));
            }
        };
        Timer opening = new Timer();
        opening.schedule(task,5000);*/
        }

