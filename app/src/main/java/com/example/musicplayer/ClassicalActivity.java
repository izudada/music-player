package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ClassicalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        ArrayList<Music> classicalSongs = new ArrayList<Music>();

        classicalSongs.add(new Music("Glass Houses", "Ann Southam"));
        classicalSongs.add(new Music("Appalachian Spring", "Aaron Copland"));
        classicalSongs.add(new Music("Piano Concerto No. 2 in C minor, Op. 18", "Sergei Rachmaninoff"));
        classicalSongs.add(new Music("Also Sprach Zarathustra, Op. 30", "Richard Strauss"));
        classicalSongs.add(new Music("Carmen", "Georges Bizet"));
        classicalSongs.add(new Music("Nocturne in B-flat minor, Op. 9, No. 1", "Frédéric Chopin"));
        classicalSongs.add(new Music("Piano Quartet No. 1, Op. 25", " Johannes Brahms"));
        classicalSongs.add(new Music("'Du bist die Ruh,' D. 776", "Franz Schubert"));
        classicalSongs.add(new Music("Symphony No. 5 in C Minor, Op. 67", "Ludwig van Beethoven"));
        classicalSongs.add(new Music("Suite No. 1 in G major for unaccompanied cello, BWV 1007", "J.S. Bach"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        MusicAdapter adapter = new MusicAdapter(this, classicalSongs);

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