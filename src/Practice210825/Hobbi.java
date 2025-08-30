package Practice210825;

public class Hobbi {
    private String hobbiName;
    private int ages;

    public Hobbi(String hobbiName, int ages) {
        this.hobbiName = hobbiName;
        this.ages = ages;
    }

    public String getHobbiName() {
        return hobbiName;
    }

    public void setHobbiName(String hobbiName) {
        this.hobbiName = hobbiName;
    }

    public int getAges() {
        return ages;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }

    @Override
    public String toString() {
        return "Hobbi{" +
                "hobbiName='" + hobbiName + '\'' +
                ", age=" + ages +
                '}';
    }
}
