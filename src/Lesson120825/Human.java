package Lesson120825;

public class Human <T> {
    private T field;

    public Human() {
    }

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "Human{" +
                "field=" + field +
                '}';
    }
}
