package Practice210825;

import LessonComparator200825.Movies;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Hobbi> hb = new ArrayList<>();
        hb.add(new Hobbi("Ucmaq",50));
        hb.add(new Hobbi("Qacmaq",13));
        hb.add(new Hobbi("Uzmek",20));
        hb.add(new Hobbi("Yerimek",6));

        ArrayList<Human> hum = new ArrayList<>();
        hum.add(new Human("Maykl",18,Arrays.asList("Uzmek","Tullanmaq","Ucmaq")));
        hum.add(new Human("John",30,Arrays.asList("Ezmek","Yerimek","Ucmaq")));
        hum.add(new Human("Janitin",15,Arrays.asList("Uzmek","Tullanmaq","Ucmaq","Qacmaq")));
        hum.add(new Human("Maykl",20,Arrays.asList("Kitab oxumaq","Dayanmaq","Avtobusa minmek")));

        for (Human h : hum) {
            h.getHobbies().removeIf(hobiAd -> {
                for (Hobbi hobi : hb) {
                    if (hobi.getHobbiName().equals(hobiAd)) {
                        return h.getAge() < hobi.getAges();
                    }
                }
                return false; // hobi tapılmasa, silinmir
            });
            System.out.println(hum);


        }

    }}
//    public static void main(String[] args) {
//        int[] a = {1,24,54,65,76,887,565,454,43,78,90,90};
//        int b =0;
//        int c = 0;
//        for (int i = 0; i < a.length; i++) {
//            if(a[i]>b){
//                b=a[i];
//            }
//            if(c<a[i] && c<b){
//                c=a[i];
//            }
//        }
//        System.out.println(b);
//        System.out.println(c);
//    }

