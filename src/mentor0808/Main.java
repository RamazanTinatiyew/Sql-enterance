package mentor0808;

public class Main {
    public static void main(String[] args) {
        Human namiq = new Human("Namiq","Namiqli");
        namiq.addCourse("Java",100.);
        namiq.addCourse("JavaScript",80.);
        namiq.addCourse("Phyton",100.);
        namiq.addCourse("Html",90.);
        namiq.addCourse("C++",30.);

        Human taleh = new Human("Taleh","Aghayev");
        taleh.addCourse("Java",100.);
        taleh.addCourse("JavaScript",99.);
        taleh.addCourse("C++",74.);
        taleh.addCourse("Piton",30.);
        taleh.addCourse("Html",80.);
        taleh.addCourse("Piton",40.);

        namiq.removeCourse("Java");
        System.out.println(namiq);
        System.out.println(namiq.getAvarage());
        taleh.removeCourse("Htm");
        System.out.println(taleh);
        System.out.println(taleh.getAvarage());
    }
}
