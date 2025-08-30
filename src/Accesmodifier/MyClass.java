package Accesmodifier;

public class MyClass {
    private String firstName;
    private String lastName;
    private int age;
    private boolean gender;
    private int balans;

    public MyClass(String firstName1,String lastName1,int balans1){
        this.firstName = firstName1;
        this.lastName = lastName1;
        this.balans = balans1;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBalans() {
        return balans;
    }
    public void setBalans(int balans) {
        this.balans = balans;
    }

    public MyClass(){

    }



//    private void sayHi(String name){
//        System.out.println("Hi" + name);
//    }
//    private void sayBye(String name){
//        System.out.println("Bye" + name);
//    }
//    public void sayEverything(String name){
//        sayHi(name);
//        sayBye(name);
//    }
}
