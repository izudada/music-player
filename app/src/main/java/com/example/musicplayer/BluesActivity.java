package com.example.musicplayer;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class BluesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        ArrayList<Music> blueSongs = new ArrayList<Music>();

        blueSongs.add(new Music("Baby", "Joeboy"));
        blueSongs.add(new Music("What if I say", "Fireboy DML"));
        blueSongs.add(new Music("Better", "Nonso Amadi ft Simi"));
        blueSongs.add(new Music("Ayo", "Simi"));
        blueSongs.add(new Music("The beginning", "Asa"));
        blueSongs.add(new Music("Monalisa", "Lyta"));
        blueSongs.add(new Music("Before you wake up", "Adekunle Gold"));
        blueSongs.add(new Music("Finding efe", "Johhny Drille"));
        blueSongs.add(new Music("Johnbull", "Brymo"));
        blueSongs.add(new Music("Count on you", "Johhny Drille"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        MusicAdapter adapter = new MusicAdapter(this, blueSongs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

    }
}
