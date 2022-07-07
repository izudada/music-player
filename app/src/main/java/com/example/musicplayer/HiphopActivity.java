package com.example.musicplayer;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class HiphopActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        ArrayList<Music> hiphopSongs = new ArrayList<Music>();

        hiphopSongs.add(new Music("FEM", "Davido"));
        hiphopSongs.add(new Music("Nobody", "DJ Neptune, Joeboy & Mr Eazi"));
        hiphopSongs.add(new Music("Slow Bones", "Tony Allen & Hugh Masekela"));
        hiphopSongs.add(new Music("Bank On It", "Burna Boy"));
        hiphopSongs.add(new Music("ELI", "Fireboy DML"));
        hiphopSongs.add(new Music("Fantasy", "Niniola ft. Femi Kuti"));
        hiphopSongs.add(new Music("Green Light", "Olamide"));
        hiphopSongs.add(new Music("Ginger", "Wizkid feat. Burna Boy"));
        hiphopSongs.add(new Music("Isolate", "Teni & DJ Neptune"));
        hiphopSongs.add(new Music("Away", "Oxlade"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        MusicAdapter adapter = new MusicAdapter(this, hiphopSongs);

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
