package com.example.launchpad;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mainkan1(View view){
        MediaPlayer launchpad = MediaPlayer.create(this, R.raw.c1);
        launchpad.start();
    }

    public void mainkan2(View view){
        MediaPlayer launchpad = MediaPlayer.create(this, R.raw.c2);
        launchpad.start();
    }

    public void mainkan3(View view){
        MediaPlayer launchpad = MediaPlayer.create(this, R.raw.c3);
        launchpad.start();
    }

    public void mainkan4(View view){
        MediaPlayer launchpad = MediaPlayer.create(this, R.raw.c4);
        launchpad.start();
    }

    public void mainkan5(View view){
        MediaPlayer launchpad = MediaPlayer.create(this, R.raw.c5);
        launchpad.start();
    }

    public void mainkan6(View view){
        MediaPlayer launchpad = MediaPlayer.create(this, R.raw.c6);
        launchpad.start();
    }

    public void mainkan7(View view){
        MediaPlayer launchpad = MediaPlayer.create(this, R.raw.c7);
        launchpad.start();
    }

    public void mainkan8(View view){
        MediaPlayer launchpad = MediaPlayer.create(this, R.raw.c8);
        launchpad.start();
    }

    public void mainkan9(View view){
        MediaPlayer launchpad = MediaPlayer.create(this, R.raw.c9);
        launchpad.start();
    }

    public void mainkana(View view){
        MediaPlayer launchpad = MediaPlayer.create(this, R.raw.ca);
        launchpad.start();
    }

    public void mainkanb(View view){
        MediaPlayer launchpad = MediaPlayer.create(this, R.raw.cb);
        launchpad.start();
    }

    public void mainkanc(View view){
        MediaPlayer launchpad = MediaPlayer.create(this, R.raw.cc);
        launchpad.start();
    }
}
