package com.example.animals_application;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView chatImage, chienImage, lionImage, aneImage, oiseauImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chatImage = findViewById(R.id.chatImage);
        chienImage = findViewById(R.id.chienImage);
        lionImage = findViewById(R.id.lionImage);
        aneImage = findViewById(R.id.aneImage);
        oiseauImage = findViewById(R.id.oiseauImage);

        chatImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.chat);
                mediaPlayer.start();
            }
        });

        chienImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.chien);
                mediaPlayer.start();
            }
        });

        lionImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.lion);
                mediaPlayer.start();
            }
        });

        aneImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ane);
                mediaPlayer.start();
            }
        });

        oiseauImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.oiseau);
                mediaPlayer.start();
            }
        });
    }
}
