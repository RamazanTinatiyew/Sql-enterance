package Interfeys04082025;

import java.time.LocalDate;
import java.util.Arrays;

public class MyFilmImp implements Film{
    private String filmAdi;
    private String[] category;
    private LocalDate il;


    @Override
    public String filmAdi() {
        return this.filmAdi;
    }

    @Override
    public String[] category() {
        return category;
    }

    @Override
    public LocalDate il() {
        return this.il;
    }

    public MyFilmImp(String filmAdi, String[] category, LocalDate il) {
        this.filmAdi = filmAdi;
        this.category = category;
        this.il = il;
    }

    @Override
    public String toString() {
        return "MyFilmImp{" +
                "filmAdi='" + filmAdi + '\'' +
                ", category=" + Arrays.toString(category) +
                ", il=" + il +
                '}';
    }
}
