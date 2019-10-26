package ca.douglascollege.songlist;



import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Integer> imageList = new ArrayList<>();
    List<String> songList = new ArrayList<>();

    private void addItems()
    {
        imageList.add(R.drawable.bagpipes);
        imageList.add(R.drawable.celtic);
        imageList.add(R.drawable.cows);
        imageList.add(R.drawable.drums);
        imageList.add(R.drawable.hawaii);
        imageList.add(R.drawable.jig);
        imageList.add(R.drawable.pigs);
        imageList.add(R.drawable.ukulele);

        songList.add("Bagpipes");
        songList.add("Celtic");
        songList.add("Cows");
        songList.add("Drums");
        songList.add("Hawaii");
        songList.add("Jig");
        songList.add("Pigs");
        songList.add("Ukulele");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addItems();
        ListView listViewItems = findViewById(R.id.listViewSongs);
        listViewItems.setAdapter( new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, songList));
        listViewItems.setAdapter(new Adapter(this,songList, imageList));
    }
}
