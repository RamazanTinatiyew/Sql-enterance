package Yolka;

public class Main {
    public static void main(String[] args) {

        for (int r = 0; r < 25; r+=2) {

            for (int n = 23; n > r-1; n-=2) {
                System.out.print(" ");
            }
        System.out.print("*/");
            if(r!=24) {
                for (int i = 0; i < r/2; i++) {
                    System.out.print("/");
                }for (int i = 0; i < r/2; i++) {
                    System.out.print("\\");
                }
            }
            if (r==24) {
                System.out.print("////////////\\\\\\\\\\\\\\\\\\\\\\\\");
            }
            System.out.println("\\*");
        }


        // Ilk yolka
        for (int j = 0; j < 25; j+=2) {

            for (int k = 23; k > j-1; k-=2) {
                System.out.print(" ");
            }
            for (int i = 1; i < j ; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
