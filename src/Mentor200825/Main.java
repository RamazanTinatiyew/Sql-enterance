package Mentor200825;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            System.out.println(plus18(a));
        } catch (MyExClass r) {
            System.out.println(r.getMessage());
        }
    }

    public static Boolean plus18(Integer age) {
        if (age == 0) throw new MyExClass("Yashiniz 0 ola bilmez");
        if (age > 18) {
            return true;

        }
        return false;
    }
}



//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    while (true ){
//        try {
//            System.out.println("Yashinizi daxil edin");
//            int yas = sc.nextInt();
//            if(yas >0 && yas <100){
//                System.out.println("yasiniz: " + yas);
//                break;
//            }else{
//                System.out.println("yasinizi duzgun daxil edin");
//            }
//        } catch (InputMismatchException ar) {
//            System.out.println("herf daxil etmek olmaz " + ar.getCause());
//            sc.nextLine();
//        }
//    }
//}
//}


//    public static void main(String[] args) throws ArithmeticException{
//        Scanner sc = new Scanner(System.in);
//        int a = 5;
//        int b;
//        try{
//            b = sc.nextInt();
//            System.out.println(a/b);
//        } catch (InputMismatchException ar){
//            System.out.println("herf daxil etmek olmaz " + ar.getCause());
//        }catch (ArithmeticException u){
//            System.out.println("0-a bolmek olmaz");
//        }
//    }

