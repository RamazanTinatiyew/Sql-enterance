package Lesson130825;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Human hm = new Human("Hasan","Hasanli");
        Human hm2 = new Human("Hasan","Hasanli");
        Set<Human> humans = Set.of(hm,hm2);
        System.out.println(humans);
    }
}
