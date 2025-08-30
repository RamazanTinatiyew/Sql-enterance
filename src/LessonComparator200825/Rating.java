package LessonComparator200825;
import java.util.Comparator;

public class Rating implements Comparator<Movies> {
    @Override
    public int compare(Movies o1, Movies o2) {
       // return Double.compare(o1.getRating(), o2.getRating());
        return (int) ((o1.getRating()- o2.getRating()) * 10);
    }
}
