package com.cruso.mycity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView hotel = findViewById(R.id.hotel);
        final ImageView rest = findViewById(R.id.resturant);
        final ImageView health=findViewById(R.id.health);
        final ImageView visit=findViewById(R.id.visit);
        final ImageView school=findViewById(R.id.school);
        final ImageView about=findViewById(R.id.about);

        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start the next activity with shared element transition
                Intent intent = new Intent(MainActivity.this, hotel.class);
                ActivityOptions options = ActivityOptions
                        .makeSceneTransitionAnimation(MainActivity.this, hotel, "sharedImage");
                startActivity(intent, options.toBundle());
            }
        });
        rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start the next activity with shared element transition
                Intent intent = new Intent(MainActivity.this, rest.class);
                ActivityOptions options = ActivityOptions
                        .makeSceneTransitionAnimation(MainActivity.this, rest, "sharedImage");
                startActivity(intent, options.toBundle());
            }
        });
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start the next activity with shared element transition
                Intent intent = new Intent(MainActivity.this, health.class);
                ActivityOptions options = ActivityOptions
                        .makeSceneTransitionAnimation(MainActivity.this, health, "sharedImage");
                startActivity(intent, options.toBundle());
            }
        });
        visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start the next activity with shared element transition
                Intent intent = new Intent(MainActivity.this, visit.class);
                ActivityOptions options = ActivityOptions
                        .makeSceneTransitionAnimation(MainActivity.this, visit, "sharedImage");
                startActivity(intent, options.toBundle());
            }
        });
        school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start the next activity with shared element transition
                Intent intent = new Intent(MainActivity.this, school.class);
                ActivityOptions options = ActivityOptions
                        .makeSceneTransitionAnimation(MainActivity.this, school, "sharedImage");
                startActivity(intent, options.toBundle());
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start the next activity with shared element transition
                Intent intent = new Intent(MainActivity.this, about.class);
                ActivityOptions options = ActivityOptions
                        .makeSceneTransitionAnimation(MainActivity.this, about, "sharedImage");
                startActivity(intent, options.toBundle());
            }
        });
    }
}
