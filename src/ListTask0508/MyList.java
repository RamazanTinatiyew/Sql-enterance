package ListTask0508;

import java.util.List;

public class MyList {
    public static void main(String[] args) {
        Human zeynal = new Human("Zeynal","Hesenov",12,50,130,true);
        Human melik = new Human("Melik","Melikov",13,60,125,true);
        Human zeyneb = new Human("Zeyneb","Zeynebli",30,55,150,false);
        Human tofiq = new Human("Tofiq","Tofiqli",40,80,190,true);
        Human aylin = new Human("Aylin","Aliyeva",24,48,160,false);
        Human sema = new Human("Sema","Hesenli",19,45,173,false);

        List<Human> adam = List.of(zeynal,melik,zeyneb,tofiq,aylin,sema);
        List<Human> adam2 = List.copyOf(adam);
        System.out.println(adam);
        String convert;
        for (Human e : adam){
            convert = e.isGender() ? "bey": "xanim";
            System.out.println(String.format("adiniz: %s soyadiniz: %s yasiniz: %s cinsiniz: %s",e.getName(),e.getSurname(),e.getAge(),convert));
        }
        float yas=0.0f;
        for (Human s : adam) {
            yas += s.getAge();
        }
        System.out.println(yas/adam.size());
    }
}
