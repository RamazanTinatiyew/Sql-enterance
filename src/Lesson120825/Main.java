package Lesson120825;

public class Main {

    public static void main(String[] args) {
        Human<String> hm = new Human<>();
        hm.setField("Hesterxan");
        System.out.println(hm.getField());
        Customer cs = new Customer("Namew","Surname");
        Human<Customer> hm2 = new Human<>();
        hm2.setField(cs);
    }
}
