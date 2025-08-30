package Lesson140825;

public class Main {
    public static void main(String[] args) {
        Custom c = (int a, int b) ->{
            int z = a+b;
            int d = z/2;
            int n = d/a;
            System.out.println(n);
            };
            c.calc(6,7);
        }
    }

