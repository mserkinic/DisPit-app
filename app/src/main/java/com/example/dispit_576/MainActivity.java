package com.example.dispit_576;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private static int flag = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button homeButton = findViewById(R.id.homeButton);
        Button nearButton = findViewById(R.id.nearButton);
        Button searchButton = findViewById(R.id.searchButton);
        Button trendingButton = findViewById(R.id.trendingButton);
        ImageView logo = findViewById(R.id.logo);

        Button profileButton = findViewById(R.id.profileButton);
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // What we want to display when button is clicked
                Intent intentMain = new Intent(MainActivity.this ,
                        MainProfile.class);
                MainActivity.this.startActivity(intentMain);
                Log.i("Content "," Main layout ");
            }
        });


        //Event listener for home button
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // What we want to display when button is clicked
                Intent intentMain = new Intent(MainActivity.this ,
                        MainActivity.class);
                MainActivity.this.startActivity(intentMain);
                Log.i("Content "," Main layout ");
            }
        });
        //Event listener for near button
        nearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // What we want to display when button is clicked
                Intent intentMain = new Intent(MainActivity.this ,
                        Najblizi.class);
                MainActivity.this.startActivity(intentMain);
                Log.i("Content "," Main layout ");
            }
        });
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // What we want to display when button is clicked
                Intent intentMain = new Intent(MainActivity.this ,
                        Trazi.class);
                MainActivity.this.startActivity(intentMain);
                Log.i("Content "," Main layout ");
            }
        });

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // What we want to display when button is clicked
                Intent intentMain = new Intent(MainActivity.this ,
                        MainActivity.class);
                MainActivity.this.startActivity(intentMain);
                Log.i("Content "," Main layout ");
            }
        });
        trendingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // What we want to display when button is clicked
                Intent intentMain = new Intent(MainActivity.this ,
                        MainActivity.class);
                MainActivity.this.startActivity(intentMain);
                Log.i("Content "," Main layout ");
            }
        });


    }

    static void showSnackbar(View view, String message, int duration)
    {
        Snackbar.make(view, message, duration).show();
    }
}