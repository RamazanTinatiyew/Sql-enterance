package MentorTime120825;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 30; i+=2) {
            System.out.println("");
            for (int k = 28; k >i ; k-=2) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        }
        for (int i = 0; i <29; i+=2) {
            System.out.println("");
            for (int k = 0; k<i+1; k+=2) {
                System.out.print(" ");
            }
            for (int j = 27; j > i; j--) {
                System.out.print("*");
            }
        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Eded daxil edin");
//        int a = sc.nextInt();
//        while(a>0){
//        System.out.println(a%10);
//        a/=10;}
//        for(int b= sc.nextInt();b>0;b/=10){
//            System.out.println(b%10);
//        }
    }
}
