package Rekursiya;

public class Sayac {
    public static void counter(int start){
        System.out.println(start);
        start++;
        if(start<=10){
            counter(start);
        }
    }
}
