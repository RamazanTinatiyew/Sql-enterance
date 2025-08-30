package mentor130825;

public class FerqiYoxdu {
    private String first; //world
    private String second;//hello

    public FerqiYoxdu(String first, String second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "FerqiYoxdu{" +
                "first='" + first + '\'' +
                ", second='" + second + '\'' +
                '}';
    }

    public String swap(){
        if(first != null && second != null){
            if(!first.equals(second)) {
                String temp = first;
                first = second;
                second = temp;
            }
        }
        return first + second;
    }
}
