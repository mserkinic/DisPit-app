package com.example.dispit_576;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Najblizi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_najblizi);
;
        Button homeButton = findViewById(R.id.homeButton);
        Button nearButton = findViewById(R.id.nearButton);
        Button searchButton = findViewById(R.id.searchButton);
        Button trendingButton = findViewById(R.id.trendingButton);
        ImageView logo = findViewById(R.id.logo);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // What we want to display when button is clicked
                Intent intentMain = new Intent(Najblizi.this ,
                        MainActivity.class);
                Najblizi.this.startActivity(intentMain);
                Log.i("Content "," Main layout ");
            }
        });
        Button profileButton = findViewById(R.id.profileButton);
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // What we want to display when button is clicked
                Intent intentMain = new Intent(Najblizi.this ,
                        MainProfile.class);
                Najblizi.this.startActivity(intentMain);
                Log.i("Content "," Main layout ");
            }
        });
        //Event listener for near button
        nearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // What we want to display when button is clicked
                Intent intentMain = new Intent(Najblizi.this ,
                        Najblizi.class);
                Najblizi.this.startActivity(intentMain);
                Log.i("Content "," Main layout ");
            }
        });
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // What we want to display when button is clicked
                Intent intentMain = new Intent(Najblizi.this ,
                        Trazi.class);
                Najblizi.this.startActivity(intentMain);
                Log.i("Content "," Main layout ");
            }
        });

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // What we want to display when button is clicked
                Intent intentMain = new Intent(Najblizi.this ,
                        MainActivity.class);
                Najblizi.this.startActivity(intentMain);
                Log.i("Content "," Main layout ");
            }
        });
        trendingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // What we want to display when button is clicked
                Intent intentMain = new Intent(Najblizi.this ,
                        MainActivity.class);
                Najblizi.this.startActivity(intentMain);
                Log.i("Content "," Main layout ");
            }
        });
    }
}