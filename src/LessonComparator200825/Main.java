package LessonComparator200825;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //Movie class works
//        ArrayList<Movie> movies = new ArrayList<>();
//        movies.add(new Movie("Batman",8.6,2003));
//        movies.add(new Movie("Spiderman",7.9,2006));
//        movies.add(new Movie("Logan",5.9,2002));
//        movies.add(new Movie("Avengers",9.4,2001));
//        Collections.sort(movies);
//        System.out.println(movies);
                //Rating Class works && namecomparator
        ArrayList<Movies> movi = new ArrayList<>();
        movi.add(new Movies("Batman",8.6,2003));
        movi.add(new Movies("Spiderman",7.9,2006));
        movi.add(new Movies("Logan",5.9,2002));
        movi.add(new Movies("Avengers",9.4,2001));
        Collections.sort(movi,new Rating());
        Collections.sort(movi,new NameComparator());
        System.out.println(movi);
    }
}
