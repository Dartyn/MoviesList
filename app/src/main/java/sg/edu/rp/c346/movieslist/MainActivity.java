package sg.edu.rp.c346.movieslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMovies;
    ArrayList<ToDoItem> movieList;
    CustomAdapter caMovie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovies = (ListView)findViewById(R.id.listViewMovieList);
        movieList = new ArrayList<ToDoItem>();

        caMovie = new CustomAdapter(this, R.layout.movieitem_row, movieList);
        lvMovies.setAdapter(caMovie);

        ToDoItem movie1 = new ToDoItem("War of the plant of the Apes.","A 2017 sequel of the planet of the Apes science fiction franchise by French author Pierre Boulle's");
        movieList.add(movie1);

        ToDoItem movie2 = new ToDoItem("King Kong","Movie abour a giant ape, created by American filmmaker Merian C. Cooper that appear in 1930s");
        movieList.add(movie2);
    }
}
