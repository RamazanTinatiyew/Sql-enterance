package MentorTime0608;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> ilkSet = new HashSet<>();
        Set<Integer> ikinciSet = new HashSet<>();
        ilkSet.add(1);
        ilkSet.add(2);
        ilkSet.add(3);
        ilkSet.add(2);
        ilkSet.add(5);
        ilkSet.add(6);
        ikinciSet.add(1);
        ikinciSet.add(2);
        ikinciSet.add(3);
        ikinciSet.add(7);
        ikinciSet.add(9);

//        ilkSet.retainAll(ikinciSet);
//        System.out.println(ilkSet);
        ilkSet.removeAll(ikinciSet);
        System.out.println(ilkSet);










//        List<Integer> eded = new ArrayList<>();
//        eded.add(1);
//        eded.add(2);
//        eded.add(3);
//        eded.add(2);
//        eded.add(4);
//        eded.add(7);
//        eded.add(8);
//        eded.add(4);
//        eded.add(5);
//        eded.add(9);
//        eded.add(9);
//        eded.add(2);
//        eded.add(6);
//
//        Set<Integer> mySet = new HashSet<>();
//        Set<Integer> tekrarlananElementler = new HashSet<>();
//        for (Integer reqem : eded){
//            if(!mySet.add(reqem)){
//                tekrarlananElementler.add(reqem);
//            }
//        }
//
//        System.out.println(mySet);
//        System.out.println(tekrarlananElementler);

    }
}
