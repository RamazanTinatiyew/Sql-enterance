package MentorStream190825;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> box = Arrays.asList("Red","Blue","Yellow","Green","Purple");
        List<Integer> x = Arrays.asList(1,2,3,4,65,87,9,8,76,54,23,21,20,67,45,3,8,9,15);
        List<Integer> newx = x.stream().filter(s->s> 20).map(s->s+20).toList();
        System.out.println(newx);
        List<String> lists = Arrays.asList("Taleh","Togrul","Nergiz","Aytac","Akshin","Vusal","Togrul","Ramazan","Akshin","Akshin","Vusal","Aytac");
        lists.stream().filter(s -> s.length()>5).distinct().map(String::toUpperCase).sorted().toList().stream().skip(1).limit(2).forEach(e -> System.out.print(e + " "));
    }
}
