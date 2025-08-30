package Varislik;

public class Cocux extends Mother{
    public void run() {
        System.out.println("I can run.");
    }

    @Override
    public void talk() {
        super.talk();
        System.out.println("I can't talk");;
    }
}
