package Interfeys04082025;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Detective[] detective = {
                new FingerPrint(),
                new FootPrint(),
                new Blood(),
                new Hair()
        };

        for (int i = 0; i < detective.length; i++) {
            detective[i].analyze();
        }
        System.out.println();
        for (Detective detective1 : detective) {
            detective1.analyze();
        }
        System.out.println("");
        for(Detective e : detective ){
            e.analyze();
        }






//        String[] kateqoriya = {"horror","comedy","fantastic"};
//        MyFilmImp s = new MyFilmImp("Joker",kateqoriya, LocalDate.parse("2020-01-03"));
//        System.out.println(s);
    }
}
