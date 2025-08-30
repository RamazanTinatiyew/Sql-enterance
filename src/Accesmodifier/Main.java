package Accesmodifier;

public class Main {
    public static void main(String[] args){
        MyClass huseyn = new MyClass("Huseyn","Mahmudov",12000);
        String huseynInfo = String.format("Salam %s %s, sizin balansiniz: %s", huseyn.getFirstName(),huseyn.getLastName(),huseyn.getBalans());
        System.out.println(huseynInfo);
        int canta = 340;
        huseyn.setBalans(huseyn.getBalans() - canta);
        System.out.println(String.format("Balansinizdan canta ucun %s azn cixildi.",canta));
        System.out.println("Guncel balans: " + huseyn.getBalans());
    }
}
