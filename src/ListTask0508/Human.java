package ListTask0508;

public class Human {
    private String name;
    private String surname;
    private int age;
    private int weight;
   private int heigh;
   private boolean gender;

    public Human(String name, String surname, int age, int weight, int heigh, boolean gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.heigh = heigh;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeigh() {
        return heigh;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", heigh=" + heigh +
                ", gender=" + gender +
                '}';
    }
}
