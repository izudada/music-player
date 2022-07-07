package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ReggeaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        ArrayList<Music> songs = new ArrayList<Music>();

        songs.add(new Music("Available", "Patoranking"));
        songs.add(new Music("Worth His Weight in Gold (Rally Round)", "Steel Pulse"));
        songs.add(new Music("I'm Still In Love With You", "Sean Paul"));
        songs.add(new Music("No Weapon Formed Against Me Shall Prosper", "Africason"));
        songs.add(new Music("Footprints", "T.O.K."));
        songs.add(new Music("I've Got You Babe", "Lucky Dube"));
        songs.add(new Music("Love and Affection", "Pressure"));
        songs.add(new Music("I No Fit Shout", "Busy Signal"));
        songs.add(new Music("Iron Lion Zion", "Bob Marley & The Wailers"));
        songs.add(new Music("Sweet Sensation", "Orezi"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        MusicAdapter adapter = new MusicAdapter(this, songs);

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