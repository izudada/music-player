package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  Get all text views
        TextView reggeaTextView = (TextView) findViewById(R.id.reggea);
        TextView bluesTextView = (TextView) findViewById(R.id.blues);
        TextView hiphopTextView = (TextView) findViewById(R.id.hiphop);
        TextView classicalTextView = (TextView) findViewById(R.id.classical);

        // Onclick listener on reggeaTextView
        reggeaTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reggeaActivity = new Intent(MainActivity.this, ReggeaActivity.class);
                startActivity(reggeaActivity);
            }
        });

    }
}