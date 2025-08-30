package mentor0808;

import java.util.HashMap;
import java.util.Map;

public class Human {
    private String name;
    private String surname;
    private Map<String, Double> courses = new HashMap<>();

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public Double getAvarage(){
        double totalAvarage = 0.;
        for(Double grade : courses.values()){
            totalAvarage+= grade;
        }
        return totalAvarage / courses.size();
    }
    public void removeCourse (String name){
        if (!courses.containsKey(name)) {
            System.out.println("Bu kurs siyahida yoxdur");
        }
        courses.remove(name);
    }
    public void replaceCourse(String id,double bal){
        if(courses.containsKey(id)){
            courses.replace(id,bal);
        }
        System.out.println("Deyisile bilmedi");
    }

    public void addCourse(String name, Double grade){
        courses.put(name, grade);
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

    public Map<String, Double> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, Double> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", courses=" + courses +
                '}';
    }

}
